package com.divit.ngoc.basics.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimeNumberCheckerTest {

	private PrimeNumberChecker checker;
	
	@BeforeEach
	void setUp() throws Exception {
		checker = new PrimeNumberChecker();
	}

	@Test
	void testIsPrimeNumber() {
		assertFalse(checker.isPrimeNumber(1));
		assertTrue(checker.isPrimeNumber(2));
		assertFalse(checker.isPrimeNumber(4));
		assertTrue(checker.isPrimeNumber(37));
		assertFalse(checker.isPrimeNumber(38));
	}

}