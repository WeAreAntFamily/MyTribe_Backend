package com.mytribe;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.mytribe.common.UserCount;
import com.mytribe.common.UserKeyUtil;
import com.mytribe.db.entity.user.ServerListEntity;
import com.mytribe.db.entity.user.UserEntity;
import com.mytribe.db.entity.user.UserEntityExample;
import com.mytribe.db.entity.user.UserEntityExample.Criteria;
import com.mytribe.db.mapper.user.ServerListEntityMapper;
import com.mytribe.db.mapper.user.UserEntityMapper;

@Service
public class UserManager {
	private static final Logger logger = LoggerFactory.getLogger(UserManager.class);
	@Autowired
	private UserEntityMapper userEntityMapper;
	@Autowired
	private ServerListEntityMapper serverListEntityMapper;

	private static UserManager instance;

	private ConcurrentHashMap<String, Integer> userCountMap = new ConcurrentHashMap<String, Integer>();
	/**
	 * 服务器列表
	 */
	private ConcurrentHashMap<String, ServerListEntity> serverListMap = new ConcurrentHashMap<String, ServerListEntity>();

	private Object lock = new Object();

	@PostConstruct
	public void init() {
		instance = this;
		initdb();
	}

	public static UserManager getInstance() {
		return instance;
	}

	public void initdb() {
		List<ServerListEntity> serverlist = serverListEntityMapper.selectByExample(null);
		for (ServerListEntity serverListEntity : serverlist) {
			serverListMap.put(serverListEntity.getServerId(), serverListEntity);
			userCountMap.put(serverListEntity.getServerId(), 0);
		}
		long now = System.currentTimeMillis();
		logger.info("开始");
		List<UserCount> userCountByServerId = userEntityMapper.userCountByServerId();
		for (UserCount userCount : userCountByServerId) {
			if (serverListMap.containsKey(userCount.getServerId())) {
				userCountMap.put(userCount.getServerId(), userCount.getCount());
			}
		}

		long end = System.currentTimeMillis();
		logger.info("结束=" + ((end - now) / 1000));
		System.out.println("jieshu=" + ((end - now) / 1000));
	}

	@ResponseBody
	@RequestMapping("/getTargetServerAndUser.do")
	public String getTargetServerAndUser() {

		return "";

	}

	/**
	 * 添加一个服务器
	 * 
	 * @param temp
	 */
	public String addServer(ServerListEntity temp) {

		if (serverListMap.contains(temp.getServerId())) {
			// 已包含，添加失败
			return "the server is exist";
		}

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("o", temp);
		System.out.println(jsonObject.toString());
		try {
			serverListEntityMapper.insert(temp);
		} catch (Exception e) {
			e.printStackTrace();
			return "add server err:" + e.getMessage();
		}
		serverListMap.put(temp.getServerId(), temp);
		userCountMap.put(temp.getServerId(), 0);
		return "add server ok";
	}

	/**
	 * 添加新用户映射关系
	 * 
	 * @param userEntity
	 */
	public String addUser(UserEntity userEntity, JSONObject jsonObject) {
		UserEntity userEntity2 = getUserEntity(userEntity.getAccountName(), userEntity.getPlatformType());

		if (userEntity2 != null) {
			jsonObject.put("err", "the acount is exist");
			// 玩家已经存在
			return "the acount is exist";
		}
		String minServerId = getMinServerId();
		if (minServerId == null) {
			jsonObject.put("err", "no server");
			return "no server";
		}
		if (!serverListMap.containsKey(minServerId)) {
			jsonObject.put("err", "server not exist");
			return "server not exist";
		}

		userEntity.setServerId(minServerId);
		try {
			int insert = userEntityMapper.insertSelective(userEntity);
			// TODO 有可能数据库连接超时等问题
			if (insert <= 0) {
				jsonObject.put("err", "server err,insert err");
				return "server err";
			}
			synchronized (lock) {
				userCountMap.put(minServerId, userCountMap.get(minServerId) + 1);
			}
			String userKey = UserKeyUtil.encrypt(userEntity.getAccountName(), userEntity.getPlatformType(), minServerId);
			jsonObject.put("suc", "add user ok!");
			jsonObject.put("login_server_id", minServerId);
			jsonObject.put("userKey", userKey);
			return "add user ok!";
		} catch (Exception e) {
			e.printStackTrace();
		}
		jsonObject.put("err", "server err");
		return "server err";
	}

	public String getMinServerId() {
		Set<String> keySet = userCountMap.keySet();
		String serverId = null;
		int size = -1;
		for (String serverIdTemp : keySet) {
			Integer count = userCountMap.get(serverIdTemp);
			if (serverId == null) {
				serverId = serverIdTemp;
				size = count;
			} else {
				if (size > count) {
					serverId = serverIdTemp;
					size = count;
				}
			}
		}
		return serverId;
	}

	public JSONArray serverToJson() {
		Set<String> keySet = serverListMap.keySet();
		JSONArray jsonArray = new JSONArray();
		for (String serverId : keySet) {
			ServerListEntity serverListEntity = serverListMap.get(serverId);
			jsonArray.add(serverListEntity);
		}
		return jsonArray;
	}

	/**
	 * 查找某个账号
	 * 
	 * @param accountName
	 * @param platformType
	 * @return
	 */
	public UserEntity getUserEntity(String accountName, Integer platformType) {
		UserEntityExample example = new UserEntityExample();
		Criteria criteria = example.createCriteria();
		criteria.andAccountNameEqualTo(getMinServerId());
		criteria.andPlatformTypeEqualTo(platformType);
		List<UserEntity> selectByExample = userEntityMapper.selectByExample(example);
		if (selectByExample.size() > 0) {
			return selectByExample.get(0);
		}
		return null;
	}

	public ServerListEntity getServerListEntity(String serverId) {
		if (serverId == null) {
			return null;
		}
		return serverListMap.get(serverId);
	}

}
