package com.example;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileupload {

	public static void main(String[] args) throws IOException {
		// register the chrome driver
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumjars\\seleniumjars\\chromedriver.exe");

		// create an obj to the driver -obj to the browser
		// wd is the controller obj to web browser
		WebDriver wd = new ChromeDriver();

		// maxmize the screen
		wd.manage().window().maximize();
		
		wd.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		// web url
		wd.get("https://www.ilovepdf.com/pdf_to_word");
		wd.findElement(By.id("pickfiles")).click();
		Runtime.getRuntime().exec("D:\\fileupload.exe");
		// processTask
		//wd.findElement(By.cssSelector("#processTask")).click();
		//wd.close();
		
		////
	}

}
