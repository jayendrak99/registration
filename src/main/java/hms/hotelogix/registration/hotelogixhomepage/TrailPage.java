package hms.hotelogix.registration.hotelogixhomepage;

import hms.hotelogix.registration.GenericClass.GenericMethods;

public class TrailPage {

	
	public void fn_ClickContinueTrailButton() throws Exception{
		try{
			try{
				GenericMethods.GI().fn_Click(GenericMethods.GI().getWebElement("Hotelogix_TrailPage_ContinueTrail_BT"));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_TrailPage_ContinueTrail_BT"));
			}
		}catch(Exception e){
			throw e;
		}
	    }
	
	
	
}
