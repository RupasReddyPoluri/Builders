package com.gofortrainings.newsportal.core.models;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Tiger configurations", description = "This config is help for providing runtime valuesn to tiger service.")
public @interface TigerConfig {

	@AttributeDefinition(name = "food", description = "What tiger eats", required = true)
	public String food() default "Test Meal";

}
