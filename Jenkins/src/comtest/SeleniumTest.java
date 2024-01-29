package comtest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import comtest.SimpleBase;

public class SeleniumTest extends SimpleBase{
	WebDriver driver;
	
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
