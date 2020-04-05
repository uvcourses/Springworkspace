package com.corona.week.SpringLearning;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.corona.week.SpringLearning.basics.BinarySearch;

@Configuration
@ComponentScan
public class SpringLearningApplication {

	
	public static void main(String[] args) {
		
		ApplicationContext app= new AnnotationConfigApplicationContext(
				SpringLearningApplication.class); 
		
		 BinarySearch binarySearch=app.getBean(BinarySearch.class); 
		 
		 System.out.println(binarySearch);

	}
}
