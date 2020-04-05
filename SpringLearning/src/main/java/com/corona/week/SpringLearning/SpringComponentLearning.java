package com.corona.week.SpringLearning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.corona.week.componentscan.ComponentDAO;

@Configuration
@ComponentScan
public class SpringComponentLearning {

	private static Logger LOGGER =LoggerFactory.getLogger
			(SpringComponentLearning.class);
	
	public static void main(String[] args) {
		
		
		ApplicationContext app=new AnnotationConfigApplicationContext(SpringComponentLearning.class);
		
		ComponentDAO componentDAO=app.getBean(ComponentDAO.class); 
		ComponentDAO componentDAO1=app.getBean(ComponentDAO.class); 
	     LOGGER.info("{}",componentDAO);
	     LOGGER.info("{}",componentDAO.getJdbcConnection());

	     LOGGER.info("{}",componentDAO);
	     LOGGER.info("{}",componentDAO.getJdbcConnection());


	}

}
