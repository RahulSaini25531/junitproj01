package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.nt.service.ArithmeticOperations;

public class TestArithmeticOperation {

	private static ArithmeticOperations ar;
	
	@BeforeAll
	public static void setUp()
	{
		System.out.println("TestArithmeticOperation.setUp()");
		ar= new ArithmeticOperations();
	}
	
	@Test
	public void testSumWithPositives()
	{
		System.out.println("TestArithmeticOperation.testSumWithPositives()");
		int val1=10;
		int val2=20;
		int expected=30;
		int actual = ar.sum(val1, val2);
		assertEquals(expected, actual);
		
	}
	
	
	@Test
	public void testSumWithNegatives()
	{
		System.out.println("TestArithmeticOperation.testSumWithNegatives()");
		int val1=-10;
		int val2=-20;
		int expected=-30;
		int actual = ar.sum(val1, val2);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testSumWithZeroes()
	{
		System.out.println("TestArithmeticOperation.testSumWithZeroes()");
		int val1=0;
		int val2=0;
		int expected=0;
		int actual = ar.sum(val1, val2);
		assertEquals(expected, actual);
		
	}
	
	@Test
	@Disabled
	public void testSumWithMixeValues()
	{
		System.out.println("TestArithmeticOperation.testSumWithMixeValues()");
		int val1=10;
		int val2=-20;
		int expected= -10;
		int actual = ar.sum(val1, val2);
		assertEquals(expected, actual);
		
	}
	@AfterAll
	public static void tearDown()
	{
		System.out.println("TestArithmeticOperation.tearDown()");
		ar=null;
	}
}
