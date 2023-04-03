package com.gofortrainings.newsportal.core.models;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class StudentDetails {
	@ValueMapValue
	private String stName;
	@ValueMapValue
	private String stImage;
	@ValueMapValue
	private String dropDown;
	@ValueMapValue
	private String checkBox;
	public String getStName() {
		return stName;
	}
	public String getStImage() {
		return stImage;
	}
	public String getDropDown() {
		return dropDown;
	}
	public String getCheckBox() {
		return checkBox;
	}
	
	

}
