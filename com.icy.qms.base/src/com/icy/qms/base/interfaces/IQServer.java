package com.icy.qms.base.interfaces;

public interface IQServer {

	//同步方法
	boolean startServer();
	
	boolean stopServer();
	
	//异步方法
	void getTicket();
}
