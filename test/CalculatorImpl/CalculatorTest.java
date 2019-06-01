package CalculatorImpl;

import static org.junit.Assert.*;

import org.junit.Test;

import ma.ac.insea.calculator.implementations.CalculatorImpl;

public class CalculatorTest {

	@Test
	public void testAdd() {
		CalculatorImpl cal = new CalculatorImpl();
		int a = 5, b=7;
		if(cal.add(a, b) != 12)
			fail("tous positif");
		
		a = -5; b=7;
		if(cal.add(a, b) != 2)
			fail("a est negatif");
		
		a = 5; b=-7;
		if(cal.add(a, b) != -2)
			fail("b est negatif");
		
		a = 0; b=7;
		if(cal.add(a, b) != 7)
			fail("a est nul et b positif");
		
		a = 0; b=-7;
		if(cal.add(a, b) != -7)
			fail("a est nul et b negatif");
		
		a = 5; b=0;
		if(cal.add(a, b) != 5)
			fail("a est positif et b nul");
		
		a = -5; b=0;
		if(cal.add(a, b) != -5)
			fail("a est negatif et b nul");
		
	}

	@Test
	public void testSubstact() {
		testAdd();
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

}
