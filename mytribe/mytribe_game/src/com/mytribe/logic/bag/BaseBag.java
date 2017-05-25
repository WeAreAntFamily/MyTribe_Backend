package com.mytribe.logic.bag;

import com.mytribe.logic.GamePlayer;
import com.mytribe.types.BagType;

/**
 * 基本背包实现,包括领主道具、领主技能、领主装备、英雄技能
 */
public class BaseBag extends AbstractBag {

	public BaseBag(int capability, BagType bagType, GamePlayer player) {
		super(capability, bagType, player);
	}

}
