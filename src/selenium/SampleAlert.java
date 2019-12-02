package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleAlert {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		WebElement textBoxAlert = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		textBoxAlert.click();
		
		WebElement button = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		button.click();
		
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		al.sendKeys("dfdf");
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		al.accept();
		driver.switchTo().defaultContent();
		
		WebElement okAndCancel = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a"));
		okAndCancel.click();
		Thread.sleep(3000);

		WebElement button1 = driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button"));
		button1.click();
		Thread.sleep(3000);

		al.dismiss();
		
		/*Actions ac=new Actions(driver);
		
		okAndCancel.sendKeys(Keys.CONTROL,"a");
		okAndCancel.sendKeys(Keys.DELETE);
		
		driver.switchTo().frame(2);
		driver.switchTo().frame("SingleFrame");

		WebElement frame1 = driver.findElement(By.xpath("//*[@id=\"singleframe\"]"));
		driver.switchTo().frame(frame1);*/
		
		
		
		
		
		
	}

}
