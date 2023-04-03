package com.gofortrainings.newsportal.core.models;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, service = AnimalService.class)
public class AnimalService {
	
	private static final Logger logger = LoggerFactory.getLogger(AnimalService.class);

	@Activate
	public void active() {
		logger.info("Newsportal Bundles is activated....");
	}

	@Modified
	public void modify() {
		logger.info("Newsportal Bundles is modified....");
	}
	
	@Deactivate
	public void deActivate() {
		logger.info("Newsportal Bundles is deactivated....");
	}
	
	public String eat(String foodType) {
		logger.info("Animal is eating " + foodType);
		return "Animal is eating " + foodType;
	}
}
