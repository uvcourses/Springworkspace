package com.corona.week.SpringLearning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.corona.week.SpringLearning.properties.SomeExternalFiles;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringLearningProperties {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(
				SpringLearningProperties.class)) {

			SomeExternalFiles properties = app.getBean(SomeExternalFiles.class);

			System.out.println(properties.getUrl());

		}
	}
}
