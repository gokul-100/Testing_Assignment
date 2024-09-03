package io.cal;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
public class LifeCyleAnnotationsTest {

	LifeCycleAnnotation m ;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("this is wll run before all the methods");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("this will run at Last");
	}
	@BeforeEach
	void init() {
		 m =new LifeCycleAnnotation();
}
	@AfterEach
	void cleanUp() {
		System.out.println("Clean Up Now");
}
	@Nested
	class testPositiveNumber{
		@BeforeEach
		void init() {
			 m =new LifeCycleAnnotation();
	}
		@Test
		void testNegative() {
			int expected=2;
			int actual =m.positive(-2,-2);
			assertEquals(expected,actual, "should return a positive value");
		}
	}
}
