package Testngdemo.Testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class logintest {

	private WebDriver driver;

	@BeforeTest
	public void setUp() {
		// Set the path to the chromedriver executable
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumjars\\seleniumjars\\chromedriver.exe");

		// Create a new instance of the ChromeDriver
		driver = new ChromeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();
	}

	@Test
	public void loginTest() {
		// Open the website
		driver.get("https://practicetestautomation.com/practice-test-login/");

		// Perform login
		driver.findElement(By.name("username")).sendKeys("student");

		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).click();
	}

	@AfterTest
	public void tearDown() {
		// Close the browser and clean up resources
		driver.quit();
	}
}
