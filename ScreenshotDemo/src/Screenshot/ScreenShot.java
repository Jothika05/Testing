package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		   // Set ChromeDriver system property
        System.setProperty("webdriver.chrome.driver", "D:\\seleniumjars\\seleniumjars\\chromedriver.exe");

        // Create a ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Open the website
        driver.get("https://www.amazon.in/");

        // Maximize the browser window
        driver.manage().window().maximize();
        
    File fsrc= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    File dest=new File("./snaps/img.png");
    FileHandler.copy(fsrc, dest);
    
    
    WebElement element=driver.findElement(By.className("a-color-base"));
    File elementsrc= element.getScreenshotAs(OutputType.FILE);
    File  elementdest=new File("./snaps/img3.png");
    FileHandler.copy(elementsrc, elementdest);
    
 
     
	}
	
}
