package com.mytribe.processor;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import com.mytribe.server.WebServer;

public class AfterBeanInitedProcessor implements ApplicationListener<ContextRefreshedEvent> {

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// root application context 没有parent，他就是老大.
		// 需要执行的逻辑代码，当spring容器初始化完成后就会执行该方法。
		if (event.getApplicationContext().getParent() == null) {
			System.out.println("=================开始初始化process======================");
			//WebServer.getInstance().init();
		}
	}

	
}
