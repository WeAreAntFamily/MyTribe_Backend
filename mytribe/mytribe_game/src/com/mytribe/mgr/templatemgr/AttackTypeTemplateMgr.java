package com.mytribe.mgr.templatemgr;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.mytribe.db.entity.strategy.AttackTypeTemplate;
import com.mytribe.db.entity.strategy.AttackTypeTemplateExample;
import com.mytribe.db.mapper.strategy.AttackTypeTemplateMapper;
import com.mytribe.mgr.TemplateMgr;
import com.mytribe.mgr.dbmgr.StrategyDBManager;

@Service
public class AttackTypeTemplateMgr extends TemplateMgr {

	private static ConcurrentHashMap<Integer, AttackTypeTemplate> datas = new ConcurrentHashMap<Integer, AttackTypeTemplate>();

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
			AttackTypeTemplateMapper mapper = instance.getAttackTypeTemplateMapper();
			List<AttackTypeTemplate> selectByExample = mapper.selectByExample(new AttackTypeTemplateExample());
			for (AttackTypeTemplate template : selectByExample) {
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
