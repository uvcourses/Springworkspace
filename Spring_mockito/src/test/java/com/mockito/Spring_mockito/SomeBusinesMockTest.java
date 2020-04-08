package com.mockito.Spring_mockito;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinesMockTest {
	
	SomeBusinessImpl somebusinessImpl=new SomeBusinessImpl(); 

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void testfindGreatestAmongAllData() { 
		somebusinessImpl.findGreatestAmongAllData();
	}
}
