package com.epam.rp.test;

import org.testng.annotations.Test;

public class SimpleTest extends BaseTest {
	@Test
	public void m() {
		System.out.println("Test in Class: " + getClass().getName());
	}
}
