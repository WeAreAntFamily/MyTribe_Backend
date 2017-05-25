package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.common.GameStatus;
import com.mytribe.common.UserKeyUtil;
import com.mytribe.db.entity.strategy.PlayerInfoEntity;
import com.mytribe.db.entity.strategy.UserInfoEntity;
import com.mytribe.db.entity.strategy.UserInfoEntityExample;
import com.mytribe.db.entity.strategy.UserInfoEntityExample.Criteria;
import com.mytribe.db.mapper.strategy.PlayerInfoEntityMapper;
import com.mytribe.db.mapper.strategy.UserInfoEntityMapper;
import com.mytribe.logic.GamePlayer;
import com.mytribe.server.PlayerOnlineMgr;
import com.mytribe.types.TipsType;
import com.mytribe.util.JsonUtils;

@Controller
@RequestMapping("/login")
public class LoginController {
	Logger logger = LoggerFactory.getLogger(LoginController.class);
	@Autowired
	private PlayerInfoEntityMapper playerInfoEntityMapper;
	@Autowired
	private UserInfoEntityMapper userInfoEntityMapper;

	private boolean paramCheck(int playerid, String passwd, String userKey) {
		return false;
	}

	@ResponseBody
	@RequestMapping(value="/login.do",produces = "application/json; charset=utf-8")
	public String doLogin(String accountName, Integer platformType, String passwd, String userKey) {
		String key = UserKeyUtil.getKey(accountName, platformType);
		GamePlayer player = PlayerOnlineMgr.getPlayer(key);
		JSONObject json = null;
		if (player == null) {
			try {
				UserInfoEntityExample userInfoEntityExample = new UserInfoEntityExample();
				Criteria createCriteria = userInfoEntityExample.createCriteria();
				createCriteria.andAccountNameEqualTo(accountName);
				createCriteria.andPlatformTypeEqualTo(platformType);
				List<UserInfoEntity> selectByExample = userInfoEntityMapper.selectByExample(userInfoEntityExample);
				if (selectByExample.size() == 0) {
					json = JsonUtils.getJson(TipsType.ROLE_NOT_EXISTS);
					return json.toString();
				}
				UserInfoEntity userInfoEntity = selectByExample.get(0);
				if (!userInfoEntity.getPasswd().equals(passwd)) {
					json = JsonUtils.getJson(TipsType.PASSWD_ERR);
					return json.toString();
				}
				PlayerInfoEntity playerInfoEntity = playerInfoEntityMapper.selectByPrimaryKey(userInfoEntity.getPlayerId());
				if (playerInfoEntity != null) {
					player = new GamePlayer(playerInfoEntity, userInfoEntity, GameStatus.connected, System.currentTimeMillis());
					player.init();
					PlayerOnlineMgr.putPlayer(key, player);
					// ok
				} else {
					json = JsonUtils.getJson(TipsType.ROLE_NOT_EXISTS);
				}
			} catch (Exception e) {
				e.printStackTrace();
				json = JsonUtils.getJson(TipsType.SERVER_ERR);
				return json.toString();
			}
		} else {
			UserInfoEntity userInfo = player.getUserInfo();
			if (!userInfo.getPasswd().equals(passwd)) {
				json = JsonUtils.getJson(TipsType.PASSWD_ERR);
				return json.toString();
			}
			// ok
		}
		if (player != null) {
			json = JsonUtils.getJson(TipsType.OK);
			player.toJson(json);
		}
		if (json == null) {
			json = JsonUtils.getJson(TipsType.SERVER_ERR);
		}
		return json.toString();
	}

}
