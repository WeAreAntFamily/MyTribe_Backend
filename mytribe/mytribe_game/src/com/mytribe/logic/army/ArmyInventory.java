package com.mytribe.logic.army;

import com.alibaba.fastjson.JSONObject;
import com.mytribe.mgr.IInventory;
import com.mytribe.types.PlayerDataType;

public class ArmyInventory extends IInventory {

	@Override
	public boolean init() {
		// TODO 自动生成的方法存根
		return super.init();
	}

	@Override
	public boolean release() {
		// TODO 自动生成的方法存根
		return super.release();
	}

	@Override
	public void toJson(JSONObject json) {
		if (json != null) {
			JSONObject army = new JSONObject();
			json.put(PlayerDataType.ARMY.getJsonKey(), army);
		}
	}

}
