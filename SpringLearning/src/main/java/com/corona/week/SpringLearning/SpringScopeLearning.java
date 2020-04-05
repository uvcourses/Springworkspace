package com.corona.week.SpringLearning;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.corona.week.SpringLearning.Scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringScopeLearning {

	private static Logger LOGGER =LoggerFactory.getLogger
			(SpringScopeLearning.class);
	
	public static void main(String[] args) {
		
		
		ApplicationContext app=new AnnotationConfigApplicationContext(SpringScopeLearning.class);
		PersonDAO personDAO=app.getBean(PersonDAO.class); 
		PersonDAO personDAO1=app.getBean(PersonDAO.class); 
	     LOGGER.info("{}");
	     LOGGER.info("{}");

	     LOGGER.info("{}");
	     LOGGER.info("{}");


	}

}
