package com.mytribe.mgr;

import com.mytribe.mgr.dbmgr.StrategyDBManager;

public abstract class TemplateMgr implements IModule {

	private static TemplateMgr instance;

	public static TemplateMgr getInstance() {
		return instance;
	}

	@Override
	public void instanceInit() {
		StrategyDBManager.registTemplateModule(this);
		instance = this;
	}

}
