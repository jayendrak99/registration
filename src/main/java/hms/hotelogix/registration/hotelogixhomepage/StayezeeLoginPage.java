package hms.hotelogix.registration.hotelogixhomepage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import hms.hotelogix.registration.GenericClass.GenericMethods;

public class StayezeeLoginPage {
	
	
	
	
	
	public void fn_StayezeeLogin(String username, String password) throws Exception{
		try{
			GenericMethods.GI().driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
			GenericMethods.GI().driver.get("http://mail.stayezee.com/squirrelmail/src/login.php");
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_StayezeeLoginPage_LoginName_ED"), username);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_StayezeeLoginPage_LoginName_ED"), username);
			}
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_StayezeeLoginPage_Password_ED"), password);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_StayezeeLoginPage_Password_ED"), password);
			}
			
			try{
				GenericMethods.GI().fn_Click(GenericMethods.GI().getWebElement("Hotelogix_StayezeeLoginPage_Login_BT"));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_StayezeeLoginPage_Login_BT"));
			}
			
			
		}catch(Exception e){
			throw e;
		}
	}

}
