package com.corona.week.SpringLearning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.corona.week.SpringLearning.cdi.SomeCDiBusiness;

@Configuration
@ComponentScan
public class SpringCDIApplication {

	private static Logger LOGGER =(Logger) LoggerFactory.getLogger
			(SpringCDIApplication.class);
	
	public static void main(String[] args) {
		
		
		ApplicationContext app=new AnnotationConfigApplicationContext (SpringCDIApplication.class);
		SomeCDiBusiness someCDIDAO=app.getBean(SomeCDiBusiness.class); 
	     LOGGER.info("{}");



	}

}
