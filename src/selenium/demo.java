package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo {

	public static void main(String[] args) throws InterruptedException { 
		
		System.setProperty("webdriver.chrome.driver","D:\\Personal\\selenium\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/automation-practice-form/");	
		
		driver.findElement(By.name("firstname")).sendKeys("Saranya");// TODO Auto-generated method stub
		Thread.sleep(1000);	
		driver.findElement(By.name("lastname")).sendKeys("Shanmugam");
		Thread.sleep(1000);	
		driver.findElement(By.id("sex-0")).click();
		Thread.sleep(1000);	
		driver.findElement(By.name("exp")).click();
		Thread.sleep(1000);	
		driver.findElement(By.id("datepicker")).sendKeys("25/9/1988");
		Thread.sleep(1000);	
		List <WebElement> elements = driver.findElements(By.xpath("(//*[@name=\"profession\"])"));
		for(int i=0;i<elements.size();i++)
		{
			elements.get(i).click();
			Thread.sleep(1000);	
	}

}
}