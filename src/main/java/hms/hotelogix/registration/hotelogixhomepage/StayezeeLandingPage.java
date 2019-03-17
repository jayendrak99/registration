package hms.hotelogix.registration.hotelogixhomepage;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import hms.hotelogix.registration.GenericClass.GenericMethods;

public class StayezeeLandingPage {
	
	public String HotelID;
	public String User_Name;
	public String Password;
	
	private HashMap<String ,String> HM;
	
	public void fn_CheckMailandClick(String view, String subject) throws Exception{
		try{
			Thread.sleep(3000);
			GenericMethods.GI().driver.navigate().refresh();
			GenericMethods.GI().driver.switchTo().frame(1);
			String text=GenericMethods.GI().fn_GetText(GenericMethods.GI().getWebElement("Hotelogix_StayezeeLandingPage_ViewText"));
			if(text.equalsIgnoreCase(view)){
				WebElement we=GenericMethods.GI().driver.findElement(By.xpath("//form[@name='FormMsgsINBOX']//table//tr[5]//tbody//table/tbody/tr/td[3]//a"));
				GenericMethods.GI().fn_Click(we);
			}			
			int size=GenericMethods.GI().fn_GetListWebElement("Hotelogix_StayezeeLandingPage_Mail_Collection").size();
			for(int i=2; i<=size; i+=2){
				Thread.sleep(4000);
				WebElement we=GenericMethods.GI().driver.findElement(By.xpath("//form[@action='move_messages.php']//tbody/tr[5]//tbody//tr["+i+"]//td[5]/b/a"));
				String str=GenericMethods.GI().fn_GetText(we);
				if(str.equalsIgnoreCase(subject)){
					we.click();
					break;
		}
	    }	
		}catch(Exception e){
			throw e;
		}
	   }
	
	public String fn_GetVerificationCode() throws Exception{
		try{
		    Thread.sleep(3000);
		    String verificationCode = GenericMethods.GI().fn_GetText(GenericMethods.GI().getWebElement("Hotelogix_StayezeeLandingPage_VerificationCode_TX")).split(":")[1];
		    Thread.sleep(5000);
			GenericMethods.GI().driver.findElement(By.cssSelector("html")).sendKeys(Keys.CONTROL+"\t");
			return verificationCode;
		}catch(Exception e){
			throw e;
		}
        }
	
	
	public void fn_ClickActivationLink(){
        try{
            GenericMethods.GI().getWebElement("Hotelogix_StayezeeLandingPage_Activation_PLink").click();
        }catch(Exception e){
            throw e;
        }
    }
      

	public void fn_CongratulationMailLink(String subject) throws Exception{
		try{
			 //GenericMethods.GI().driver.findElement(By.cssSelector("html")).sendKeys(Keys.CONTROL+"\t");
			Thread.sleep(2000);
		      GenericMethods.GI().driver.navigate().refresh();
				GenericMethods.GI().driver.switchTo().frame(1);
				String Val=GenericMethods.GI().fn_GetText(GenericMethods.GI().getWebElement("Hotelogix_StayezeeLandingPage_ViewText"));
				if(Val.equalsIgnoreCase("Received")){
					WebElement we=GenericMethods.GI().driver.findElement(By.xpath("//form[@name='FormMsgsINBOX']//table//tr[5]//tbody//table/tbody/tr/td[3]//a"));
					GenericMethods.GI().js_Click(we);
				}
				Thread.sleep(2000);
				int size=GenericMethods.GI().fn_GetListWebElement("Hotelogix_StayezeeLandingPage_Mail_Collection").size();
				for(int i=2; i<=size; i+=2){
					WebElement we=GenericMethods.GI().driver.findElement(By.xpath("//form[@action='move_messages.php']//tbody/tr[5]//tbody//tr["+i+"]//td[5]/b/a"));
					String str1=GenericMethods.GI().fn_GetText(we);		
					if(str1.contains(subject)){
						we.click();
						break;
			}
		    }	
		    }catch(Exception e){
				GenericMethods.GI().driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL+"t");
				GenericMethods.GI().driver.get("http://mail.stayezee.com/squirrelmail/src/login.php");

		    	StayezeeLoginPage SLP=new StayezeeLoginPage();
				SLP.fn_StayezeeLogin("rajiv", "rajivt");
				
				GenericMethods.GI().driver.switchTo().frame(1);
				String Val=GenericMethods.GI().fn_GetText(GenericMethods.GI().getWebElement("Hotelogix_StayezeeLandingPage_ViewText"));
				if(Val.equalsIgnoreCase("Received")){
					WebElement we=GenericMethods.GI().driver.findElement(By.xpath("//form[@name='FormMsgsINBOX']//table//tr[5]//tbody//table/tbody/tr/td[3]//a"));
					GenericMethods.GI().js_Click(we);
				}
				Thread.sleep(5000);
				WebElement we=GenericMethods.GI().driver.findElement(By.xpath("//a[contains(text(),'Hotelogix Account Details Re')]"));
				we.click();
//				int size=GenericMethods.GI().fn_GetListWebElement("Hotelogix_StayezeeLandingPage_Mail_Collection").size();
//				for(int i=2; i<=size; i+=2){
//					WebElement we=GenericMethods.GI().driver.findElement(By.xpath("//form[@action='move_messages.php']//tbody/tr[5]//tbody//tr["+i+"]//td[5]/b/a"));
//					String str1=GenericMethods.GI().fn_GetText(we);
//					if(str1.contains(subject)){
//						we.click();
//						break;
//			      }
//				}
		    }
	}
	
	
	public void fn_GetHotelInfo() throws Exception{
		try{
			HotelID=GenericMethods.GI().fn_GetText(GenericMethods.GI().getWebElement("Hotelogix_StayezeeLandingPage_HotelCode_TX"));
			User_Name=GenericMethods.GI().fn_GetText(GenericMethods.GI().getWebElement("Hotelogix_StayezeeLandingPage_UserName_TX"));
			Password=GenericMethods.GI().fn_GetText(GenericMethods.GI().getWebElement("Hotelogix_StayezeeLandingPage_Password_TX"));
		}catch(Exception e){
			throw e;
		}
	    }
}
