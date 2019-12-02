package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tablepgrm {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Personal\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		driver.manage().window().maximize();
		WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td[3]"));
		System.out.println(table.getText());
		WebElement col=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td"));
		System.out.println(col.getText());
		List<WebElement> column=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr/td"));
		for (WebElement data : column) {
			System.out.println(data.getText());
		}
	}
		
		
		
		
	}

	
	
