package locateElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathHandlingComplex {
    public static void main(String[] args) {
        // Set ChromeDriver system property
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumjars\\seleniumjars\\chromedriver.exe");

        // Create a ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("http://127.0.0.1:5500/forms.html");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Send keys to input fields using XPath

        // Student Name
        driver.findElement(By.xpath("//input[@name='student_name']")).sendKeys("Arul");

        // Student ID
        driver.findElement(By.xpath("//input[@name='student_id']")).sendKeys("123456");

        // Student Mail
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("arul@gmail.com");

        // Student Password
        driver.findElement(By.xpath("//input[@name='student_password']")).sendKeys("password1234567");

        // Close the browser
        // driver.quit();
    }
}
