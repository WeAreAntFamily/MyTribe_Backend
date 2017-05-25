package com.mytribe.mgr.templatemgr;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.mytribe.db.entity.strategy.BuildingTypeTemplate;
import com.mytribe.db.entity.strategy.BuildingTypeTemplateExample;
import com.mytribe.db.mapper.strategy.BuildingTypeTemplateMapper;
import com.mytribe.mgr.TemplateMgr;
import com.mytribe.mgr.dbmgr.StrategyDBManager;

@Service
public class BuildingTypeTemplateMgr extends TemplateMgr {

	private static ConcurrentHashMap<Integer, BuildingTypeTemplate> datas = new ConcurrentHashMap<Integer, BuildingTypeTemplate>();

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
			BuildingTypeTemplateMapper mapper = instance.getBuildingTypeTemplateMapper();
			List<BuildingTypeTemplate> selectByExample = mapper.selectByExample(new BuildingTypeTemplateExample());
			for (BuildingTypeTemplate template : selectByExample) {
				datas.put(template.getBuildingtypeid(), template);
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
