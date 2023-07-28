package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest1 {

	@Test
	public void test3() {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver","F:\\seleniumjars\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");

	}

	@Test
	public void test4() {
		System.out.println("in test4");

	}
}
