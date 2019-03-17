package hms.hotelogix.registration.GenericClass;


import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class GenericMethods {
	 
	
	public Properties OR;
	public WebDriver driver;
	//public  ThreadLocal<WebDriver> driver;
	private static GenericMethods GM;
	
      private GenericMethods(){
    	  
      }
      
      public static synchronized GenericMethods GI(){
    	  if(GM==null){
    		 GM= new GenericMethods();
    	  }
    	  return GM;
          }
      
      ThreadLocal<WebDriver> driver1 = new ThreadLocal<WebDriver>() ;
      
      public String ActionOnAlert(String Action){
    	  
    	  String value=null;
    	  try{
    	         WebDriverWait wait = new WebDriverWait(driver, 2);
    	         Alert alert = wait.until(ExpectedConditions.alertIsPresent());

    	         value=alert.getText();
    	         if(Action.equalsIgnoreCase("Accept")){
    	         alert.accept();
    	         Thread.sleep(2000);
    	         System.out.println("Accepted the alert successfully.");
    	         }
    	         else if(Action.equalsIgnoreCase("Dismiss")){
    	         alert.dismiss();
    	         System.out.println("Alert is successfully Dismissed.");
    	         }
    	         else if(Action.equalsIgnoreCase("")){
    	             System.out.println("No Action performed");
    	             driver.close();
    	         }
    	      }catch(Throwable e){
    	         System.err.println("Error came while waiting for the alert popup. "+e.getMessage());
    	      }
    	    return value;
    	    }

      
      public void switchToWindowHandle(String titleval) throws Exception {
      	try{
      	  Set<String> setHndlValColls=driver.getWindowHandles();
          Iterator<String>  itHandleColls= setHndlValColls.iterator();
          while(itHandleColls.hasNext()==true){
              String hndlval=itHandleColls.next();
              driver.switchTo().window(hndlval);
              String title=driver.getTitle();
              if(title.equalsIgnoreCase(titleval)){
                 break;
              }
              }
      	}catch(Exception e){
      		throw e;
      	}
     	}
      
      public void TypeInField(WebElement element, String value) throws Exception{
    	  WebElement wobj=fn_ValidateWebelement(element);
    	  String val = value; 
    	  wobj.clear();
    	    for (int i = 0; i < val.length(); i++){
    	        char c = val.charAt(i);
    	        String s = new StringBuilder().append(c).toString();
    	        Thread.sleep(100);
    	        element.sendKeys(s);
    	    }       
    	    }
      
      public void fn_LaunchBrowser(String BrowserType) throws Exception{
    	  try{
    		  if(BrowserType.equalsIgnoreCase("FF")){
    			  System.setProperty("webdriver.gecko.driver","E:\\Testautomation\\Testautomation\\Drivers\\geckodriver.exe");
                  DesiredCapabilities capabilities=DesiredCapabilities.firefox();
                   capabilities.setCapability("marionette", true);
                   FirefoxProfile profile = new FirefoxProfile();
                   profile.setPreference("browser.link.open_newwindow.restriction", 1);
                   profile.setPreference("browser.link.open_newwindow", 2);
                   capabilities.setCapability(FirefoxDriver.PROFILE, profile);
                   driver= new FirefoxDriver();
    		  }else if(BrowserType.equalsIgnoreCase("CH")){
    			  System.setProperty("webdriver.chrome.driver","D:\\Registration\\TSTauto\\Testautomation\\Drivers\\chromedriver.exe");
    			    DesiredCapabilities capabilities = DesiredCapabilities.chrome();
    	            ChromeOptions options = new ChromeOptions();
    	            options.addArguments("chrome.switches","--disable-extensions");
    	            options.addArguments("--test-type");
    	            LoggingPreferences loggingprefs = new LoggingPreferences();
    	            loggingprefs.enable(LogType.BROWSER, Level.ALL);
    	            capabilities.setCapability(CapabilityType.LOGGING_PREFS, loggingprefs);
    	            capabilities.setCapability("chrome.binary", "D:\\Registration\\TSTauto\\Testautomation\\Drivers\\chromedriver.exe");
    	            capabilities.setCapability("chrome.switches", Arrays.asList("--incognito"));
    	            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
    			  
    			  driver= new ChromeDriver(capabilities);
    			 
    		  }else if(BrowserType.equalsIgnoreCase("HU")){
    			  driver=new HtmlUnitDriver();
    		  }
    		  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    	  }catch(Exception e){
    		  throw e;
    	  }
          }
      
      private WebElement fn_ValidateWebelement(WebElement we) throws Exception{
    	  try{
    		  if(we.isDisplayed() && we.isEnabled()){
    			  return we;
    		  }
    	  }catch(NoSuchElementException e){
    		  Thread.sleep(2000);
    		  e.getAdditionalInformation();
    	  }catch(ElementNotVisibleException e){
    		  Thread.sleep(2000);
    		  e.printStackTrace();
    	  }catch(Exception e){
    		  throw e;
    	  }
		  return we;
          }
      
      public void fn_Sendkeys(WebElement we, String str) throws Exception{
    	  try{
    		  WebElement wobj=fn_ValidateWebelement(we);
    		  wobj.clear();
    		  wobj.sendKeys(str);
    	  }catch(Exception e){
    		  throw e;
    	  }
          }
      
      public void fn_Click(WebElement we) throws Exception{
    	  try{
    		  WebElement wobj=fn_ValidateWebelement(we);
    		  wobj.click();
    	  }catch(Exception e){
    		  throw e;
    	  }
          }
      
      public void fn_ActionsSendkeys(WebElement we, String str) throws Exception{
    	  try{
    		  WebElement wobj=fn_ValidateWebelement(we);
    		  wobj.clear();
    		  Actions actobj= new Actions(driver);
    		  actobj.sendKeys(wobj, str).build().perform();
    	  }catch(Exception e){
    		  throw e;
    	  }
          }
      
      public void fn_ActionsClick(WebElement we) throws Exception{
    	  try{
    		  WebElement wobj=fn_ValidateWebelement(we);
    		  Actions actobj= new Actions(driver);
    		  actobj.click(wobj).build().perform();
    	  }catch(Exception e){
    		  throw e;
    	  }
          }
      
      public void fn_Mouseover(WebElement we) throws Exception{
    	  try{
    		  WebElement wobj=fn_ValidateWebelement(we);
    		  Actions actobj = new Actions(driver);
    		  actobj.moveToElement(wobj).build().perform();
    	  }catch(Exception e){
    		  throw e;
    	  }
          }
      
      public  void js_Sendkey(WebElement element, String id) throws Exception{
    	  try{
    		  WebElement wobj=fn_ValidateWebelement(element);
    		  wobj.clear();
          JavascriptExecutor executor = (JavascriptExecutor)driver;
          executor.executeScript("arguments[0].value='"+id+"';", wobj);
    	  }catch(Exception e){
    		  throw e;
    	  }
      }

  	public void js_Click(WebElement element) throws Exception{
  	  try{
  		 WebElement wobj=fn_ValidateWebelement(element);
  		 JavascriptExecutor executor = (JavascriptExecutor)driver;
  		 executor.executeScript("arguments[0].click();", wobj);
  	  }catch(NoSuchElementException e){
  		  Thread.sleep(3000);
  		 JavascriptExecutor executor = (JavascriptExecutor)driver;
  		 executor.executeScript("arguments[0].click();", element);
  	 }catch(Exception e){
		  throw e;
	  }
  	  }
  	
  

  public Select selectElement(WebElement element, String VisibleText) throws Exception{
     try{
    	 WebElement wobj=fn_ValidateWebelement(element);
		 Select sel = new Select(wobj);
         sel.selectByVisibleText(VisibleText);
         return sel;
        }catch(Exception e){
	      throw e;
        }
        }

	public String fn_GetText(WebElement element) throws Exception{
		try{
			 WebElement wobj=fn_ValidateWebelement(element);
			 return wobj.getText();
		}catch(Exception e){
			throw e;
		}
	    }
	
	public Select SelectByIndex(WebElement ele,int ind) throws Exception{
		 try{
	    	 WebElement wobj=fn_ValidateWebelement(ele);
			 Select sel = new Select(wobj);
	         sel.selectByIndex(ind);
	         return sel;
	        }catch(Exception e){
		      throw e;
	        }
	        }
	
	public Properties loadOR(){
		try {
			if(OR==null){
				String str=System.getProperty("user.dir");
				FileInputStream fis=new FileInputStream(str+File.separator+"ManageUserWebelements.properties");
				OR=new Properties();
				OR.load(fis);
				return OR;
			}
			} catch (Exception e) {
				e.printStackTrace();
			}
		      return OR;
	        }
	
   
	public WebElement getWebElement(String ORElementName){
		By byObj=getLocator(ORElementName);
		WebElement we=driver.findElement(byObj);
		return we;
	}
	
	public List<WebElement> fn_GetListWebElement(String ORElementName){
		By byObj=getLocator(ORElementName);
		List<WebElement> we=driver.findElements(byObj);
		return we;
	}
	
    public By getLocator(String ORElementName){
		OR=loadOR();
		String orLocatorInfo=OR.getProperty(ORElementName);
		String locatorValue=orLocatorInfo.split("##")[0];
		String locatorType=orLocatorInfo.split("##")[1];
		By byObj=null;
	   if(locatorType.equalsIgnoreCase("XP")){
		   byObj=By.xpath(locatorValue);
	   }else if(locatorType.equalsIgnoreCase("NM")){
		   byObj=By.name(locatorValue);
	   }else if(locatorType.equalsIgnoreCase("ID")){
		   byObj=By.id(locatorValue);
	   }else if(locatorType.equalsIgnoreCase("CLS")){
		   byObj=By.className(locatorValue);
	   }else if(locatorType.equalsIgnoreCase("CSS")){
		   byObj=By.cssSelector(locatorValue);
	   }else if(locatorType.equalsIgnoreCase("LK")){
		   byObj=By.linkText(locatorValue);
	   }else if(locatorType.equalsIgnoreCase("PLK")){
		   byObj=By.partialLinkText(locatorValue);
	   }
	     return byObj;
	   }
    
    
    public String randomUniqueString() throws Exception {
    	try{
    	SimpleDateFormat format = new SimpleDateFormat("yyyyMMddhhmmss");
    	Date date = new Date();
    	String uniqueString = format.format(date);
    	return uniqueString;
    	}catch(Exception e){
    		throw e;
    	}
        }

    
}
