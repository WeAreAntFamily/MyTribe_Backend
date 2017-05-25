package com.mytribe.mgr.templatemgr;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.mytribe.db.entity.strategy.ItemTemplate;
import com.mytribe.db.entity.strategy.ItemTemplateExample;
import com.mytribe.db.mapper.strategy.ItemTemplateMapper;
import com.mytribe.mgr.TemplateMgr;
import com.mytribe.mgr.dbmgr.StrategyDBManager;

@Service
public class ItemTemplateMgr extends TemplateMgr {

	private static ConcurrentHashMap<Integer, ItemTemplate> datas = new ConcurrentHashMap<Integer, ItemTemplate>();

	@PostConstruct
	@Override
	public void instanceInit() {
		super.instanceInit();
	}

	@Override
	public boolean init() {
		try {
			datas.clear();
			StrategyDBManager instance = StrategyDBManager.getInstance();
			ItemTemplateMapper mapper = instance.getItemTemplateMapper();
			List<ItemTemplate> selectByExample = mapper.selectByExample(new ItemTemplateExample());
			for (ItemTemplate template : selectByExample) {
				datas.put(template.getItemid(), template);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean afterinit() {
		return true;
	}
	public static ItemTemplate getTemplate(int templateId){
		return datas.get(templateId);
	}

}
