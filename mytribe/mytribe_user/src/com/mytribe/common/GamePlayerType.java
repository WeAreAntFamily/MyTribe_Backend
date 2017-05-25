package com.mytribe.common;

public enum GamePlayerType {
	/**
	 * 游戏内部玩家 GM
	 */
	NEI_BU(1),

	/**
	 * 非GM
	 */
	PUBLIC(2);

	private int type;

	GamePlayerType(int type) {
		this.type = type;
	}

	public int getType() {
		return type;
	}

}
