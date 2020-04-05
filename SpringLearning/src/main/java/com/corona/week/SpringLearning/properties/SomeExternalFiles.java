package com.corona.week.SpringLearning.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalFiles {
    @Value("${service.url}")
	private String url; 
	
	public String getUrl() { 
		
		return url;
	}
	
}
