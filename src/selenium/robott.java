package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robott {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","D:\\Personal\\selenium\\drivers\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		Actions ac=new Actions(driver);
		
		WebElement youramazon = driver.findElement(By.xpath("//*[@id=\"nav-your-amazon\"]"));
		ac.contextClick(youramazon).build().perform();
		
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement todaydeals = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]"));
		ac.contextClick(todaydeals).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement orders = driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[2]"));
		ac.contextClick(orders).build().perform();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String pid=driver.getWindowHandle();
		System.out.println(pid);
		
		Set<String> allid = driver.getWindowHandles();
		System.out.println(allid);
		
		for (String id : allid) 
		{
			
			String title=driver.switchTo().window(id).getTitle();
			System.out.println(title);
			
		}
		String at="Amazon Sign In";
		for (String id : allid) {
			if(driver.switchTo().window(id).getTitle().equals(at))
			{
				break;
			}
			
			/*WebElement login = driver.findElement(By.xpath("//input[@type='email']"));
			login.sendKeys("1000000000");
			Thread.sleep(2000);
			
			WebElement continuebtn = driver.findElement(By.xpath("//input[@id='continue']"));
			continuebtn.click();*/
			
		}
		
		
		
		
		
		
		
		

}
}
