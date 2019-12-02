package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Scrollup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Personal\\selenium\\drivers\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://www.amazon.in/");
//		driver.navigate().refresh();
//		WebElement shopbycat = driver.findElement(By.xpath("//span[text()='Shop by']"));
//		Actions ac = new Actions(driver);
//		ac.moveToElement(shopbycat).build().perform();
//		WebElement firestick = driver.findElement(By.xpath("//span[text()='Fire TV Stick']"));
//		ac.moveToElement(firestick).build().perform();	
//		WebElement stickclick = driver.findElement(By.xpath("//span[text()='All-New Fire TV Stick 4K']"));
//		stickclick.click();
//		driver.navigate().refresh();
		Thread.sleep(3000);

//		WebElement Scrolldown = driver.findElement(By.xpath("//*[@id=\"navBackToTop\"]/div/span"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();",Scrolldown);
//		Thread.sleep(2000);
//		WebElement Scrollup = driver.findElement(By.xpath("//span[@class='nav-sprite nav-logo-base']"));
//		js.executeScript("arguments[0].scrollIntoView();",Scrollup);   
//		js.executeScript("window.scrollBy(0,1200)");
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,-500)");
//		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
//

	}
}
		
		
		
