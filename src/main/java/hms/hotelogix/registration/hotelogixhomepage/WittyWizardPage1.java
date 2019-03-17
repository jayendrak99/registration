package hms.hotelogix.registration.hotelogixhomepage;

import hms.hotelogix.registration.GenericClass.GenericMethods;

public class WittyWizardPage1 {
	
	
	
	
	
	public void fn_PersonalInfo(String salution,String address, String cityname,String faxnum) throws Exception{
		try{
			
			try{
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage1_NameSalutation"), salution);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage1_NameSalutation"), salution);
			}
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage1_Address_ED"), address);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage1_Address_ED"), address);
			}
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage1_City_ED"), cityname);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage1_City_ED"), cityname);
			}
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage1_Fax_ED"), faxnum);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage1_Fax_ED"), faxnum);
			}
			
			try{
				GenericMethods.GI().fn_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage1_Continue_ED"));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage1_Continue_ED"));
			}
			
		}catch(Exception e){
			throw e;
		}
	}

}
