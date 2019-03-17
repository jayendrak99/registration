package hms.hotelogix.registration.Testpage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class LanguageBaseClass {

	@BeforeTest
	@Parameters("test")
	public void setup(String test) throws Exception{
		if(test.equalsIgnoreCase("English")){
			
			EnglishPage EP = new EnglishPage();
			EP.launchHotelogixDotCom();
			EP.fn_HotelRegister();
			EP.fn_WittyWizardPages();
			
		}else if(test.equals("Spanish")){
			SpanishPage Sp=new SpanishPage();
			Sp.launchHotelogixDotCom();
			Sp.fn_HotelRegister();
			Sp.fn_WittyWizardPages();
			
		}
	    }
	
	
}
