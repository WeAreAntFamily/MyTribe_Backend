package com.mytribe.util;

import com.alibaba.fastjson.JSONObject;
import com.mytribe.types.TipsType;


public class JsonUtils {
	
	public static JSONObject getJson(TipsType type){
		JSONObject jsonObject = new JSONObject();
		JSONObject typejson = new JSONObject();
		typejson.put(type.getType()+"", type.getDesc());
		jsonObject.put("type", typejson);
		return jsonObject;
	}

}
