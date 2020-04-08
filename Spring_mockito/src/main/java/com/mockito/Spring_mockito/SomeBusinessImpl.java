package com.mockito.Spring_mockito;

public class SomeBusinessImpl {
   private DataService dataService;
   
   
   int findGreatestAmongAllData () { 
	   int []data=dataService.reterieveAllDataService(); 
	   int greatest =Integer.MIN_VALUE; 
	   
	   for(int value : data) { 
		   if(value > greatest) { 
			   greatest=value;
		   }
	   }
	   
	   return greatest;
   }
   
}
