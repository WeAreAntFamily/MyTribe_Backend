package com.mytribe.mgr.templatemgr;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.mytribe.db.entity.strategy.EquipForgeTemplate;
import com.mytribe.db.entity.strategy.EquipForgeTemplateExample;
import com.mytribe.db.mapper.strategy.EquipForgeTemplateMapper;
import com.mytribe.mgr.TemplateMgr;
import com.mytribe.mgr.dbmgr.StrategyDBManager;

@Service
public class EquipForgeTemplateMgr extends TemplateMgr {

	private static ConcurrentHashMap<Integer, List<EquipForgeTemplate>> datas = new ConcurrentHashMap<Integer, List<EquipForgeTemplate>>();

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
			EquipForgeTemplateMapper mapper = instance.getEquipForgeTemplateMapper();
			List<EquipForgeTemplate> selectByExample = mapper.selectByExample(new EquipForgeTemplateExample());
			for (EquipForgeTemplate template : selectByExample) {
				List<EquipForgeTemplate> list = datas.get(template.getEquipid());
				if (list == null) {
					list = new ArrayList<EquipForgeTemplate>();
					datas.put(template.getEquipid(), list);
				}
				list.add(template);
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
