package com.corona.week.SpringLearning;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.corona.week.SpringLearning.xml.XMLPersonDAO;

@Configuration
@ComponentScan
public class SpringXMLConfiguration {

	
	public static void main(String[] args) {

		ClassPathXmlApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");
		XMLPersonDAO xmlPersonDAO=app.getBean(XMLPersonDAO.class);  
		
		System.out.println(" --> "+app.getBeanDefinitionNames());

	}

}
