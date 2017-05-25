package com.mytribe.types;

public enum BagType {
	/**
	 * 主背包
	 */
	MAIN(1),
	/**
	 * 玩家装备格子
	 */
	EQUIP(2),
	/**
	 * 拍卖行
	 */
	PAIMAI(3),
	/**
	 * 个人仓库
	 */
	STORE_HOUSE(4), ;

	private int type;

	BagType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

}
