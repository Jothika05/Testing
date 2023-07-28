package com.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest {
	
	
	  @Test
	  public void test1() {
		 WebDriverManager.chromedriver().setup();	  
		//  System.setProperty("webdriver.chrome.driver","F:\\seleniumjars\\chromedriver.exe");
		  WebDriver wd=new ChromeDriver();
		  wd.manage().window().maximize();
		  wd.get("https://www.amazon.in/");
		  wd.close();
	  }
	  
	  
	  @Test
	  public void test2() {
		 System.out.println("hi"); 
	  }
	  
	 
	}


 
	//before and after method
// 	
//	 WebDriver wd=null;
//	  @Test
//	  public void test1() {
//		  System.out.println("in test1");
//			  wd.get("https://www.google.com/");
//	  }
//	  
//	  @Test
//	  public void test2() {
//		  System.out.println("in test2");
//			  wd.get("https://www.amazon.in/");
//			  
//
//	  }
//	  
//	  @BeforeTest
//	  public void beforeTest() {
//		  System.out.println("in beforetest");
//		  WebDriverManager.chromedriver().setup();	 
//		  wd=new ChromeDriver();
//		  wd.manage().window().maximize();
//	  }
//
//	  @AfterTest
//	  public void afterTest() {
//		  System.out.println("in aftertest");
//		  wd.close();
//	  }
//
//} 
//	
