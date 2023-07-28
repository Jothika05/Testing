
package registerDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class register {

	public static void main(String[] args) {
		// Set the path to the chromedriver executable
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumjars\\seleniumjars\\chromedriver.exe");

		// Create a new instance of the ChromeDriver
		WebDriver driver = new ChromeDriver();

		// Open the website
		driver.get("https://demo.wpeverest.com/user-registration/buyer-registration-form/");

		// Maximize the browser window
		driver.manage().window().maximize();

		driver.findElement(By.id("first_name")).sendKeys("Aruljothi");
		driver.findElement(By.name("last_name")).sendKeys("Sivalingam");
		driver.findElement(By.name("user_email")).sendKeys("arul8@gmail.com");
		driver.findElement(By.id("user_login")).sendKeys("Arul054");
		driver.findElement(By.name("user_pass")).sendKeys("Adsdfghj@345");
		driver.findElement(By.id("input_box_1665975552")).sendKeys("674, Gandhi street");

		// Find the country dropdown element with name "country_1665975572"
		WebElement countryDropdown = driver.findElement(By.name("country_1665975572"));

		// Create a new Select object and pass the country dropdown element to it
		Select selectCountry = new Select(countryDropdown);

		// Select the option "India" from the country dropdown
		selectCountry.selectByVisibleText("India");

		driver.findElement(
				By.xpath("/html/body/div[1]/main/div/div/div/article/div/div/form/div[1]/div/div[10]/p/input"))
				.sendKeys("(235) 454-6324");

		driver.findElement(By.cssSelector("button.ur-submit-button")).click();
	}
}
