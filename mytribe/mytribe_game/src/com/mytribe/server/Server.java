package com.mytribe.server;

public interface Server {
	
	public void startNetListener();
	public void close();
	
	public void onStartFinish();

}
