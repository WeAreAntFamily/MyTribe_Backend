package com.mytribe.mgr.templatemgr;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.mytribe.db.entity.strategy.MainRoleBaseInfoTemplate;
import com.mytribe.db.entity.strategy.MainRoleBaseInfoTemplateExample;
import com.mytribe.db.mapper.strategy.MainRoleBaseInfoTemplateMapper;
import com.mytribe.mgr.TemplateMgr;
import com.mytribe.mgr.dbmgr.StrategyDBManager;

@Service
public class MainRoleBaseInfoTemplateMgr extends TemplateMgr {

	private static ConcurrentHashMap<Integer, MainRoleBaseInfoTemplate> datas = new ConcurrentHashMap<Integer, MainRoleBaseInfoTemplate>();

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
			MainRoleBaseInfoTemplateMapper mapper = instance.getMainRoleBaseInfoTemplateMapper();
			List<MainRoleBaseInfoTemplate> selectByExample = mapper.selectByExample(new MainRoleBaseInfoTemplateExample());
			for (MainRoleBaseInfoTemplate template : selectByExample) {
				datas.put(template.getMainroleid(), template);
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
