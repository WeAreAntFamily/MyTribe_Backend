package com.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
@RequestMapping("/create")
public class CreateController {
	Logger logger = LoggerFactory.getLogger(CreateController.class);
	@Autowired
	private PlayerInfoEntityMapper playerInfoEntityMapper;
	@Autowired
	private UserInfoEntityMapper userInfoEntityMapper;

	@ResponseBody
	@RequestMapping(value="/create.do",produces = "application/json; charset=utf-8")
	public String doCreate(String accountName, String nickName, Integer platformType, String passwd, Byte locale, String userKey, HttpServletRequest req) {

		GamePlayer player = PlayerOnlineMgr.getPlayer(accountName, platformType);
		JSONObject json = null;
		if (player == null) {
			try {
				UserInfoEntityExample userInfoEntityExample = new UserInfoEntityExample();
				Criteria createCriteria = userInfoEntityExample.createCriteria();
				createCriteria.andAccountNameEqualTo(accountName).andPlatformTypeEqualTo(platformType);
				List<UserInfoEntity> selectByExample = userInfoEntityMapper.selectByExample(userInfoEntityExample);
				if (selectByExample.size() > 0) {
					return "账号 已存在";
				}
				UserInfoEntity userInfoEntity = new UserInfoEntity();
				userInfoEntity.setAccountName(accountName);
				userInfoEntity.setPlatformType(platformType);
				userInfoEntity.setPasswd(passwd);
				userInfoEntity.setActiveIp(req.getRemoteHost());
				userInfoEntity.setCreateDate(new Date());
				//userInfoEntity.setLocale(locale);
				userInfoEntity.setLastLoginDate(new Date());
				int insert = userInfoEntityMapper.insert(userInfoEntity);
				if (insert == 0) {
					return "建号失败";
				}
				selectByExample = userInfoEntityMapper.selectByExample(userInfoEntityExample);
				if (selectByExample.size() < 1) {
					return "建号失败";
				}
				UserInfoEntity userInfoEntity2 = selectByExample.get(0);

				PlayerInfoEntity playerInfoEntity1 = new PlayerInfoEntity();
				playerInfoEntity1.setCurrentexp(0);
				playerInfoEntity1.setGrade(0);
				playerInfoEntity1.setMedalnum(0);
				playerInfoEntity1.setNickname(nickName);
				playerInfoEntity1.setPlayerid(userInfoEntity2.getPlayerId());
				int insert2 = playerInfoEntityMapper.insert(playerInfoEntity1);
				if (insert2 < 1) {
					return "建号失败";
				}
				player = new GamePlayer(playerInfoEntity1, userInfoEntity2, GameStatus.connected, System.currentTimeMillis());
				player.init();
				String key = UserKeyUtil.getKey(accountName, platformType);
				PlayerOnlineMgr.putPlayer(key, player);
				json = JsonUtils.getJson(TipsType.CREATE_OK);
				player.toJson(json);
			} catch (Exception e) {
				json = JsonUtils.getJson(TipsType.SERVER_ERR);
				e.printStackTrace();
			}
		}else {
			json = JsonUtils.getJson(TipsType.ROLE_HAVE_EXISTS);
		}
		if (json == null) {
			json = JsonUtils.getJson(TipsType.SERVER_ERR);
		}
		return json.toString();
	}

}
