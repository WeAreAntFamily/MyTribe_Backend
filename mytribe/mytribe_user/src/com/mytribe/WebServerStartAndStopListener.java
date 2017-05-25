package com.mytribe;


import java.util.Enumeration;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;

public class WebServerStartAndStopListener implements ServletContextListener {
	
	private static final Logger logger = LoggerFactory.getLogger(WebServerStartAndStopListener.class);

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}

	@SuppressWarnings({ "rawtypes", "unused" })
	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		try {
			/**
			 * tomcat在启动时会主动设置catalina.base路径
			 */
			String tomcatdir = System.getProperty("catalina.base");

			
			//WebSystemSetting.getInstance().serverParam.load(new FileInputStream(tomcatdir + "/conf/web.properties"));
			//WebSystemSetting.getInstance().reloadServerParam();
			//WebSystemSetting.getInstance().init();
			//WebSystemSetting.getInstance().setRealPath(arg0.getServletContext().getRealPath("WEB-INF"));
			//UserServer webServer = UserServer.getInstance();
			//webServer.startup();
			//arg0.getServletContext().setAttribute("WebServer", webServer);
			//StackTraceModule.getInstance().setServer(webServer);
		} catch (Exception e) {
			//LoggerProvider.addSpecialErrorlog("contextInitialized", e);
		}
	}
	
	
}
