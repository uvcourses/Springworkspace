package com.corona.week.SpringLearning.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
@Qualifier("quickSort")
public class QuickSort implements SortingAlgorithm{

	@Override
	public int[] sort(int[] a) {
		// TODO Auto-generated method stub
		return new int[] {10,30,40};
	}

}
