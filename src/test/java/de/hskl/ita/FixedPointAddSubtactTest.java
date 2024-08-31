package de.hskl.ita;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FixedPointAddSubtactTest {

	private static double delta;
	private static double x, y, z, correctSum, correctDifference;
	private static FixedPointNumber lengths;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		int s = 200,
	        v = 200;
		
	    lengths = new FixedPointNumber(s, v);
	    
	    x = 1.0;
	    y = 2.0;
	    z = 5.0;
	    correctSum = 3.0;
	    correctDifference = 4.0;
		delta = 0.001;
	}

	@Test
	void testAdd() {               
        lengths.set(x);
        lengths.add(y);
		assertEquals(correctSum, lengths.get(), delta);
	}
	
	@Test
	void testSubtract() {               
        lengths.set(z);
        lengths.subtract(x);
		assertEquals(correctDifference, lengths.get(), delta);
	}
}
