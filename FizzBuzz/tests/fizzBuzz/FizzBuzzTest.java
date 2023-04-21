package fizzBuzz;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import Class.FizzBuzz;

public class FizzBuzzTest {
	
	@Test
	public void test()
	{
		assertEquals(FizzBuzz.fizzbuzz(1), "1");
	}

}
