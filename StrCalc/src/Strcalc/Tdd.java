package Strcalc;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tdd {
	
	StringCalculator strc=new StringCalculator();
	
	@Test
	public void sumofEmptyString() throws Exception {
		assertEquals(0,strc.add(""));
	}
	
	@Test
	public void sumOfSingleDigit() throws Exception {
		assertEquals(1,strc.add("1"));
	}
	
	@Test
	public void sumOftwoDigit() throws Exception {
		assertEquals(3,strc.add("1,2"));
	}
	
	@Test
	public void SumofUnknownAmtOfNum() throws Exception {
		assertEquals(15,strc.add("1,2,3,4,5,"));
	}
	
	@Test
	public void SumOfAlphabetsWithNum() throws Exception {
		assertEquals(6,strc.add("1,2,a,b"));
	}
	
	@Test(expected=Exception.class)
	public void NegativeNumNotAllowed() throws Exception{
		strc.add("-1");
	}
	

	@Test
	public void IgnoreDigitGT1000() throws Exception {
		assertEquals(1,strc.add("1,1001"));
	}
	
	@Test
	public void NewLineDelSupport() throws Exception {
		assertEquals(3,strc.add("1\n2"));
	}
	

}
