package selenium;

import java.util.List;

import javax.swing.plaf.synth.SynthSeparatorUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class Multidropdown {

	public static void main(String[] args) throws InterruptedException { 
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dhilli\\eclipse-workspace\\seleniumsample\\NewDriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://materializecss.com/");	
		// TODO Auto-generated method stub
		WebElement option = driver.findElement(By.id("select-options-cb79c6ca-8953-fffc-483a-fa469ed3dcac"));
		Select S = new Select(option);
		boolean b = S.isMultiple();
		System.out.println(b);
		List <WebElement> options = S.getOptions();
		for(int i=0;i<=options.size();i++)
		{
			options.get(i).click();
			S.selectByIndex(i);
		}

	}

}
