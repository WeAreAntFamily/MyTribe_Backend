package com.mytribe.logic.sylphbeast;

import com.alibaba.fastjson.JSONObject;
import com.mytribe.mgr.IInventory;
import com.mytribe.types.PlayerDataType;

public class SylphbeastInventory extends IInventory {
	@Override
	public void toJson(JSONObject json) {
		if (json != null) {
			JSONObject sy = new JSONObject();
			json.put(PlayerDataType.SYLPHBEAST.getJsonKey(), sy);
		}
	}
}
