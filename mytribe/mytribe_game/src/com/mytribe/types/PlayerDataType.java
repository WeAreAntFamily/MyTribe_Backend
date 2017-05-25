package com.mytribe.types;

public enum PlayerDataType {
	/**
	 * 玩家属性
	 */
	BASEINFO(1, "baseinfo"),
	/**
	 * 背包数据
	 */
	BAG(2, "bag"),
	/**
	 * 部队数据
	 */
	ARMY(3, "army"),
	/**
	 * 建筑数据
	 */
	BUILDING(4, "building"),
	/**
	 * 灵兽数据
	 */
	SYLPHBEAST(5, "sylphbeast");

	private int type;
	private String jsonKey;

	PlayerDataType(int type, String jsonKey) {
		this.type = type;
		this.jsonKey = jsonKey;
	}

	public int getType() {
		return type;
	}

	public String getJsonKey() {
		return jsonKey;
	}

}
