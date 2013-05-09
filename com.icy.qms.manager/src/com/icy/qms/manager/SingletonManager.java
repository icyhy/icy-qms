package com.icy.qms.manager;

import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.icy.qms.base.interfaces.IQServer;
import com.icy.qms.core.QServer;

public class SingletonManager {
	
	private Injector injector;
	public SingletonManager(){
		//通过反射构建IQServer实例
		injector = Guice.createInjector(new DiModule()); 
	}

	@Inject
	 private IQServer server;
	 public IQServer getServer() {
		 return server;
	}
	
	public IQServer getQServer(){
		return (IQServer)injector.getInstance(SingletonManager.class).getQServer();
	}
}
