package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameterTest {

	WebDriver wd = null;

	@Parameters("url1")
	@Test
	public void test1(String url1) {
		wd.get(url1);

	}

	@Parameters("url2")
	@Test
	public void test2(String url2) {
		System.out.println("in test2");
		wd.get(url2);

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
