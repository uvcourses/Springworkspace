package com.corona.week.SpringLearning.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearch {
	@Autowired
	@Qualifier("bubbleSort")
	SortingAlgorithm sortingAlgorithm;

	public int binarySearch(int a[],int searchNum) { 
		
		int [] sort=sortingAlgorithm.sort(a); 
		
		return sort[2];
	} 
}
