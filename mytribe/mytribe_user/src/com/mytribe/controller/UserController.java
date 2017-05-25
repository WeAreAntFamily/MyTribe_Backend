package com.mytribe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mytribe.UserManager;
import com.mytribe.common.UserKeyUtil;
import com.mytribe.db.entity.user.ServerListEntity;
import com.mytribe.db.entity.user.UserEntity;

@Controller
@RequestMapping("/user")
public class UserController {
	/**
	 * 创建一个新账号(客户端)
	 * 
	 * @param userEntity
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/addUser.do",produces = "application/json; charset=utf-8")
	public String addUser(UserEntity userEntity) {
		JSONObject jsonObject = new JSONObject();
		UserManager.getInstance().addUser(userEntity, jsonObject);
		return jsonObject.toString();
	}

	/**
	 * 添加一个服务器 管理台功能
	 * 
	 * @param temp
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/addServer.do",produces = "application/json; charset=utf-8")
	public String addServer(ServerListEntity temp) {
		return UserManager.getInstance().addServer(temp);
	}

	/**
	 * 获取账号所在服务器
	 * 
	 * @param accountName
	 * @param platformType
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/queryServer.do",produces = "application/json; charset=utf-8")
	public String queryServer(String accountName, Integer platformType) {
		UserEntity userEntity = UserManager.getInstance().getUserEntity(accountName, platformType);
		if (userEntity != null) {
			ServerListEntity serverListEntity = UserManager.getInstance().getServerListEntity(userEntity.getServerId());
			if (serverListEntity != null) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("queryServer", serverListEntity);
				return jsonObject.toString();
			}
		}
		return "the account is't exist!";
	}

	@ResponseBody
	@RequestMapping(value="/getServerList.do",produces = "application/json; charset=utf-8")
	public String queryServer() {
		JSONArray serverToJson = UserManager.getInstance().serverToJson();
		return serverToJson.toString();
	}

	@ResponseBody
	@RequestMapping(value="/getServerList1.do",produces = "application/json; charset=utf-8")
	public String queryServer1() {
		return UserKeyUtil.encrypt("zhangpenlg", 1, "test01");
	}

}
