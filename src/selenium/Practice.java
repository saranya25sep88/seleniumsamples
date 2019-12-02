 package selenium;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dhilli\\eclipse-workspace\\seleniumsample\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();

		
		 /*WebElement offers = driver.findElement(By.xpath("//span[text()='All Offers']"));
		  Actions ac = new Actions(driver);
		  ac.moveToElement(offers).build().perform();
		  Thread.sleep(2000); 
		  WebElement juicers = driver.findElement(By.xpath("//span[text()='Juicers']"));
		  ac.click(juicers).build().perform();
		  Thread.sleep(1000);
		 driver.navigate().back(); Thread.sleep(1000); 
		 WebElement downtoneeds = driver.findElement(By.xpath("//div[text()='Policy Info']")); 
		  WebElement uptocategory = driver.findElement(By.xpath("//div[text()='Top Categories']"));
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		  Thread.sleep(3000);
		  js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		  Thread.sleep(2000);*/
		  
		  /*js.executeScript("arguments[0].scrollIntoView();",downtoneeds);
		  Thread.sleep(2000);
		  js.executeScript("arguments[0].scrollIntoView();",uptocategory);
		  Thread.sleep(1000);*/
		 

		WebElement giftcards = driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/section/div/span[2]/span[1]/a"));
		Actions ac2 = new Actions(driver);
		ac2.contextClick(giftcards).build().perform();

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		/*
		 * WebElement helpcentre =
		 * driver.findElement(By.xpath("//div[@class='accountInner']"));
		 * ac.moveToElement(helpcentre).build().perform(); WebElement uraccount =
		 * driver.findElement(By.xpath("//div[@class='dropdownWrapper hard-hidden']"));
		 * ac.moveToElement(uraccount).build().perform();(not performing)
		 */

		WebElement helpcentre = driver.findElement(By.xpath("//a[text()='Help Center']"));
		ac2.contextClick(helpcentre).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);

		WebElement downloadlink = driver.findElement(By.xpath("//a[text()='Download App']"));
		ac2.contextClick(downloadlink).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		String pid = driver.getWindowHandle();
		System.out.println(pid);
		driver.switchTo().window(pid);
		String title = driver.getTitle();
		System.out.println(title);
		Set<String> allwindowsid = driver.getWindowHandles();
		System.out.println(allwindowsid.size());

		for (String string2 : allwindowsid) {
			String titleall = driver.switchTo().window(string2).getTitle();
			System.out.println(titleall);
		}
		String at = "Snapdeal : Help Center";
		for (String string : allwindowsid) {
			if (driver.switchTo().window(string).getTitle().equals(at)) {

				break;
			}
		}
		
		WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
		login.click();
		Thread.sleep(2000);
		
		driver.get("https://admin@www.snapdeal.com/help");
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.xpath("(//input[contains(@name,'username')])[1]"));
		username.click();
		driver.switchTo().alert().sendKeys("1234567890");		
		Thread.sleep(2000);
		}
}
