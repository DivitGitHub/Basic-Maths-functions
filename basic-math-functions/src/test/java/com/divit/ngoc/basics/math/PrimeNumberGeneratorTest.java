package com.divit.ngoc.basics.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PrimeNumberGeneratorTest {

	private PrimeNumberGenerator primeNumberGenerator;

	@BeforeEach
	void setUp() throws Exception {
		primeNumberGenerator = new PrimeNumberGenerator();
	}

	@Test
	void testGenerate() {
		assertEquals(12, primeNumberGenerator.generate(40).size());
	}

}
