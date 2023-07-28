package com.example;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class softAssert {
WebDriver wd=null;
	  @Test
	  public void test1() {
		  SoftAssert as=new SoftAssert();//error ,the flow is continued,and after last line error is shown.
		  wd.get("https://www.google.com/");
		  	String title=wd.getTitle();
		  	String url=wd.getCurrentUrl();
		  	as.assertEquals("Googl",title);
		  	as.assertEquals("https://www.google.com/", url);
		  	System.out.println("after google");
		  	as.assertAll(); //provide all the assert failures at the last
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
		  wd=new ChromeDriver();
		  wd.manage().window().maximize();
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("in aftertest");
		  wd.close();
	  }

	}



