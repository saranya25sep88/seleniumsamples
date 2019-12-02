package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhilli\\eclipse-workspace\\seleniumsample\\NewDriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.instagram.com");	
		
		driver.findElement(By.name("emailOrPhone")).sendKeys("abc@gmail.com");
		Thread.sleep(1000);		
		driver.findElement(By.name("fullName")).sendKeys("sharanya");
		Thread.sleep(1000);		
		driver.findElement(By.name("username")).sendKeys("saranya");
		Thread.sleep(1000);		
		driver.findElement(By.name("password")).sendKeys("12345");
		Thread.sleep(1000);		
		driver.findElement(By.name("submit")).click();
		// TODO Auto-generated method stub

	}

}
