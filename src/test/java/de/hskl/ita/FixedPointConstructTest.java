package de.hskl.ita;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FixedPointConstructTest {

	private static int s, v, correctInt;
	private static double delta;
	private static double x, correctValue, correctDefault;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		s = 200;
	    v = 200;
		
	    
        x = 1.0;
	    correctValue = 1.0;
	    correctDefault = 1.0;
	    correctInt = 0;

		delta = 0.001;
	}

	@Test
	void testConstructorAll() { 
		
		FixedPointNumber lengths = new FixedPointNumber(s, v, x);
		assertEquals(correctValue, lengths.get(), delta);
	}
	
	@Test
	void testConstructorsv() { 
		
		FixedPointNumber lengths = new FixedPointNumber(s, v);
		assertEquals(correctDefault, lengths.get(), delta);
	}
	
	@Test
	void testConstructorsvInt() { 
		
		FixedPointNumber lengths = new FixedPointNumber(s, v);
		assertEquals(correctInt, lengths.getValue());
	}
	
}
