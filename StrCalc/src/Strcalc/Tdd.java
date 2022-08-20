package Strcalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tdd {
	
	StringCalculator strc=new StringCalculator();
	
	@Test
	public void sumofEmptyString() {
		assertEquals(0,strc.add(""));
	}
	

}
