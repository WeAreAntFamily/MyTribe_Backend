package com.mytribe.mgr.templatemgr;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.mytribe.db.entity.strategy.GradeExpTemplate;
import com.mytribe.db.entity.strategy.GradeExpTemplateExample;
import com.mytribe.db.mapper.strategy.GradeExpTemplateMapper;
import com.mytribe.mgr.TemplateMgr;
import com.mytribe.mgr.dbmgr.StrategyDBManager;

@Service
public class GradeExpTemplateMgr extends TemplateMgr {

	private static ConcurrentHashMap<Integer, GradeExpTemplate> datas = new ConcurrentHashMap<Integer, GradeExpTemplate>();

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
			GradeExpTemplateMapper mapper = instance.getGradeExpTemplateMapper();
			List<GradeExpTemplate> selectByExample = mapper.selectByExample(new GradeExpTemplateExample());
			for (GradeExpTemplate template : selectByExample) {
				datas.put(template.getGrade(), template);
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
