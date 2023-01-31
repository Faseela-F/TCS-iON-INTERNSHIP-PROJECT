package com.phptravels.test.agent;

import org.testng.annotations.Test;

import com.phptravels.agent.Agent_LandingPage;
import com.phptravels.testbase.TestBase;


public class TestLanding extends TestBase {

	Agent_LandingPage objlandg;
	@Test(priority=5)
	public void verifyhome() {
		objlandg= new Agent_LandingPage(driver);
		objlandg.clickHome();
//		String expectedTitle =AutomationConstants.HOME_PAGE_TITLE;
//	    String actualTitle = driver.getTitle();
//	    Assert.assertEquals(expectedTitle,actualTitle);
	}
	@Test(priority=6)
	public void verifyhotels() {
		objlandg= new Agent_LandingPage(driver);
		objlandg.clickHotels();
	}
	@Test(priority=7)
	public void verifyflights() {
		objlandg= new Agent_LandingPage(driver);
		objlandg.clickFlights();
	}
	@Test(priority=8)
	public void verifytours() {
		objlandg= new Agent_LandingPage(driver);
		objlandg.clickTours();
	}
	@Test(priority=9)
	public void verifyvisa() {
		objlandg= new Agent_LandingPage(driver);
		objlandg.clickVisa();
	}
	@Test(priority=10)
	public void verifyblog() {
		objlandg= new Agent_LandingPage(driver);
		objlandg.clickBlog();
	}
	@Test(priority=11)
	public void verifyoffers() {
		objlandg= new Agent_LandingPage(driver);
		objlandg.clickOffers();
	}
	@Test(priority=12)
	public void verifycompany() {
		objlandg= new Agent_LandingPage(driver);
		objlandg.clickCompany();
	}
	
	@Test(priority=13)
	public void verifyusd() {
		objlandg= new Agent_LandingPage(driver);
		objlandg.clickUsd();
		objlandg.clickInr();
	}
	
	
}
