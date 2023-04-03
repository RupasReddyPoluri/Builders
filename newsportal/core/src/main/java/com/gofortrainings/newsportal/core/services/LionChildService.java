package com.gofortrainings.newsportal.core.services;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true,service=LionChildService.class)
@Designate(ocd = LionConfig.class)
public class LionChildService {
	private static final Logger logger = LoggerFactory.getLogger(LionChildService.class);
	//@Reference
	//private LionService lionService;
	 
	LionConfig lionConfig;
	private String message;
	@Activate
	public void active(LionConfig lionConfig) {
		this.lionConfig = lionConfig;
		message = lionConfig.food();
		logger.info("news portal bundles activated from LionChild");
	    logger.info("This is LionChildService:" + lionConfig.food());
	}
	public String food() {
		return message;
	}

}
