package com.mytribe.mgr;

import com.alibaba.fastjson.JSONObject;

public abstract class IInventory {

	public boolean init() {
		return true;
	}

	public boolean release() {
		return true;
	}

	public void toJson(JSONObject json) {

	}
}
