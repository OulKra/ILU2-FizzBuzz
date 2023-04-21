package fizzBuzz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import Class.FizzBuzz;

public class FizzBuzzTest {
	
	@Test
	public void fizzBuzz1()
	{
		assertEquals(FizzBuzz.fizzbuzz(1), "1");
	}
	
	@Test
	public void fizzBuzz2()
	{
		assertEquals(FizzBuzz.fizzbuzz(2), "2");
	}

}
