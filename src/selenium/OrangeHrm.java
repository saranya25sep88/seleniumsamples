package selenium;

import java.awt.Point;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\src\\test\\resource\\Drivers\\chromedriver80.exe");
             WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		/*WebElement link = driver.findElement(By.linkText("Features"));
		link.click();
		Thread.sleep(1000);
		WebElement partiallink = driver.findElement(By.partialLinkText("Success"));
		partiallink.click();
		Thread.sleep(1000);
		WebElement backtoscreen = driver.findElement(By.xpath("//a[@class='btn-orange trial-btn pulse ']"));
		backtoscreen.click();
		Thread.sleep(1000);
		WebElement passingvalues = driver.findElement(By.id("Form_submitForm_subdomain"));
	    passingvalues.sendKeys("https://www.youtube.com/");
	    WebElement passing = driver.findElement(By.id("Form_submitForm_FirstName"));
	    boolean enabled = passing.isEnabled();
	    System.out.println("firstname is enabled: "+enabled);
	    passing.sendKeys("saranya");
	    passing.clear();*/
	    WebElement dropdown = driver.findElement(By.id("Form_submitForm_NoOfEmployees"));
	    Select sc = new Select(dropdown);
	    sc.selectByIndex(2);
	    Thread.sleep(1000);
	    sc.selectByValue("51 - 75");
	    Thread.sleep(1000);
	    sc.selectByVisibleText("101 - 150");
	    Thread.sleep(1000);
	    List<WebElement> options = sc.getOptions();
	    
	    int size = options.size();
	    Thread.sleep(1000);
	    System.out.println("noofelements in employee dropdown: "+size);
	    for(int i=0;i<size;i++)
	    {
	    String dropvalues = options.get(i).getText();
	    sc.selectByIndex(i);
	    System.out.println("dropdown values: "+dropvalues);
	    }
	   /* WebElement sendkeydropdown = driver.findElement(By.id("Form_submitForm_Industry"));
	    sendkeydropdown.sendKeys("Business Services / Consultancy - Non IT");
	    Thread.sleep(1000);
	   	    driver.navigate().to("http://www.leafground.com/");
	    driver.findElement(By.linkText("Edit")).click();
	    WebElement append = driver.findElement(By.xpath("//input[@value='Append ']"));
	    append.sendKeys("text");
	    WebElement gettext = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
	    String attribute = gettext.getAttribute("value");
	    System.out.println(attribute);
	    driver.navigate().to("http://www.leafground.com/");
	    driver.findElement(By.linkText("Button")).click();
	    WebElement buttonposition = driver.findElement(By.id("position"));
	    org.openqa.selenium.Point location = buttonposition.getLocation();
	    int x = location.getX();
	    int y = location.getY();
	    System.out.println("xposi: "+x+"yposi: "+y);
	    WebElement findcolor = driver.findElement(By.id("color"));
	    String cssValue = findcolor.getCssValue("background-color");
	    System.out.println("button color: "+cssValue);
	    WebElement sizebutton = driver.findElement(By.id("size"));
	    int height = sizebutton.getSize().getHeight();
	    int width = sizebutton.getSize().getWidth();
	    System.out.println("heigh n width:  "+height+width);*/
	    
	    	}

}
