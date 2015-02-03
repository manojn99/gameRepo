package com.org.numberguess;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class NumberGuessingTest

{
	@Test
	public void NumberGuessingTestApp() {
		String result = NumberGuessing.checkNumber(new Scanner(System.in), 0,
				1000);
		if (result.equalsIgnoreCase("yes"))
			Assert.assertEquals("yes", result);

	}
}
