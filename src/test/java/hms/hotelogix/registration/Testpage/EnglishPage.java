package hms.hotelogix.registration.Testpage;


import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.testng.Reporter;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import hms.hotelogix.registration.GenericClass.ExcelUtils;
import hms.hotelogix.registration.GenericClass.GenericMethods;
import hms.hotelogix.registration.hotelogixhomepage.HomePage;
import hms.hotelogix.registration.hotelogixhomepage.StayezeeLandingPage;
import hms.hotelogix.registration.hotelogixhomepage.StayezeeLoginPage;
import hms.hotelogix.registration.hotelogixhomepage.WittyWizardPage2;


public class EnglishPage {

	private HashMap<String ,String> HM;
	private String sheetname="Sheet1";
	private String Path="E:\\Testautomation\\Testautomation\\src\\main\\java\\testdata\\RegistratinTestData.xlsx";
	private ExtentReports ER;
	ExtentTest logger;
	
	
	
	
	@Test
	public void launchHotelogixDotCom() throws Exception{
		try{
			ER=new ExtentReports("Report\\RegistrationReport.html");
			logger=ER.startTest("Hotel Registration");
			logger.getRunStatus();
			logger.getStartedTime();
			GenericMethods.GI().fn_LaunchBrowser("CH");
			GenericMethods.GI().driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
			GenericMethods.GI().driver.navigate().to("http://www.hotelogix.com/");
			GenericMethods.GI().driver.manage().window().maximize();
			Thread.sleep(3000);
		}catch(Exception e){
			throw e;
		}
	    }

	
	
	@Test(priority=1)
	public void fn_HotelRegister() throws Exception{
		logger.getStartedTime();
		String methodname=Thread.currentThread().getStackTrace()[1].getMethodName();
		HM=ExcelUtils.UI().getTestCaseDataMap(Path, sheetname, methodname);
		String num=GenericMethods.GI().randomUniqueString();
		String Email="Hotelogix"+num+"@stayezee.com";
        System.out.println(Email);
		HomePage hobj=new HomePage();
		Thread.sleep(10000);
		hobj.fn_clkFreeTrialLnk();
		Thread.sleep(4000);
  		//hobj.fn_EnterHotelName(HM.get("HotelName_ED"));
		hobj.fn_EnterCreateHotelDetails(HM.get("HotelName_ED"), HM.get("YourFullName_ED"), Email, HM.get("Country_DD"), HM.get("State_DD"), HM.get("Mobile_ED"), HM.get("WebSite_ED"));
	    Thread.sleep(45000);
		StayezeeLoginPage SLP=new StayezeeLoginPage();
		SLP.fn_StayezeeLogin(HM.get("LoginName_ED"), HM.get("Password_ED"));
		StayezeeLandingPage SP=new StayezeeLandingPage();
	    SP.fn_CheckMailandClick(HM.get("View_Link"), HM.get("Subject_TX"));
	   // String verificationcode=SP.fn_GetVerificationCode();
	    SP.fn_ClickActivationLink();
	    //GenericMethods.GI().switchToWindowHandle("Free Hotel Property Management System Software, Free Hotel PMS");
	    //hobj.fn_EnterVerificationCode(verificationcode);
	    Thread.sleep(4000);
	    GenericMethods.GI().switchToWindowHandle("Hotelogix");
	}
	
	@Test(priority=2)
	public void fn_WittyWizardPages() throws Exception{
		try{
			String methodname=Thread.currentThread().getStackTrace()[1].getMethodName();
			HM=ExcelUtils.UI().getTestCaseDataMap(Path, sheetname, methodname);
			
			HM=ExcelUtils.UI().getTestCaseDataMap(Path, sheetname, "WittyWizardPage2");
			WittyWizardPage2 wi2=new WittyWizardPage2();
			wi2.fn_AddRoomType("Hotelogix_WittyWizardPage2_RoomTypeName1_ED","Hotelogix_WittyWizardPage2_NoOfRooms1_ED",HM.get("RoomTypeName_ED"),HM.get("NoOfRooms_ED"));
			wi2.fn_Room_Details(HM.get("RackRate_ED"),HM.get("Upcharge_ED"),HM.get("ExtraBedPrice_ED"),HM.get("BaseOccupancy_DD"),HM.get("MaxOccupancy_DD"),HM.get("ExtraBed_DD"));
			wi2.fn_AmenitiesAdd("Hotelogix_WittyWizardPage2_RoomAmenitiesOptional_Link");
			wi2.fn_AddRoomNosandNumber("Hotelogix_WittyWizardPage2_RoomNosNamesOptional_Link", HM.get("RoomNosPrefix_ED"),HM.get("StartRoomNo_ED"),HM.get("EndNo_ED"));
			wi2.fn_AddapplicableTax("Hotelogix_WittyWizardPage2_ApplicableTaxes_Link");
			
			HM=ExcelUtils.UI().getTestCaseDataMap(Path, sheetname, "RoomType2");
			wi2.fn_AddRoomType("Hotelogix_WittyWizardPage2_RoomTypeName2_ED","Hotelogix_WittyWizardPage2_NoOfRooms2_ED",HM.get("RoomTypeName_ED"),HM.get("NoOfRooms_ED"));
			wi2.fn_Room_Details2(HM.get("RackRate_ED"),HM.get("Upcharge_ED"),HM.get("ExtraBedPrice_ED"),HM.get("BaseOccupancy_DD"),HM.get("MaxOccupancy_DD"),HM.get("ExtraBed_DD"));
			wi2.fn_AmenitiesAdd("Hotelogix_WittyWizardPage2_RoomAmenitiesOptional2_Link");
			wi2.fn_AddRoomNosandNumber("Hotelogix_WittyWizardPage2_RoomNosNamesOptional2_Link", HM.get("RoomNosPrefix_ED"),HM.get("StartRoomNo_ED"),HM.get("EndNo_ED"));
			wi2.fn_AddapplicableTax("Hotelogix_WittyWizardPage2_ApplicableTaxes2_Link");
			 
			HM=ExcelUtils.UI().getTestCaseDataMap(Path, sheetname, "RoomType3");
			wi2.fn_AddRoomType("Hotelogix_WittyWizardPage2_RoomTypeName3_ED","Hotelogix_WittyWizardPage2_NoOfRooms3_ED",HM.get("RoomTypeName_ED"),HM.get("NoOfRooms_ED"));
			wi2.fn_Room_Details3(HM.get("RackRate_ED"),HM.get("Upcharge_ED"),HM.get("ExtraBedPrice_ED"),HM.get("BaseOccupancy_DD"),HM.get("MaxOccupancy_DD"),HM.get("ExtraBed_DD"));
			wi2.fn_AmenitiesAdd("Hotelogix_WittyWizardPage2_RoomAmenitiesOptional3_Link");
			wi2.fn_AddRoomNosandNumber("Hotelogix_WittyWizardPage2_RoomNosNamesOptional3_Link", HM.get("RoomNosPrefix_ED"),HM.get("StartRoomNo_ED"),HM.get("EndNo_ED"));
			wi2.fn_AddapplicableTax("Hotelogix_WittyWizardPage2_ApplicableTaxes3_Link");
			wi2.fn_ClickonTestDrive("Hotelogix_WittyWizardPage3_TestDriveNow_BT");
	
 		    HM=ExcelUtils.UI().getTestCaseDataMap(Path, sheetname, "CounterPage");
 		    Thread.sleep(60000);
			StayezeeLandingPage slp=new StayezeeLandingPage();
			GenericMethods.GI().switchToWindowHandle("SquirrelMail 1.4.23 [SVN]");
			
			slp.fn_CongratulationMailLink(HM.get("EmailSubject_TX"));
			slp.fn_GetHotelInfo();
			System.out.println(" Hotel Code: "+ slp.HotelID + " User Name: " +slp.User_Name + " Password: "+ slp.Password);
			Reporter.log("English Hotel Credential");
			Reporter.log("Hotel Code: "+ slp.HotelID + " User Name: " + slp.User_Name + " Password: "+ slp.Password);
			Reporter.log("Registration is completed successfully and we landed on Frontdesk Console");
			Thread.sleep(2000);
			logger.log(LogStatus.PASS,"<b>English Hotel </br> Registration Completed</b>","<b>"+ slp.HotelID  +"</b></br>" +"<b>"+  slp.User_Name + "</b><br>"+"<b>"+slp.Password +"</b><br>");
			ER.endTest(logger);
			ER.flush();
			Thread.sleep(2000);
			//GenericMethods.GI().driver.get("D:\\D Drive\\Registration\\TSTauto\\Testautomation\\Report\\RegistrationReport.html");
			GenericMethods.GI().driver.quit();
		}catch(Exception e){
			throw e;
		}
	    }
	
	
	
	
	
	
}
