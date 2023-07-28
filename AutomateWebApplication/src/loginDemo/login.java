package loginDemo;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
		// Set the path to the chromedriver executable
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumjars\\seleniumjars\\chromedriver.exe");

		// Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Open the website
		driver.get("https://practicetestautomation.com/practice-test-login/");

		// Maximize the browser window
		driver.manage().window().maximize();

		driver.findElement(By.name("username")).sendKeys("student");
		
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).click();
		
	}
}
