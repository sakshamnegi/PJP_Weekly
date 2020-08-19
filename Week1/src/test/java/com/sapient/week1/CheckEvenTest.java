package com.sapient.week1;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CheckEvenTest {
	
	private CheckEven obj;
	
	@Before
	public void setup() {
		obj = new CheckEven();
	}
	

	@Test
	public void testEven() {
		boolean ans = obj.check(12);
		assertTrue(ans==true);
	}
	
	@Test
	public void testOdd() {
		boolean ans = obj.check(5);
		assertTrue(ans==false);
	}
	
	@Test
	public void testMore() {
		boolean ans = obj.check(100);
		assertTrue(ans == true);
	}

}
