package com.mytribe.mgr.templatemgr;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.mytribe.db.entity.strategy.SoldierTypeTemplate;
import com.mytribe.db.entity.strategy.SoldierTypeTemplateExample;
import com.mytribe.db.mapper.strategy.SoldierTypeTemplateMapper;
import com.mytribe.mgr.TemplateMgr;
import com.mytribe.mgr.dbmgr.StrategyDBManager;

@Service
public class SoldierTypeTemplateMgr extends TemplateMgr {

	private static ConcurrentHashMap<Integer, SoldierTypeTemplate> datas = new ConcurrentHashMap<Integer, SoldierTypeTemplate>();

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
			SoldierTypeTemplateMapper mapper = instance.getSoldierTypeTemplateMapper();
			List<SoldierTypeTemplate> selectByExample = mapper.selectByExample(new SoldierTypeTemplateExample());
			for (SoldierTypeTemplate template : selectByExample) {
				datas.put(template.getSoldiertypeid(), template);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean afterinit() {
		return true;
	}

}
