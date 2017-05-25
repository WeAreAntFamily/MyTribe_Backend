package com.mytribe.mgr;

public interface IModule {
	/**
	 * 对象初始化
	 */
	public void instanceInit();
	/**
	 * 属性初始化
	 */
	public boolean init();
	/**
	 * 属性初始化后
	 */
	public boolean afterinit();

}
