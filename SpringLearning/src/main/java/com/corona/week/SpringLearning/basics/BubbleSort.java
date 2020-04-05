package com.corona.week.SpringLearning.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubbleSort")
public class BubbleSort implements SortingAlgorithm{
	@Override
	public int[] sort(int[] a) {
		// TODO Auto-generated method stub
		return new int[] {10,20,30}	;
	}
}
