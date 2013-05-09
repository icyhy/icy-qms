package com.icy.qms.demo;

import com.icy.qms.base.interfaces.IQServer;
import com.icy.qms.manager.SingletonManager;

public class QServerDemo {
	
	
	private final static org.apache.logging.log4j.Logger _Logger = org.apache.logging.log4j.LogManager
			.getLogger(QServerDemo.class); 
	
	public static void main(String[] args){
		_Logger.info("启动QServer演示");
		_Logger.info("****************************************");
		SingletonManager manager = new SingletonManager();
		IQServer server = manager.getQServer();
		
		boolean result = server.startServer();
		_Logger.info(result ? "启动成功":"启动失败");
		
	}
}
