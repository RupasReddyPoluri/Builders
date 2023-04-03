package com.gofortrainings.newsportal.core.servlets;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.jcr.Node;
import javax.servlet.Servlet;
import javax.servlet.ServletException;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.ModifiableValueMap;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.servlets.annotations.SlingServletResourceTypes;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = Servlet.class, immediate = true)
@SlingServletResourceTypes(resourceTypes = "newsportal/components/page", extensions = "txt",selectors = "xyz")
public class NewsportalNodeRetrive extends SlingSafeMethodsServlet {
	
	private static final Logger log = LoggerFactory.getLogger(NewsportalNodeRetrive.class);
	
	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		
		
		try {
			ResourceResolver resolver = request.getResourceResolver();
			
			// /content/retriveNodeData
			
			Resource nodeRes = resolver.getResource("/content/retriveNodeData");
			
			// JCR
			Node infoNode = nodeRes.adaptTo(Node.class);
			infoNode.getProperties("name");		
			infoNode.setProperty("testNode", "nodeval");
			
			
			//sling
			ValueMap infoVM = nodeRes.getValueMap();
			infoVM.get("name", String.class);
			
			ModifiableValueMap map = nodeRes.adaptTo(ModifiableValueMap.class);
			map.put("modifyVM", "This is a modify VM");
			nodeRes.getResourceResolver().commit();
			
			response.getWriter().write("From node : " + infoNode.getProperties("name").toString() + "from sling : " + infoVM.get("name", String.class));
		} catch (Exception e) {
			log.info("There is an error in NewsportalNodeRetrive : " + e.getMessage());
		}
		
		
		
		
		
	}

}
