package locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) {
        // Set ChromeDriver system property
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumjars\\seleniumjars\\chromedriver.exe");

        // Create a ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("http://127.0.0.1:5500/forms.html");

        // Maximize the browser window
        driver.manage().window().maximize();

        driver.findElement(By.partialLinkText("Go to Google")).click();

        // Close the browser
       // driver.quit();
    }
}
