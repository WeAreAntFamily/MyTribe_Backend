package com.mytribe.server;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.mytribe.mgr.dbmgr.StrategyDBManager;
import com.mytribe.types.ServerRunningType;
import com.mytribe.types.ServerType;

/**
 * 游戏服务器,游戏启动的主类，同时该类也负责，网络套接字状态的侦听
 * 
 * @author
 * 
 */
@Service
public class WebServer implements Server {

	private Logger logger = LoggerFactory.getLogger(WebServer.class);

	private ServerType serverType;
	private ServerRunningType type = ServerRunningType.STOP;

	private static WebServer instance;

	public static WebServer getInstance() {
		return instance;
	}

	@PostConstruct
	public void init() {
		instance = this;
		type = ServerRunningType.STARTING;

		startNetListener();
		startup();
		onStartFinish();
	}

	public ServerRunningType getType() {
		return type;
	}

	public void setType(ServerRunningType type) {
		this.type = type;
	}

	@Override
	public void startNetListener() {
		try {
		} catch (Exception e) {
		}
	}

	@Override
	public void close() {
		type = ServerRunningType.STOPING;
	}

	@Override
	public void onStartFinish() {

		type = ServerRunningType.STARTED;
		StrategyDBManager.getInstance().serverStarted();
	}

	public void startup() {
		StrategyDBManager.getInstance().serverStarting();
	}

}
