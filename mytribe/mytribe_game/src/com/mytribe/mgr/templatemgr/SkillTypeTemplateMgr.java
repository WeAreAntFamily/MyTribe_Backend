package com.mytribe.mgr.templatemgr;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.mytribe.db.entity.strategy.SkillTypeTemplate;
import com.mytribe.db.entity.strategy.SkillTypeTemplateExample;
import com.mytribe.db.mapper.strategy.SkillTypeTemplateMapper;
import com.mytribe.mgr.TemplateMgr;
import com.mytribe.mgr.dbmgr.StrategyDBManager;

@Service
public class SkillTypeTemplateMgr extends TemplateMgr {

	private static ConcurrentHashMap<Integer, SkillTypeTemplate> datas = new ConcurrentHashMap<Integer, SkillTypeTemplate>();

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
			SkillTypeTemplateMapper mapper = instance.getSkillTypeTemplateMapper();

			List<SkillTypeTemplate> selectByExample = mapper.selectByExample(new SkillTypeTemplateExample());
			for (SkillTypeTemplate template : selectByExample) {
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
