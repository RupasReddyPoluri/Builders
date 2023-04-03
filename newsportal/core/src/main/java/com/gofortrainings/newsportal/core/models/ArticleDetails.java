package com.gofortrainings.newsportal.core.models;

import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.Required;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.OSGiService;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Model(adaptables = Resource.class, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ArticleDetails {
	final static Logger Logger = LoggerFactory.getLogger(ArticleDetails.class);
	private String message;

	@ValueMapValue
	@Default(values = "This is default value.")
	private String articleTitle;
	
	@ValueMapValue
	private String articleImg;
	
	@ValueMapValue
	private String articleDesc;
	
	@OSGiService
	TigerService tigerService;
	
	@ChildResource
	List<Student>student;
	
	
	public String getArticleTitle() {
		return articleTitle;
	}

	public String getArticleImg() {
		return articleImg;
	}

	public String getArticleDesc() {
		return articleDesc;
	}

	public List<Student> getStudent() {
		return student;
	}
	@PostConstruct
	public void init() {
		message = tigerService.food();
	}
	public String getMessage() {
		return message;
	}

		
	
}
