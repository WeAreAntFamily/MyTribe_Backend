package com.mytribe.logic;

import com.alibaba.fastjson.JSONObject;
import com.common.GameStatus;
import com.mytribe.db.entity.strategy.PlayerInfoEntity;
import com.mytribe.db.entity.strategy.UserInfoEntity;
import com.mytribe.logic.army.ArmyInventory;
import com.mytribe.logic.bag.BagInventory;
import com.mytribe.logic.building.BuildingInventory;
import com.mytribe.logic.sylphbeast.SylphbeastInventory;
import com.mytribe.types.PlayerDataType;

public class GamePlayer {

	private PlayerInfoEntity playerInfo;
	private UserInfoEntity userInfo;
	private ArmyInventory armyInventory;

	private BagInventory bagInventory;

	private SylphbeastInventory sylphbeastInventory;

	private BuildingInventory buildingInventory;
	/**
	 * 当前的游戏状态
	 */
	private GameStatus status = GameStatus.empty;
	/**
	 * 心跳检测使用
	 */
	private volatile long lastTime = System.currentTimeMillis();

	public GamePlayer(PlayerInfoEntity playerInfo, UserInfoEntity userInfo, GameStatus status, long lastTime) {
		this.playerInfo = playerInfo;
		this.userInfo = userInfo;
		this.status = status;
		this.lastTime = lastTime;
	}

	public void init() {
		this.armyInventory = new ArmyInventory();
		this.bagInventory = new BagInventory(this);
		this.sylphbeastInventory = new SylphbeastInventory();
		this.buildingInventory = new BuildingInventory();
		this.armyInventory.init();
		this.bagInventory.init();
		this.sylphbeastInventory.init();
		this.buildingInventory.init();
	}

	public void release() {

	}

	public GameStatus getStatus() {
		return status;
	}

	public void setStatus(GameStatus status) {
		this.status = status;
	}

	public long getLastTime() {
		return lastTime;
	}

	public void setLastTime(long lastTime) {
		this.lastTime = lastTime;
	}

	public void toJson(JSONObject json) {
		infoToJson(json);
		this.armyInventory.toJson(json);
		this.bagInventory.toJson(json);
		this.sylphbeastInventory.toJson(json);
		this.buildingInventory.toJson(json);
	}

	public PlayerInfoEntity getPlayerInfo() {
		return playerInfo;
	}

	public UserInfoEntity getUserInfo() {
		return userInfo;
	}

	public ArmyInventory getArmyInventory() {
		return armyInventory;
	}

	public BagInventory getBagInventory() {
		return bagInventory;
	}

	public SylphbeastInventory getSylphbeastInventory() {
		return sylphbeastInventory;
	}

	public BuildingInventory getBuildingInventory() {
		return buildingInventory;
	}

	private void infoToJson(JSONObject json) {
		if (json != null) {
			json.put(PlayerDataType.BASEINFO.getJsonKey(), playerInfo);
		}
	}

}
