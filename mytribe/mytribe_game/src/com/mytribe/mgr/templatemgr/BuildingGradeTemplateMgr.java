package com.mytribe.mgr.templatemgr;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.mytribe.db.entity.strategy.BuildingGradeTemplate;
import com.mytribe.db.entity.strategy.BuildingGradeTemplateExample;
import com.mytribe.db.mapper.strategy.BuildingGradeTemplateMapper;
import com.mytribe.mgr.TemplateMgr;
import com.mytribe.mgr.dbmgr.StrategyDBManager;

@Service
public class BuildingGradeTemplateMgr extends TemplateMgr {

	private static ConcurrentHashMap<Integer, BuildingGradeTemplate> datas = new ConcurrentHashMap<Integer, BuildingGradeTemplate>();

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
			BuildingGradeTemplateMapper mapper = instance.getBuildingGradeTemplateMapper();
			List<BuildingGradeTemplate> selectByExample = mapper.selectByExample(new BuildingGradeTemplateExample());
			for (BuildingGradeTemplate template : selectByExample) {
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
