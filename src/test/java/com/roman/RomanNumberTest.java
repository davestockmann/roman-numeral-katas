package com.roman;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumberTest {

	@Test
	public void one() {
		Assert.assertEquals("I", toRoman(1));
	}

	@Test
	public void two() {
		Assert.assertEquals("II", toRoman(2));
	}

	@Test
	public void three() {
		Assert.assertEquals("III", toRoman(3));
	}

	@Test
	public void four() {
		Assert.assertEquals("IV", toRoman(4));
	}

	@Test
	public void five() {
		Assert.assertEquals("V", toRoman(5));
	}

	@Test
	public void six() {
		Assert.assertEquals("VI", toRoman(6));
	}

	@Test
	public void seven() {
		Assert.assertEquals("VII", toRoman(7));
	}

	@Test
	public void eight() {
		Assert.assertEquals("VIII", toRoman(8));
	}

	@Test
	public void nine() {
		Assert.assertEquals("IX", toRoman(9));
	}

	@Test
	public void ten() {
		Assert.assertEquals("X", toRoman(10));
	}

	@Test
	public void eleven() {
		Assert.assertEquals("XI", toRoman(11));
	}

	@Test
	public void fourteen() {
		Assert.assertEquals("XIV", toRoman(14));
	}

	@Test
	public void oneHundred() {
		Assert.assertEquals("C", toRoman(100));
	}

	@Test
	public void twoFiftySix() {
		Assert.assertEquals("CLVI", toRoman(156));
	}

	@Test(expected = IllegalArgumentException.class)
	public void numberTooLarge() {
		toRoman(3001);
	}

	private String toRoman(int number) {
		RomanNumber roman = new RomanNumber(number);
		System.out.println(roman.toString());
		return roman.toString();
	}
}
