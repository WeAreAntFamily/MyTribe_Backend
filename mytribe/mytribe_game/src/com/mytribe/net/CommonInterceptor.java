package com.mytribe.net;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.mytribe.server.WebServer;
import com.mytribe.setting.WebSystemSetting;
import com.mytribe.types.ServerRunningType;
import com.mytribe.types.TipsType;
import com.mytribe.util.JsonUtils;

public class CommonInterceptor extends HandlerInterceptorAdapter {
	/**
	 * 存储 http最后一次请求的时间 key=ip,value=请求当时的毫秒
	 */
	private ConcurrentHashMap<String, Long> map = new ConcurrentHashMap<String, Long>();

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (WebServer.getInstance() == null) {
			response.getOutputStream().print(JsonUtils.getJson(TipsType.SERVER_STOP).toString());
			return false;
		}
		if (WebServer.getInstance().getType() != ServerRunningType.STARTED) {
			response.getOutputStream().print(JsonUtils.getJson(TipsType.SERVER_STOP).toString());
			return false;
		}
		// now
		long currentTimeMillis = System.currentTimeMillis();
		// 最后一次请求的时间
		Long lastRequstTime = map.get(request.getRemoteAddr());
		// 该地址限制 间隔时间
		Long minLimitTime = WebSystemSetting.getMinLimitTime(request.getServletPath());
		if (minLimitTime == null) {
			response.getOutputStream().print(TipsType.FORBID.getDesc());
			return false;
		}
		if (lastRequstTime != null) {
			if (currentTimeMillis - lastRequstTime < minLimitTime) {
				response.getOutputStream().print(TipsType.TOO_FAST.getDesc());
				return false;
			}
		}
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		Map parameterMap = request.getParameterMap();
		try {
			Set keySet = parameterMap.keySet();
			for (Object object : keySet) {
				Object value = parameterMap.get(object);
				System.out.println("key="+object.toString()+", value="+Arrays.toString((Object[])value));
			}
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		map.put(request.getRemoteAddr(), currentTimeMillis);
		return super.preHandle(request, response, handler);
	}

}
