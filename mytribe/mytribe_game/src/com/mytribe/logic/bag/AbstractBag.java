package com.mytribe.logic.bag;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.mytribe.logic.GamePlayer;
import com.mytribe.types.BagType;

/**
 * 抽象背包:仅此对格子基础操作
 */
public abstract class AbstractBag {

	private BagType bagType;

	protected ConcurrentHashMap<Integer, Map<Integer, BaseItem>> map;
	private int curCount=0;
	private int maxCount=0;
	private GamePlayer player;

	/**
	 * 
	 * @param capability
	 *            容量
	 * @param type
	 *            背包类型
	 * @param beginPos
	 *            起始位置
	 * @param autoStack
	 *            是否自动叠加
	 */
	public AbstractBag(int capability, BagType bagType, GamePlayer player) {
		map = new ConcurrentHashMap<Integer, Map<Integer, BaseItem>>(capability);
		this.bagType = bagType;
		this.player = player;
		this.maxCount=capability;
	}

	/* 获取背包中的全部物品 */
	public List<BaseItem> getItems() {
		List<BaseItem> list = new ArrayList<BaseItem>();
		return list;
	}
	
	public boolean put(List<BaseItem>  list){
		if(list==null){
			return true;
		}
		
		for (BaseItem baseItem : list) {
			add(baseItem);
		}
		return false;
	}
	public boolean add(BaseItem item){
		
		return true;
	}
	
	private void addOrRemove(){
		int tempCurCount=0;
		Set<Integer> templateIds = map.keySet();
		for (Integer templateId : templateIds) {
			Map<Integer, BaseItem> items = map.get(templateId);
			if(items!=null){
				tempCurCount+=items.size();
			}
		}
		curCount=tempCurCount;
	}

	public int getCurCount() {
		return curCount;
	}

	public int getMaxCount() {
		return maxCount;
	}

	public void setMaxCount(int maxCount) {
		this.maxCount = maxCount;
	}

}
