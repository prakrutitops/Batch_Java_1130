package com.list;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class mylistener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
System.out.println("App Stopped");		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
System.out.println("App Started");		
	}

}
