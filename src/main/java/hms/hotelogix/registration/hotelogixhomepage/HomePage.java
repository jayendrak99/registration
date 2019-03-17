package hms.hotelogix.registration.hotelogixhomepage;


import hms.hotelogix.registration.GenericClass.GenericMethods;

public class HomePage {
	
	
	
	public void fn_TryforPortugueseHotel(String hotelname) throws Exception{
		try{
			/*try{
				GenericMethods.GI().fn_ActionsClick(GenericMethods.GI().getWebElement("Hotelogix_homepage_Portuguese_Link"));
			}catch(Exception e){
				Thread.sleep(5000);		
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_homepage_Portuguese_Link"));
	       }*/
			
			try{
				GenericMethods.GI().fn_ActionsClick(GenericMethods.GI().getWebElement("Hotelogix_homepage_Portuguese_TryFree_BT"));
			}catch(Exception e){
				Thread.sleep(5000);		
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_homepage_Portuguese_TryFree_BT"));
	        }
			
			try{
				GenericMethods.GI().TypeInField(GenericMethods.GI().getWebElement("Hotelogix_homepage_EnterHotelName_ED"), hotelname);
				}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_homepage_Portuguese_Hotelname_ED"), hotelname);
			}
			Thread.sleep(1000);
			try{
				GenericMethods.GI().fn_ActionsClick(GenericMethods.GI().getWebElement("Hotelogix_homepage_NotInListCreateHotel_Link"));
			}catch(Exception e){
				Thread.sleep(5000);		
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_homepage_NotInListCreateHotel_Link"));
	        }
		}catch(Exception e){
			throw e;
		}
	}
	
	public void fn_TryforSpanishHotel(String hotelname) throws Exception{
		try{
			try{
				GenericMethods.GI().fn_ActionsClick(GenericMethods.GI().getWebElement("Hotelogix_homepage_Spanish_Link"));
			}catch(Exception e){
				Thread.sleep(5000);		
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_homepage_Spanish_Link"));
	       }
			
			try{
				GenericMethods.GI().fn_ActionsClick(GenericMethods.GI().getWebElement("Hotelogix_homepage_Spanish_TryFree_BT"));
			}catch(Exception e){
				Thread.sleep(5000);		
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_homepage_Spanish_TryFree_BT"));
	        }
			
			try{
				GenericMethods.GI().TypeInField(GenericMethods.GI().getWebElement("Hotelogix_homepage_EnterHotelName_ED"), hotelname);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_homepage_Spanish_Hotelname_ED"), hotelname);
			}
			Thread.sleep(1000);
			try{
				GenericMethods.GI().fn_ActionsClick(GenericMethods.GI().getWebElement("Hotelogix_homepage_NotInListCreateHotel_Link"));
			}catch(Exception e){
				Thread.sleep(5000);		
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_homepage_NotInListCreateHotel_Link"));
	        }
			
			
		}catch(Exception e){
			throw e;
		}
	}
	
	public void fn_ClickTryforFree() throws Exception{
		try{
		try{

			GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_homepage_TryforFree_Link"));
		}catch(Exception e){
			Thread.sleep(5000);		
			GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_homepage_TryforFree_Link"));
       }
	}catch(Exception e){
        throw e;
	}
	}
	
	
	public void fn_clkFreeTrialLnk() throws Exception{
		try{		
		GenericMethods.GI().fn_Click(GenericMethods.GI().getWebElement("Hotelogix_homepage_FreeTrial_Link"));
		}catch(Exception e){
			GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_homepage_FreeTrial_Link"));
		}
	}
	
	public void fn_EnterHotelName(String hotelname) throws Exception{
		try{
			Thread.sleep(7000);
			GenericMethods.GI().TypeInField(GenericMethods.GI().getWebElement("Hotelogix_homepage_EnterHotelName_ED"), hotelname);
			try{
				GenericMethods.GI().fn_Click(GenericMethods.GI().getWebElement("Hotelogix_homepage_NotInListCreateHotel_Link"));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_homepage_NotInListCreateHotel_Link"));
			}
		}catch(Exception e){
			throw e;
		}
	}
	
	public void fn_EnterCreateHotelDetails(String hotelname, String fullname, String emailid, String country, String state,String mobile, String website) throws Exception{
		try{
			Thread.sleep(2000);
			try{
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_homepage_HotelName_ED"), hotelname);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_homepage_HotelName_ED"), hotelname);
			}
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_homepage_YourFullName_ED"), fullname);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_homepage_YourFullName_ED"), fullname);
			}
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_homepage_Emaill_ED"), emailid);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_homepage_Emaill_ED"), emailid);
			}
			
			try{
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_homepage_Country_DD"), country);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_homepage_Country_DD"), country);
			}
			
			try{
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_homepage_State_DD"), state);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().selectElement(GenericMethods.GI().getWebElement("Hotelogix_homepage_State_DD"), state);
			}
			
			try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_homepage_Mobile_ED"), mobile);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_homepage_Mobile_ED"), mobile);
			}
			
		/*	try{
				GenericMethods.GI().fn_Sendkeys(GenericMethods.GI().getWebElement("Hotelogix_homepage_WebSite_ED"), website);
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_homepage_WebSite_ED"), website);
			}*/
			
			try{
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_homepage_ClickToConfirm_BT"));
			}catch(Exception e){
				Thread.sleep(2000);
				GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_homepage_ClickToConfirm_BT"));
			}
		}catch(Exception e){
			throw e;
		}
	}

	
	public void fn_EnterVerificationCode(String verification) throws Exception{
		try{
			GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_homepage_VerificationCode_ED"));
			GenericMethods.GI().js_Sendkey(GenericMethods.GI().getWebElement("Hotelogix_homepage_VerificationCode_ED"), verification);
			GenericMethods.GI().js_Click(GenericMethods.GI().getWebElement("Hotelogix_homepage_CreateMyAccount_BT"));
			Thread.sleep(11000);
		}catch(Exception e){
			throw e;
		}
	}
}
