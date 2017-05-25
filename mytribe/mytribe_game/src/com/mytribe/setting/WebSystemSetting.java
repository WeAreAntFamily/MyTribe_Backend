package com.mytribe.setting;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 系统设置
 * 
 * @author
 * 
 */

public class WebSystemSetting {
	private static Map<String, Long> map = new HashMap<String, Long>();
	static {
		map.put("/login/login.do", 500l);
		map.put("/create/create.do", 500l);
		map.put("/login/login.do", 500l);
		map.put("/login/login.do", 500l);
		map.put("/login/login.do", 500l);
	}

	public static Long getMinLimitTime(String requestPath) {
		return map.get(requestPath);
	}

	private static String userRequestUrl;
	private static String gmIP;
	private Set<String> gmIPs;
	private static String site;
	public static String getGmIP() {
		return gmIP;
	}

	public static void setGmIP(String gmIP) {
		WebSystemSetting.gmIP = gmIP;
	}

	public static String getUserRequestUrl() {
		return userRequestUrl;
	}

	public static void setUserRequestUrl(String userRequestUrl) {
		WebSystemSetting.userRequestUrl = userRequestUrl;
	}

	public static String getSite() {
		return site;
	}

	public static void setSite(String site) {
		WebSystemSetting.site = site;
	}

}
