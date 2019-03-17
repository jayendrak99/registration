package hms.hotelogix.registration.GenericClass;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;



public class Test {

	@BeforeClass
	public void test() throws Exception {
		 GenericMethods.GI().fn_LaunchBrowser("FF");	
         GenericMethods.GI().driver.get("https://www.google.com");
	     }
	
	
	   @org.testng.annotations.Test(dataProvider="SearchProvider")
	   public void fn_Test(String key, String val) throws Exception{
		try{  
	         
	          WebElement we=GenericMethods.GI().driver.findElement(By.xpath("//input[@title='Search']"));
	          we.clear();
	          we.sendKeys(val);
	          Thread.sleep(2000);
	         GenericMethods.GI().driver.findElement(By.xpath("//*[contains(@aria-label,'Google Search')]")).click();;
	         System.out.println("Chal be......");
			}catch(Exception e){
				throw e;
	 		}
	}
	
	
	    @DataProvider(name="SearchProvider")
	    public Object[][] getDataFromDataprovider(){
	     return new Object[][]{{ "Guru99", "India" }, { "Krishna", "UK" }, { "Bhupesh", "USA" }};
	    }
//	
	
	

}
