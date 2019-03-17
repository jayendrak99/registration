	package hms.hotelogix.registration.hotelogixhomepage;

import hms.hotelogix.registration.GenericClass.GenericMethods;

public class WittyWizardPage3 {
		
		
		public void fn_ClickonTestDrive(String testdrivebutton) throws Exception{
			try{
				try{
					GenericMethods.GI().fn_Click(GenericMethods.GI().getWebElement(testdrivebutton));
				}catch(Exception e){
					Thread.sleep(2000);
					GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement(testdrivebutton));
				}
			}catch(Exception e){
				throw e;
			}
		    }
		
		
	
	}
