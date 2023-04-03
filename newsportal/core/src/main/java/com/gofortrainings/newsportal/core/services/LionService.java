package com.gofortrainings.newsportal.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true,service = LionService.class)
public class LionService {
	private static final Logger logger = LoggerFactory.getLogger(LionService.class);
	
	@Activate
	public void active() {
		logger.info("Newsportal is Activated");
		logger.info("Rupas");
	}
	@Modified
	public void modified() {
		logger.info("Newsportal is Modified");
	}
	@Deactivate
	public void deActive() {
		logger.info("Newsportal is deactivated");
	}
	public String eat(String foodType) {
		logger.info(" Lion is eating " + foodType);
		return " Lion is eating " + foodType;
	}
	
	

}

