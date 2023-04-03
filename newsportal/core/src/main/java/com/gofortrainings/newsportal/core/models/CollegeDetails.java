package com.gofortrainings.newsportal.core.models;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import com.gofortrainings.newsportal.core.services.LionChildService;

@Model(adaptables = Resource.class,defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class CollegeDetails {
	@ValueMapValue
	private String collegeTitle;
	@OSGiService
	 LionChildService lionChildService;
	 private String message1;
	public LionChildService getLionChildService() {
		return lionChildService;
	}
	
	@ChildResource
	List<StudentDetails> students;
	public String getCollegeTitle() {
		return collegeTitle;
	}
	public List<StudentDetails> getStudents() {
		return students;
	}
	public String getMessage1() {
		return message1;
	}
	@PostConstruct
	public void init() {
		message1=lionChildService.food();
	}
	
	

}
