package com.gofortrainings.newsportal.core.models;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, service = TigerService.class)
@Designate(ocd = TigerConfig.class)
public class TigerService {
	
	private static final Logger logger = LoggerFactory.getLogger(TigerService.class);
	
	
	TigerConfig tigerConfig;
	private String name;

	@Activate
	public void active(TigerConfig tigerConfig) {
		this.tigerConfig=tigerConfig;
		logger.info("Tiger config value : " + tigerConfig.food());
		name = tigerConfig.food();
	}
	public String food() {
		return name;
	}
	
}
