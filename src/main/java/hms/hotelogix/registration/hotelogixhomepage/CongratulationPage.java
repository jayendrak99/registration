package hms.hotelogix.registration.hotelogixhomepage;

import hms.hotelogix.registration.GenericClass.GenericMethods;

public class CongratulationPage {

	
	
	
	public void fn_ClickNotnowOrSubmitButton() throws Exception{
		try{
			try{
				GenericMethods.GI().fn_Click(GenericMethods.GI().getWebElement("Hotelogix_CongratulationPage_Submit_BT"));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_CongratulationPage_Submit_BT"));
			}
		}catch(Exception e){
			throw e;
		}
	}
}
