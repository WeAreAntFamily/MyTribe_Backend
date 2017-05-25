package com.mytribe.logic.building;

import com.alibaba.fastjson.JSONObject;
import com.mytribe.mgr.IInventory;
import com.mytribe.types.PlayerDataType;

public class BuildingInventory extends IInventory {
	@Override
	public void toJson(JSONObject json) {
		if(json!=null){
			JSONObject building = new JSONObject();
			json.put(PlayerDataType.BUILDING.getJsonKey(), building);
		}
	}
}
