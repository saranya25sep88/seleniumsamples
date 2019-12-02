package selenium;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import okio.Options;

public class baseclass {
	
	public static WebDriver driver;
	
	public static WebDriver launchBrowser(String Browsername)throws Exception{
	  try {
		    if(Browsername.equalsIgnoreCase("chrome"))
		    {
		                  System.setProperty("webdriver.chrome.driver", 
				                    System.getProperty("user.dir") + "\\NewDriver\\chromedriver.exe");
		                  driver = new ChromeDriver();
	        }else if(Browsername.equalsIgnoreCase("firefox"))
		    {
	                      System.setProperty("webdriver.gecko.driver", 
	                    		     System.getProperty("user.dir") + "\\drivers\\firefox.exe");
	                      driver = new FirefoxDriver();
		    }
		    else 
		        { 
		    	  throw new Exception("enter valid browser name");
		        }
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		    return driver;
	     } catch (Exception e) 
	        {
	    	 e.printStackTrace();
	    	 throw new Exception();
	        }
		}

      public static void getlink(String link) throws Exception {
    	  try {
    		  driver.get(link);
    	      }catch (Exception e) 
    	  {
			e.printStackTrace();
		  throw new Exception();
      }
      }
      public static void waitforelementvisible(WebElement visibleelement) throws Exception {
    	  try {
    		  WebDriverWait wb = new WebDriverWait(driver,60);
    		  wb.until(ExpectedConditions.visibilityOf(visibleelement));
    	      }catch (Exception e) {
    		  e.printStackTrace();
    	  throw new Exception();
      }

      }     
     public static boolean elementisdisplayed(WebElement displayelement) throws Exception {
    	 try {
    		 boolean displayed = displayelement.isDisplayed();
    		 return displayed;
    	 } catch(Exception e) {
    		 e.printStackTrace();
    		 throw new Exception();
    	 }
     }
     public static boolean elementisenabled(WebElement enableelement) throws Exception {
    	 try {
    		 boolean enabled = enableelement.isEnabled();
    		 return enabled;
    	 }catch (Exception e) {
    		 e.printStackTrace();
    		 throw new Exception();
    	 }
    	 }
     public static boolean elementisselected(WebElement selectedelement) throws Exception {
    	 try {
    		 boolean selected = selectedelement.isSelected();
    		 return selected;
    	 }catch (Exception e) {
    		 e.printStackTrace();
    		 throw new Exception();
   		}
     }
     public static void sendvaluestoelement(WebElement element, String Values) throws Exception {
    	 try {
    		 waitforelementvisible(element);
    		 if(elementisdisplayed(element)&&elementisenabled(element))
    		 {
    			 element.clear();
    			 element.sendKeys(Values);
    		 }
    	 }catch (Exception e) {
				e.printStackTrace();
				throw new Exception();
				}
    	 }
     public static void clickonelement(WebElement element) throws Exception {
        try {
        	waitforelementvisible(element);
        	if(elementisdisplayed(element))
        	{
        		element.click();
        	}
        }catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
        }
     
}
     public static void mousehoveraction(WebElement element) throws Exception {
    	 try {
    		 waitforelementvisible(element);
    		 Actions ac = new Actions(driver);
    		 ac.moveToElement(element).build().perform();
    	 }catch (Exception e) {
		            e.printStackTrace();
		            throw new Exception();
		         }
     }
    public static void dropdown(WebElement element, String value, String option) throws Exception {
    	try {
			/*waitforelementvisible(element);*/
			Select sec = new Select(element);
			if(option.equalsIgnoreCase("value")) {
				sec.selectByValue(value);
			}
				else if(option.equalsIgnoreCase("visibletext")) {
					sec.selectByVisibleText(value);
				}
					else if(option.equalsIgnoreCase("index")) {
						sec.selectByIndex(Integer.parseInt(value));
					}									
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		}
 }
   public static void scrolltowebelement(WebElement element) throws Exception {
	   try {
		   waitforelementvisible(element);
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("arguments[0],scrollIntoView();",element);
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
   }
   public static void scrollusingpixel(WebElement element, int width, int height) throws Exception {
	   try {
		   waitforelementvisible(element);
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		   js.executeScript("windows.scrollby("  + width + "," + height +  ")");		
	} catch (Exception e) {		
		e.printStackTrace();
		throw new Exception();
	}
   }
   public static void scrolltobottom(WebElement element) throws Exception {
	   try {
		   waitforelementvisible(element);
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   js.executeScript("windows.scrollTo(0, document.body.scrollHeight)");
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
   }
   public static void dragdrop(WebElement src, WebElement tar) throws Exception {
	   try {
		waitforelementvisible(src);
		Actions ac = new Actions(driver);
		ac.dragAndDrop(src, tar).build().perform();
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
}
   public static void doubleclick(WebElement element) throws Exception {
	   try {
		   waitforelementvisible(element);
		   Actions ac = new Actions(driver);
		   ac.doubleClick(element).build().perform();
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
   }
  public static void rightclick(WebElement element) throws Exception {
	  try {
		  waitforelementvisible(element);
		  Actions ac = new Actions(driver);
		  ac.contextClick(element).build().perform();
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
  }
  public static void alertaccept() throws Exception {
	  try {
		  Alert al = driver.switchTo().alert();
		  al.accept();		
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
  }
  
  public static void alertdismiss() throws Exception {
	  try {
		  Alert al = driver.switchTo().alert();
		  al.dismiss();
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
  }
  public static void alertsendkeys(String value) throws Exception {
	  try {
		  Alert al = driver.switchTo().alert();
		  al.sendKeys(value);
		  al.accept();
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
		
	}
  }
  public static void switchingdefaultalertscreen() throws Exception {
	  try {
		   driver.switchTo().defaultContent();
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
  }
  public static String gettextfromwebelement(WebElement element) throws Exception {
	  try {
		waitforelementvisible(element);
		String webelementtext = element.getText();
		return webelementtext;		
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
	
  }
  public static String getattfromwebelement(WebElement element, String value) throws Exception {
	  try {
		waitforelementvisible(element);
        String attribute = element.getAttribute(value);
        return attribute;        
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();		
	}
  }
  public static void switchingframe(WebElement element) throws Exception {
	  try {
		 driver.switchTo().frame(element);
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}	
	}
  public static void close() throws Exception {
	  try {
		   driver.close();
	} catch (Exception e) 
	  {
		e.printStackTrace();
		throw new Exception();
	}
  }
  public static void quit() throws Exception {
	  try {
		  driver.quit();
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
  }
  public static String gettitle() throws Exception {
	  try {
		   String title = driver.getTitle();
		   return title;
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
  }
  public static String getcurrenturllink() throws Exception {
	  try {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
  }
  public static void navigateurl(String url) throws Exception {
	  try {
		  driver.navigate().to(url);
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
  }
  public static void navigationcommands(String option) throws Exception {
	  try {
		  if(option.equalsIgnoreCase("refresh")) {
			  driver.navigate().refresh();}
		  else if(option.equalsIgnoreCase("backward")) {
			  driver.navigate().back();}
		  else if(option.equalsIgnoreCase("forward")) {
			  driver.navigate().forward();}			  
	} catch (Exception e) {
	  e.printStackTrace();
	  throw new Exception();
	}
  }
  public static void switchtowindowhandle(String Windowtitle) throws Exception {
	  try {
		  String pid = driver.getWindowHandle();
		  Set<String> allid = driver.getWindowHandles();
		  for (String x : allid)
		  {
			  driver.switchTo().window(x);
			  /*String title = driver.getTitle();
			  if(title.equals(Windowtitle)) {
				  driver.switchTo().window(x);
			  }*/
			  
			}
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
  
}
  public static void fetchingvaluesfromjdbc(String url, String username, String password, String query, String columnname) throws Exception {
	  try {
		 List<String> li = new ArrayList<>();
		 Class.forName("com.mysql.jdbc.Driver");
	     Connection connect = DriverManager.getConnection(url, username, password);
	     Statement createStment = connect.createStatement();
	     ResultSet executeQuery = createStment.executeQuery(query);
	     while (executeQuery.next()) {
			String string = executeQuery.getString(columnname);
			li.add(string);
		}connect.close();
	} catch (Exception e) {
		e.printStackTrace();
		throw new Exception();
	}
  }
}
	
  /*fetchingdata from dynamic webtable
  takescreenshot*/

     
     
     
     
     
        
     
     
     
     
     
     
     
     
     
     
     
     
     
    
















