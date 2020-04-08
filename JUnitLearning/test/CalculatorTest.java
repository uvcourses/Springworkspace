import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator c = new Calculator();

	@BeforeEach
	public void before() {
      System.out.println("Before Annotation");
		
	}
	@AfterEach
	public void testAfter() {
      System.out.println("After Annotation");
		
	}
	@BeforeAll
	public static void testBeforeClass() {
      System.out.println("Before Class Annotation");
		
	}
	@AfterAll
	public static void testAfterClass() {
      System.out.println("After Class Annotation");
		
	} 
	
	@Test
	 public void test3numbers() { 
		System.out.println("Test");
		assertEquals(10, c.Addition(5, 5));
		assertEquals(0, c.sub(5, 5));
	}
	
}
