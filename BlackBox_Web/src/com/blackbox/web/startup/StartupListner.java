package com.blackbox.web.startup;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.Logger;

public class StartupListner implements ServletContextListener{

	private static Logger logger = Logger.getLogger(StartupListner.class);
	
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		logger.info("-----------------------------------------------------------------------");
		logger.info("------------Inizializzazione del contesto applicativo------------------");
		logger.info("-----------------------------------------------------------------------");
		
	}

}
