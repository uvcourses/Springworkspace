import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	Calculator c=new Calculator(); 
	@Test
	void test() {
        		
         assertEquals(10,  c.Addition(5, 5));
         assertEquals(0, c.sub(5, 5));
	}
	
	

}
