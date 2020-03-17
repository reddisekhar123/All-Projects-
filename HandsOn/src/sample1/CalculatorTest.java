package sample1;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase{
	
	public CalculatorTest() {
		
		super();
	}
	
	public void testFact() {
		Calculator cal=new Calculator();
	        assertEquals(120,cal.factorial(5));
	        
	}
}
	
	

	
	
	
	


