package com.mytribe.server;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;

import com.common.GameStatus;
import com.mytribe.common.UserKeyUtil;
import com.mytribe.logic.GamePlayer;

/**
 * 游戏在线玩家缓存
 * 
 * @author
 * 
 */
public class PlayerOnlineMgr {
	/**
	 * <帐号id 玩家>存储所有在线的玩家
	 */
	private static final ConcurrentHashMap<String, GamePlayer> ALLPLAYER_ONLINE = new ConcurrentHashMap<String, GamePlayer>();

	public static GamePlayer getPlayer(String accountName, Integer platformType) {
		String key = UserKeyUtil.getKey(accountName, platformType);
		return ALLPLAYER_ONLINE.get(key);
	}

	public static GamePlayer getPlayer(String key) {
		if (key == null) {
			return null;
		}
		return ALLPLAYER_ONLINE.get(key);
	}

	/**
	 * 只在 玩家第一次登录游戏时添加
	 * 
	 * @param playerId
	 * @param gamePlayer
	 */
	public static boolean putPlayer(String key, GamePlayer gamePlayer) {
		/**
		 * 该方法只有在登录时调用，在调用时连接的状态一定是connected,如果不是，一定不能 加入到该集合中;
		 * 1.如果角色登录时，在调用该方法前下线，会有概率导致加到该集合中的连接是downline,从而导致 帐号无法登录
		 */
		if (gamePlayer.getStatus() != GameStatus.connected) {
			return false;
		}
		GamePlayer oldGamePlayer = ALLPLAYER_ONLINE.putIfAbsent(key, gamePlayer);
		if (oldGamePlayer != null) {
			return true;
		}
		return true;
	}

	public static Collection<GamePlayer> getAllGamePlayer() {
		return ALLPLAYER_ONLINE.values();
	}

	/**
	 * 玩家离开游戏时移除。 <br>
	 * 有时关闭连接的同时并不意味着离开游戏。
	 * 
	 * @param accountId
	 */
	public static void removePlayer(int playerid) {
		ALLPLAYER_ONLINE.remove(playerid);
	}

	public static Collection<GamePlayer> getAllPlayer() {
		return ALLPLAYER_ONLINE.values();
	}

	/**
	 * 取得所有在线人数
	 * 
	 * @return
	 */
	public static int getAllRoleNum() {
		return ALLPLAYER_ONLINE.size();
	}

	/**
	 * 得到存活的角色数量
	 */
	public static int getAllActiveRoleNum() {
		return ALLPLAYER_ONLINE.size();
	}

	public static int getStatusRoleNum(GameStatus status) {
		int count = 0;
		for (GamePlayer player : ALLPLAYER_ONLINE.values()) {
			if (player.getStatus() != status) {
				continue;
			}
			count++;
		}
		return count;
	}

}
