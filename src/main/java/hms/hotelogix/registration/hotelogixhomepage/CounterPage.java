package hms.hotelogix.registration.hotelogixhomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import hms.hotelogix.registration.GenericClass.GenericMethods;

public class CounterPage {

	
	public void fn_SelectCounter(String countername) throws Exception{
		try{
			try{
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_CounterPage_Counter_DD"), countername);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_CounterPage_Counter_DD"), countername);
			}
			try{
				GenericMethods.GI().fn_Click(GenericMethods.GI().getWebElement("Hotelogix_CounterPage_Continue_BT"));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_CounterPage_Continue_BT"));
			}
			Thread.sleep(3000);
			 GenericMethods.GI().driver.findElement(By.cssSelector("html")).sendKeys(Keys.CONTROL+"\t");
		}catch(Exception e){
			throw e;
		}
	}
}
