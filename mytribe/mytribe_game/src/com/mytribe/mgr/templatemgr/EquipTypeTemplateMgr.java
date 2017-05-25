package com.mytribe.mgr.templatemgr;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.mytribe.db.entity.strategy.EquipTypeTemplate;
import com.mytribe.db.entity.strategy.EquipTypeTemplateExample;
import com.mytribe.db.mapper.strategy.EquipTypeTemplateMapper;
import com.mytribe.mgr.TemplateMgr;
import com.mytribe.mgr.dbmgr.StrategyDBManager;

@Service
public class EquipTypeTemplateMgr extends TemplateMgr {

	private static ConcurrentHashMap<Integer, EquipTypeTemplate> datas = new ConcurrentHashMap<Integer, EquipTypeTemplate>();

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
			EquipTypeTemplateMapper mapper = instance.getEquipTypeTemplateMapper();
			List<EquipTypeTemplate> list = mapper.selectByExample(new EquipTypeTemplateExample());
			for (EquipTypeTemplate template : list) {
				datas.put(template.getId(), template);
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

}
