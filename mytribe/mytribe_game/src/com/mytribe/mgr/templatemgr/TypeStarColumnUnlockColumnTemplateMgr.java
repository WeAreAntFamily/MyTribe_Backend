package com.mytribe.mgr.templatemgr;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.mytribe.db.entity.strategy.TypeStarColumnUnlockColumnTemplate;
import com.mytribe.db.entity.strategy.TypeStarColumnUnlockColumnTemplateExample;
import com.mytribe.db.mapper.strategy.TypeStarColumnUnlockColumnTemplateMapper;
import com.mytribe.mgr.TemplateMgr;
import com.mytribe.mgr.dbmgr.StrategyDBManager;

@Service
public class TypeStarColumnUnlockColumnTemplateMgr extends TemplateMgr {

	private static ConcurrentHashMap<Integer, TypeStarColumnUnlockColumnTemplate> datas = new ConcurrentHashMap<Integer, TypeStarColumnUnlockColumnTemplate>();

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
			TypeStarColumnUnlockColumnTemplateMapper mapper = instance.getTypeStarColumnUnlockColumnTemplateMapper();
			List<TypeStarColumnUnlockColumnTemplate> selectByExample = mapper.selectByExample(new TypeStarColumnUnlockColumnTemplateExample());
			for (TypeStarColumnUnlockColumnTemplate template : selectByExample) {
				// datas.put(template.getId(), template);
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
