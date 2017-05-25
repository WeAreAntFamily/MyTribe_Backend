package com.mytribe.mgr.templatemgr;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.mytribe.db.entity.strategy.SoldierGradeInfoTemplate;
import com.mytribe.db.entity.strategy.SoldierGradeInfoTemplateExample;
import com.mytribe.db.mapper.strategy.SoldierGradeInfoTemplateMapper;
import com.mytribe.mgr.TemplateMgr;
import com.mytribe.mgr.dbmgr.StrategyDBManager;

@Service
public class SoldierGradeInfoTemplateMgr extends TemplateMgr {

	private static ConcurrentHashMap<Integer, SoldierGradeInfoTemplate> datas = new ConcurrentHashMap<Integer, SoldierGradeInfoTemplate>();

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
			SoldierGradeInfoTemplateMapper mapper = instance.getSoldierGradeInfoTemplateMapper();
			List<SoldierGradeInfoTemplate> selectByExample = mapper.selectByExample(new SoldierGradeInfoTemplateExample());
			for (SoldierGradeInfoTemplate template : selectByExample) {
				datas.put(template.getSoldiertypeid(), template);
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
