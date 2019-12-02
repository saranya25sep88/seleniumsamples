package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class Frames
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhilli\\eclipse-workspace\\seleniumsample\\NewDriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		driver.navigate().to("http://automationpractice.com/index.php?");
		driver.navigate().refresh();
		/*Actions ac = new Actions(driver);
		WebElement womens = driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a"));
		ac.moveToElement(womens).build().perform();
		WebElement tshirts = driver.findElement(By.linkText("T-shirts"));
		ac.click(tshirts).build().perform();*/
		WebElement login = driver.findElement(By.className("login"));
		login.click();
		driver.findElement(By.id("email_create")).sendKeys("sfsdfsd@gmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(("(//input[@type='radio'])[2]"))).click();
				driver.findElement(By.name("customer_firstname")).sendKeys("saranya");
		driver.findElement(By.id("customer_lastname")).sendKeys("shanmugam");
		
		driver.findElement(By.id("passwd")).sendKeys("12345");
		Select date = new Select(driver.findElement(By.id("days")));
		date.selectByValue("25");
		Select month = new Select(driver.findElement(By.id("months")));
		month.selectByIndex(8);
		Select year = new Select(driver.findElement(By.id("years")));
		year.selectByValue("1988");
		List <WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<elements.size();i++)
		{
			elements.get(i).click();
		}
		
		
		
				driver.findElement(By.id("address1")).sendKeys("3/4,sfsd street, chennai");
				driver.findElement(By.name("city")).sendKeys("vellore");
		Select dropdown = new Select(driver.findElement(By.id("id_state")));
		List <WebElement> options = dropdown.getOptions();
		for(int i=0;i<options.size();i++)
		{
			options.get(i);
			dropdown.selectByIndex(5);
		}	
		driver.findElement(By.id("postcode")).sendKeys("12345");
	Select country = new Select(driver.findElement(By.xpath("//select[@name='id_country']")));
	country.selectByVisibleText("United States");
	
	Thread.sleep(1000);
	driver.findElement(By.id("phone")).sendKeys("9345782829");
	driver.findElement(By.xpath("(//input[@class='form-control'])[8]")).sendKeys("9176288823");
	driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys(" street, chennai");
	driver.findElement(By.id("submitAccount")).click();
}
}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*driver.get("https://money.rediff.com/gainers/bsc/daily/groupa");
		driver.findElement(By.name("cusid")).sendKeys("12345");
		driver.findElement(By.name("submit")).submit();
		Alert a1 = driver.switchTo().alert();
		String Message = driver.switchTo().alert().getText();
		System.out.println("message");
		Thread.sleep(2000);
		a1.accept();*/
		
		/*Actions ac = new Actions(driver);
		WebElement demo = driver.findElement(By.linkText("DEMO SITES"));
		ac.moveToElement(demo).build().perform();
		Thread.sleep(3000);	
		WebElement practice = driver.findElement(By.linkText("Automation Practice Table"));
		ac.click(practice).build().perform();
		Thread.sleep(3000);	*/
		
		/*int noofrows = driver.findElements(By.xpath("//*[@id=\'leftcontainer\']/table/tbody/tr")).size();
		System.out.println("total rows: "+noofrows);
		int noofcol = driver.findElements(By.xpath("//*[@id=\'leftcontainer\']/table/tbody/tr[1]/td")).size();
		System.out.println("total col: "+noofcol);
		driver.findElements(By.xpath("//*[@id=\'leftcontainer\']/table/tbody/tr"));
		for(int i=0;i<noofrows;i++)
		{
			driver.findElements(By.xpath("//*[@id=\'leftcontainer\']/table/tbody/td"));
			{
				for(int j=0;j<noofcol;j++)
				{
					System.out.println(noofcol.get(j).getText());
					driver.findElement(By.xpath("//*[@id=\'leftcontainer\']/table/tbody/tr["+i"]/td["+j"]")).getText();
				}
			}
		}
				
		}

}*/
