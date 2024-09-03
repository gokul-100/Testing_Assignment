package io.cal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorProjectTest {

//	@Test
	void test() {
		
		CalculatorProject c= new CalculatorProject();
		
		int expected =2;
		int actual = c.add(1, 1);
		
		
		assertEquals(expected, actual, "Add function can calculate two Integers");
		
			
	}
//	@Test
	void subtest() {
		
CalculatorProject c = new CalculatorProject();
		
		int expected = 0;
		int actual = c.sub(1, 1);		
		
		assertEquals(expected, actual, "Sub function can calculate two Integers");
		
	}
	
	
//	@Test
	void multest() {
		
CalculatorProject c = new CalculatorProject();
		
		int expected = 1;
		int actual = c.mul(1, 1);		
		
		assertEquals(expected, actual, "Mul function can calculate two Integers");
		
	}
	@Test
	void divTest() {
		CalculatorProject c = new CalculatorProject();
		assertThrows(NullPointerException.class, () -> c.div(5,0),"Div Function can calculate two integer");
	}
	

	
//	@Test
	void AreaOfCircleTest() {
		
		CalculatorProject c = new CalculatorProject();

		assertEquals(314.1592653589793, c.AreaOfCircle(10));
	}

}
