package selenium;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nextclearance {

			public static void main(String[] args) throws InterruptedException, IOException { 
				
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhilli\\eclipse-workspace\\seleniumsample\\NewDriver\\chromedriver.exe" );
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.next.co.uk/clearance");	
				Actions ac = new Actions(driver);
				WebElement home1 = driver.findElement(By.xpath("//*[@id=\"MainNavigation\"]/div/ul/li[8]"));
				ac.moveToElement(home1).build().perform();
				Thread.sleep(3000);					
				WebElement link = driver.findElement(By.linkText("Curtains"));
				ac.click(link).build().perform();
				Thread.sleep(9000);
				TakesScreenshot tk = (TakesScreenshot)driver;
		        File src = tk.getScreenshotAs(OutputType.FILE);
		        File tk2 = new File("D:\\Personal\\selenium\\screen.jpg");
		        org.openqa.selenium.io.FileHandler.copy(src, tk2);
		        Thread.sleep(1000);
		        driver.quit();
		        

	}

}
