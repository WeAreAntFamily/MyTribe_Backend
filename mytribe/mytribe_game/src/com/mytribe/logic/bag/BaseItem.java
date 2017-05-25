package com.mytribe.logic.bag;

import com.mytribe.db.entity.strategy.ItemTemplate;
import com.mytribe.db.entity.strategy.PlayerItemEntity;

public class BaseItem {

	private ItemTemplate itemTemplate;
	private PlayerItemEntity playerItemEntity;

	public BaseItem(ItemTemplate itemTemplate, PlayerItemEntity playerItemEntity) {
		this.itemTemplate = itemTemplate;
		this.playerItemEntity = playerItemEntity;
	}

	public ItemTemplate getItemTemplate() {
		return itemTemplate;
	}

	public void setItemTemplate(ItemTemplate itemTemplate) {
		this.itemTemplate = itemTemplate;
	}

	public PlayerItemEntity getPlayerItemEntity() {
		return playerItemEntity;
	}

	public void setPlayerItemEntity(PlayerItemEntity playerItemEntity) {
		this.playerItemEntity = playerItemEntity;
	}



	/**
	 * 创建一个物品(用于临时物品)
	 * 
	 * @param template
	 * @param count
	 * @param type
	 * @return
	 */
	public static BaseItem createBaseItem(ItemTemplate itemTemplate, int count, short addType,int playeruserid) {
		if (itemTemplate == null) {
			
			return null;
		}

		PlayerItemEntity info = new PlayerItemEntity();
		info.setItemid(itemTemplate.getItemid());
		info.setNum(count);
		info.setPlayerid(playeruserid);
		BaseItem bseItem = new BaseItem(itemTemplate, info);
		return bseItem;
	}

	
}
