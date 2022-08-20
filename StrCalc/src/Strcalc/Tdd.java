package Strcalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tdd {
	
	StringCalculator strc=new StringCalculator();
	
	@Test
	public void sumofEmptyString() {
		assertEquals(0,strc.add(""));
	}
	
	@Test
	public void sumOfSingleDigit() {
		assertEquals(1,strc.add("1"));
	}
	
	@Test
	public void sumOftwoDigit() {
		assertEquals(3,strc.add("1,2"));
	}
	
	
	

}
