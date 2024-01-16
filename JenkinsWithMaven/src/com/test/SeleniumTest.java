package com.test;

import org.testng.annotations.Test;

import com.base.BaseClass;

public class SeleniumTest extends BaseClass{
	
	@Test
	public void firstTest() {
		System.out.println("TestCase #1");
	}
	
	@Test
	public void secondTest() {
		System.out.println("TestCase #2");
	}
	
	@Test
	public void thirdTest() {
		System.out.println("TestCase #3");
	}

}
