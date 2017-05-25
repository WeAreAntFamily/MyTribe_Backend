package com.mytribe.logic.bag;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.common.Common;
import com.mytribe.db.entity.strategy.PlayerEquipEntity;
import com.mytribe.db.entity.strategy.PlayerEquipEntityExample;
import com.mytribe.db.entity.strategy.PlayerItemEntity;
import com.mytribe.db.entity.strategy.PlayerItemEntityExample;
import com.mytribe.db.entity.strategy.PlayerItemEntityExample.Criteria;
import com.mytribe.logic.GamePlayer;
import com.mytribe.mgr.IInventory;
import com.mytribe.mgr.dbmgr.StrategyDBManager;
import com.mytribe.mgr.templatemgr.ItemTemplateMgr;
import com.mytribe.types.BagType;
import com.mytribe.types.PlayerDataType;

public class BagInventory extends IInventory {
	private GamePlayer player;

	/** 主背包 */
	private BaseBag mainBag;
	/** 装备背包 */
	private BaseBag equipBag;
	/** 仓库背包 */
	private BaseBag storeHouseBag;
	/** 拍卖背包 */
	private BaseBag paiMaiBag;

	public BagInventory(GamePlayer player) {
		this.player = player;
		this.mainBag = new BaseBag(Common.MAIN_BAG_COUNT, BagType.MAIN, player);
		this.equipBag = new BaseBag(Common.EQUIP_BAG_COUNT, BagType.EQUIP, player);
		this.storeHouseBag = new BaseBag(Common.STORE_HOUSE_BAG_COUNT, BagType.STORE_HOUSE, player);
		this.paiMaiBag = new BaseBag(Common.PAIMAI_BAG_COUNT, BagType.PAIMAI, player);
	}

	public boolean init() {
		try {
			// 加载 item
			PlayerItemEntityExample example = new PlayerItemEntityExample();
			Criteria createCriteria = example.createCriteria();
			createCriteria.andPlayeridEqualTo(player.getPlayerInfo().getPlayerid());
			List<PlayerItemEntity> itemList = StrategyDBManager.getInstance().getPlayerItemEntityMapper().selectByExample(example);
			for (PlayerItemEntity playerItemEntity : itemList) {
				BaseItem baseItem = new BaseItem(ItemTemplateMgr.getTemplate(playerItemEntity.getItemid()), playerItemEntity);
				mainBag.add(baseItem);
			}
			// 加载 装备
			PlayerEquipEntityExample playerEquipEntityExample = new PlayerEquipEntityExample();
			com.mytribe.db.entity.strategy.PlayerEquipEntityExample.Criteria createCriteria2 = playerEquipEntityExample.createCriteria();
			createCriteria2.andPlayeridEqualTo(player.getPlayerInfo().getPlayerid());
			List<PlayerEquipEntity> equipList = StrategyDBManager.getInstance().getPlayerEquipEntityMapper().selectByExample(playerEquipEntityExample);
			for (PlayerEquipEntity playerEquipEntity : equipList) {
				EquipItem equipItem = new EquipItem(ItemTemplateMgr.getTemplate(playerEquipEntity.getEquipid()), null, playerEquipEntity);
				equipBag.add(equipItem);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean release() {
		// TODO 自动生成的方法存根
		return super.release();
	}

	@Override
	public void toJson(JSONObject json) {
		if (json != null) {
			JSONObject bag = new JSONObject();
			json.put(PlayerDataType.BAG.getJsonKey(), bag);
		}
	}

}
