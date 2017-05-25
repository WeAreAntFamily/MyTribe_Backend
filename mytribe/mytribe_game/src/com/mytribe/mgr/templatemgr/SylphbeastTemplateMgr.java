package com.mytribe.mgr.templatemgr;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.mytribe.db.entity.strategy.SylphbeastTemplate;
import com.mytribe.db.entity.strategy.SylphbeastTemplateExample;
import com.mytribe.db.mapper.strategy.SylphbeastTemplateMapper;
import com.mytribe.mgr.TemplateMgr;
import com.mytribe.mgr.dbmgr.StrategyDBManager;

@Service
public class SylphbeastTemplateMgr extends TemplateMgr {

	private static ConcurrentHashMap<Integer, SylphbeastTemplate> datas = new ConcurrentHashMap<Integer, SylphbeastTemplate>();

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
			SylphbeastTemplateMapper mapper = instance.getSylphbeastTemplateMapper();
			List<SylphbeastTemplate> selectByExample = mapper.selectByExample(new SylphbeastTemplateExample());
			for (SylphbeastTemplate template : selectByExample) {
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
