package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class launchbrowser {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhilli\\eclipse-workspace\\seleniumsample\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.facebook.com");		
		driver.navigate().to("https:\\\\www.google.com");
		
		
				
		driver.findElement(By.id("email")).sendKeys("abc");		
		Thread.sleep(1000);		
		driver.findElement(By.name("pass")).sendKeys("12345");
		Thread.sleep(1000);
		
		WebElement fn = driver.findElement(By.name("firstname"));
		fn.sendKeys("saranya");
		Thread.sleep(1000);
		
		WebElement sn = driver.findElement(By.name("lastname"));
		sn.sendKeys("shanmugam");
		Thread.sleep(1000);
		
		WebElement mob = driver.findElement(By.name("reg_email__"));
		mob.sendKeys("xyz@gmail.com");
		Thread.sleep(1000);
		
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("xyz@gmail.com");
		WebElement pw = driver.findElement(By.name("reg_passwd__"));
		pw.sendKeys("xxxxx");
		Thread.sleep(1000);		
		
		Select date = new Select(driver.findElement(By.id("day")));		
		date.selectByVisibleText("13");
		Thread.sleep(3000);
		
		Select month1 = new Select(driver.findElement(By.id("month")));
		month1.selectByIndex(12);
		Thread.sleep(3000);
		
		Select ye = new Select(driver.findElement(By.id("year")));
		ye.selectByValue("2016");
		Thread.sleep(3000);
		
		WebElement radiobutton = driver.findElement(By.name("sex"));
		
		System.out.println(radiobutton.isDisplayed());
		System.out.println(radiobutton.isEnabled());
		System.out.println(radiobutton.isSelected());
		radiobutton.click();
		System.out.println(radiobutton.isSelected());
		driver.findElement(By.name("websubmit")).click();
			// TODO Auto-generated method stub

	}

}
