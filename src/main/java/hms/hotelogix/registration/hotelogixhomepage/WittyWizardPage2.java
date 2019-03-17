package hms.hotelogix.registration.hotelogixhomepage;

import hms.hotelogix.registration.GenericClass.GenericMethods;

public class WittyWizardPage2 {
	
	
	public void fn_AddRoomType(String roomnameditbox,String Noofroomswebelement, String roomtype, String numofrooms) throws Exception{
		try{
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement(roomnameditbox), roomtype);
			}catch(Exception e){
				Thread.sleep(5000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement(roomnameditbox), roomtype);
			}
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement(Noofroomswebelement), numofrooms);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement(Noofroomswebelement), numofrooms);
			}
		}catch(Exception e){
			throw e;
		}
	    }
	
	public void fn_Room_Details(String rackrate, String upcharge, String extrabed, String baseocc, String maxocc, String extrab) throws Exception{
		try{
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_RackRate_ED"), rackrate);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_RackRate_ED"), rackrate);
			}
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Upcharge_ED"), upcharge);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Upcharge_ED"), upcharge);
			}
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_ExtraBedPrice_ED"), extrabed);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_ExtraBedPrice_ED"), extrabed);
			}
			
			try{
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_BaseOccupancy_DD"), baseocc);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_BaseOccupancy_DD"), baseocc);
			}
			
			try{
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_MaxOccupancy_DD"), maxocc);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_MaxOccupancy_DD"), maxocc);
			}
			
			try{
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_ExtraBed_DD"), extrab);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_ExtraBed_DD"), extrab);
			}
			try{
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Icon1"));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Icon1"));
			}
			
		}catch(Exception e){
			throw e;
		}
	 }
	
	public void fn_Room_Details2(String rackrate, String upcharge, String extrabed, String baseocc, String maxocc, String extrab) throws Exception{
		try{
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_RackRate2_ED"), rackrate);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_RackRate2_ED"), rackrate);
			}
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Upcharge2_ED"), upcharge);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Upcharge2_ED"), upcharge);
			}
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_ExtraBedPrice2_ED"), extrabed);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_ExtraBedPrice2_ED"), extrabed);
			}
			
			try{
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_BaseOccupancy2_DD"), baseocc);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_BaseOccupancy2_DD"), baseocc);
			}
			
			try{
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_MaxOccupancy2_DD"), maxocc);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_MaxOccupancy2_DD"), maxocc);
			}
			
			try{
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_ExtraBed2_DD"), extrab);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_ExtraBed2_DD"), extrab);
			}
			
			try{
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Icon2"));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Icon2"));
			}
		}catch(Exception e){
			throw e;
		}
	 }
	
	public void fn_Room_Details3(String rackrate, String upcharge, String extrabed, String baseocc, String maxocc, String extrab) throws Exception{
		try{
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_RackRate3_ED"), rackrate);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_RackRate3_ED"), rackrate);
			}
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Upcharge3_ED"), upcharge);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Upcharge3_ED"), upcharge);
			}
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_ExtraBedPrice3_ED"), extrabed);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_ExtraBedPrice3_ED"), extrabed);
			}
			
			try{
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_BaseOccupancy3_DD"), baseocc);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_BaseOccupancy3_DD"), baseocc);
			}
			
			try{
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_MaxOccupancy3_DD"), maxocc);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_MaxOccupancy3_DD"), maxocc);
			}
			
			try{
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_ExtraBed3_DD"), extrab);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_ExtraBed3_DD"), extrab);
			}
			
			try{
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Icon3"));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Icon3"));
			}
		}catch(Exception e){
			throw e;
		}
	 }
	
	public void fn_AmenitiesAdd(String amenitiesaddlink) throws Exception{
		Thread.sleep(7000);
		try{
			try{
				GenericMethods.GI().fn_Click(GenericMethods.GI().getWebElement(amenitiesaddlink));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement(amenitiesaddlink));
			}
			Thread.sleep(7000);
            			GenericMethods.GI().driver.switchTo().frame(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_RoomAmenities_Iframe"));
			
			try{
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_RoomAmenitiesname_CB"));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_RoomAmenitiesname_CB"));
			}
			
			try{
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Confirm_BT"));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Confirm_BT"));
			}
			Thread.sleep(3000);
			GenericMethods.GI().driver.switchTo().defaultContent();
		}catch(Exception e){
			throw e;
		}
	    }
	
	public void fn_AddRoomNosandNumber(String roomnosandnumber, String roomprefixname,String startnum, String endnum) throws Exception{
		try{
			
			try{
				GenericMethods.GI().fn_Click(GenericMethods.GI().getWebElement(roomnosandnumber));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement(roomnosandnumber));
			}
			GenericMethods.GI().driver.switchTo().frame(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_RoomAmenities_Iframe"));
			
			try{
				GenericMethods.GI().fn_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_AddNewRoomNosNames_link"));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_AddNewRoomNosNames_link"));
			}
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_RoomNosPrefix_ED"), roomprefixname);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_RoomNosPrefix_ED"), roomprefixname);
			}
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_StartRoomNo_ED"), startnum);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_StartRoomNo_ED"), startnum);
			}
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_EndNo_ED"), endnum);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_EndNo_ED"), endnum);
			}
			
			try{
				GenericMethods.GI().fn_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_HotelRoomNumNameSave_BT"));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_HotelRoomNumNameSave_BT"));
			}
			GenericMethods.GI().driver.switchTo().defaultContent();
			
		}catch(Exception e){
			throw e;
		}
	    }
	
	public void fn_AddapplicableTax(String ApplicableTaxes_Link) throws Exception{
		try{
			
			try{
				GenericMethods.GI().fn_Click(GenericMethods.GI().getWebElement(ApplicableTaxes_Link));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement(ApplicableTaxes_Link));
			}
			Thread.sleep(3000);
			try{
				GenericMethods.GI().driver.switchTo().frame(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_RoomAmenities_Iframe"));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().driver.switchTo().frame(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_RoomAmenities_Iframe"));
			}
			
			try{
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Hlx_CleaningTax"));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Hlx_CleaningTax"));
			}
			
			try{
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_RTSave_BT"));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_RTSave_BT"));
			}
			
			GenericMethods.GI().driver.switchTo().defaultContent();
		}catch(Exception e){
			throw e;
		}
	}
	
	public void fn_ClickonTestDrive(String testdrivebutton) throws Exception{
		try{
			try{
				GenericMethods.GI().fn_Click(GenericMethods.GI().getWebElement(testdrivebutton));
			}catch(Exception e){
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement(testdrivebutton));
			}
		}catch(Exception e){
			throw e;
		}
	    }
	
	public void fn_ClickSubmit_BT() throws Exception{
		try{
			GenericMethods.GI().fn_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Submit_BT"));
			Thread.sleep(10000);
		}catch(Exception e){
			Thread.sleep(2000);
			GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_WittyWizardPage2_Submit_BT"));
		}
	    }

}
