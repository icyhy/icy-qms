package com.icy.qms.manager;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.icy.qms.base.interfaces.IQServer;
import com.icy.qms.core.QServer;

public class DiModule extends AbstractModule {

	@Override
	protected void configure() {
		// TODO 自动生成的方法存根
		bind(IQServer.class).to(QServer.class);
	}

}
