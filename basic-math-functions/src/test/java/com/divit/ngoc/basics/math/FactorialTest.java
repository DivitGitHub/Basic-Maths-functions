package com.divit.ngoc.basics.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FactorialTest {

	private Factorial factorial;

	@BeforeEach
	void setUp() throws Exception {
		factorial = new Factorial();
	}

	@Test
	void testGetFactorial() {
		assertEquals(1, factorial.getFactorial(1));
		assertEquals(120, factorial.getFactorial(5));
		assertEquals(5040, factorial.getFactorial(7));
	}

}