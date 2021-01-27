package com.epam.rp.test;

import org.testng.annotations.Test;

public class TestAll extends BaseTest{
	@Test
	public void m() {
		System.out.println("Test in Class: " + getClass().getName());
	}

	@Test
	public void m2() {
		System.out.println("Test in Class: " + getClass().getName());
	}

	@Test
	public void m3() {
		System.out.println("Test in Class: " + getClass().getName());
	}
}
