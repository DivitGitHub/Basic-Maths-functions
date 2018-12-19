package com.divit.ngoc.basics.math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class QuadraticEquationTest {

	private QuadraticEquation quadraticEquation;

	@BeforeEach
	void setUp() throws Exception {
		quadraticEquation = new QuadraticEquation();
	}

	@Test
	void testSolveQuadratic() {
		double[] result = { -1.0, -1.0 };
		assertArrayEquals(result, quadraticEquation.solveQuadratic(2, 4, 2));
		assertNull(quadraticEquation.solveQuadratic(0, 2, 4));
		assertNull(quadraticEquation.solveQuadratic(10, 2, 2));
	}

}
