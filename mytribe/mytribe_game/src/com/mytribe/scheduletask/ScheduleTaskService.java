package com.mytribe.scheduletask;

import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mytribe.mgr.dbmgr.StrategyDBManager;

@Service
public class ScheduleTaskService {
	private static Logger logger = LoggerFactory.getLogger(ScheduleTaskService.class);
	private static ScheduleTaskService instance;

	@PostConstruct
	public void init() {
		instance = this;
	}

	public static ScheduleTaskService getInstance() {
		return instance;
	}

	/**
	 * 定时、服务器启动、main——user请求
	 */
	public void send(){
		AtomicInteger curDBPlayerCount = StrategyDBManager.getInstance().getCurDBPlayerCount();
		if(curDBPlayerCount.get()<0){
			logger.error("当前服务器人数异常，不能发送");
			return;
		}
		
		
	}
}
