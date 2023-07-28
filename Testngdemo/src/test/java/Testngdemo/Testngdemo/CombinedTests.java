package Testngdemo.Testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import java.time.Duration;

public class CombinedTests {
	private WebDriver wd;

	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumjars\\seleniumjars\\chromedriver.exe");
		wd = new ChromeDriver();
	}

	@Test(priority = 1)
	public void addToCartTest() {
		wd.get("https://cupsofmagik.com/");
		wd.manage().window().maximize();
		WebElement AddCartBut = wd.findElement(By.id("AddToCart-1608048234b059c376"));
		AddCartBut.click();
	}

	@Test(priority = 2)
	public void googleSearchTest() {
		wd.get("https://google.com");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(Duration.ofMinutes(2).getSeconds(), TimeUnit.SECONDS);
		WebElement textField = wd.findElement(By.name("q"));
		textField.sendKeys("What is Testing?");
		WebElement btnRef = wd.findElement(By.name("btnK"));
		btnRef.sendKeys(Keys.ENTER);
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Test(priority = 3)
	public void loginTest() {
		// Open the website
		wd.get("https://practicetestautomation.com/practice-test-login/");

		// Perform login
		wd.findElement(By.name("username")).sendKeys("student");

		wd.findElement(By.id("password")).sendKeys("Password123");
		wd.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).click();
	}

	@Test(priority = 4)

	public void UserRegistrationTest() {
		// Open the website
		wd.get("https://demo.wpeverest.com/user-registration/buyer-registration-form/");

		wd.findElement(By.id("first_name")).sendKeys("Arul");
		wd.findElement(By.name("last_name")).sendKeys("Siva");
		wd.findElement(By.name("user_email")).sendKeys("admin@gmail.com");
		wd.findElement(By.id("user_login")).sendKeys("Abcd234");
		wd.findElement(By.name("user_pass")).sendKeys("Anhjvbf@122");
		wd.findElement(By.id("input_box_1665975552")).sendKeys("100, Gandhi street");

		// Find the country dropdown element with name "country_1665975572"
		WebElement countryDropdown = wd.findElement(By.name("country_1665975572"));

		// Create a new Select object and pass the country dropdown element to it
		Select selectCountry = new Select(countryDropdown);

		// Select the option "India" from the country dropdown
		selectCountry.selectByVisibleText("India");

		wd.findElement(By.xpath("/html/body/div[1]/main/div/div/div/article/div/div/form/div[1]/div/div[10]/p/input"))
				.sendKeys("(235) 454-6324");

		wd.findElement(By.cssSelector("button.ur-submit-button")).click();

	}

	@AfterMethod
	public void afterMethod() throws InterruptedException {
		wd.close();
	}
}
