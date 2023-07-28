package button;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\seleniumjars\\seleniumjars\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.lambdatest.com/");

		driver.findElement(By.linkText("Login")).click();
	}

}
