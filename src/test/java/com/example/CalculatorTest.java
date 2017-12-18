package com.example;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	static Calculator obj;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj=new Calculator();
	}

	@Test
	public void testAdd() {
		int result=obj.add(2, 3);
		assertEquals(5,result);
	}

}
