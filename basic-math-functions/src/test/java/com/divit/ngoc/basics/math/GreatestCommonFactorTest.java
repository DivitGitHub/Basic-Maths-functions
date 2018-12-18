package com.divit.ngoc.basics.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GreatestCommonFactorTest {

	private GreatestCommonFactor gcf;

	@BeforeEach
	void setUp() throws Exception {
		gcf = new GreatestCommonFactor();
	}

	@Test
	void testGetGcf() {
		assertEquals(10, gcf.getGcf(10, 20));
		assertEquals(11, gcf.getGcf(44, 77));
	}

}
