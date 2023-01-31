package com.phptravels.test.agent;

import org.testng.annotations.Test;

import com.phptravels.agent.Agent_AddFundPage;
import com.phptravels.agent.Agent_BookingsPage;
import com.phptravels.agent.Agent_MyProfilePage;
import com.phptravels.testbase.TestBase;

public class sidebarLinks extends TestBase{

	Agent_BookingsPage objbookings;
	Agent_AddFundPage objfund;
	Agent_MyProfilePage  objProfile;
	
	@Test(priority=5)
	public void sidebar() {
		objbookings= new Agent_BookingsPage(driver);
		objfund= new Agent_AddFundPage(driver);
		objProfile= new Agent_MyProfilePage(driver);
		
		objbookings.setBookinsBtn();
		objfund.setAddFund();
		objProfile.setMyProfileBtn();
		
	}
}

