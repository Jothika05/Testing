package com.example;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hardAssert {
WebDriver wd = null;

	@Test
	public void test1() {
		wd.get("https://www.google.com/");
		String title = wd.getTitle();
		String url = wd.getCurrentUrl();
		assertEquals("Googl", title); // error ,the flow is terminated
		assertEquals("https://www.google.com/", url);
	}

	@Test
	public void test2() {
		System.out.println("in test2");
		wd.get("https://www.amazon.in/");

	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("in beforetest");
		WebDriverManager.chromedriver().setup();
		wd = new ChromeDriver();
		wd.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		System.out.println("in aftertest");
		wd.close();
	}
}
