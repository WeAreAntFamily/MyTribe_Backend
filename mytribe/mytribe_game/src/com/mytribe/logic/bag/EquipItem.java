package com.mytribe.logic.bag;

import com.mytribe.db.entity.strategy.ItemTemplate;
import com.mytribe.db.entity.strategy.PlayerEquipEntity;
import com.mytribe.db.entity.strategy.PlayerItemEntity;

public class EquipItem extends BaseItem {
	private PlayerEquipEntity playerEquipEntity;

	public EquipItem(ItemTemplate itemTemplate, PlayerItemEntity playerItemEntity, PlayerEquipEntity playerEquipEntity) {
		super(itemTemplate, playerItemEntity);
		this.playerEquipEntity = playerEquipEntity;
	}

	public PlayerEquipEntity getPlayerEquipEntity() {
		return playerEquipEntity;
	}

	public void setPlayerEquipEntity(PlayerEquipEntity playerEquipEntity) {
		this.playerEquipEntity = playerEquipEntity;
	}

}
