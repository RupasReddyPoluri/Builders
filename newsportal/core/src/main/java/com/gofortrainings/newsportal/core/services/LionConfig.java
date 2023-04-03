package com.gofortrainings.newsportal.core.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Lion configurations",description = "This config helps for providing runtime values for LionChildService.")
public @interface LionConfig {
@AttributeDefinition(name = "food",description = "What LionChild Eats",required = true )
public String food ()default "Test Meal";
}
