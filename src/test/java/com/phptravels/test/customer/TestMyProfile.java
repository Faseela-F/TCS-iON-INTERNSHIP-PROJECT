package com.phptravels.test.customer;
import java.io.IOException;

import org.testng.annotations.Test;

import com.phptravels.customer.MyProfilePage;
import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility;


public class TestMyProfile extends TestBase{

	MyProfilePage objprof;
	
	@Test(priority=7)
	public void Myprofile() throws IOException, InterruptedException {
		objprof= new MyProfilePage(driver);
		objprof.setMyProfileBtn();
		Thread.sleep(3000);
		
		String address1= ExcelUtility.getCustomerCellData(8, 0);
		String address2= ExcelUtility.getCustomerCellData(8, 1);
		String zip= ExcelUtility.getCustomerCellData(8, 2);
		String city= ExcelUtility.getCustomerCellData(8, 3);
		String state= ExcelUtility.getCustomerCellData(8, 4);
		
		objprof.setState(state);
		objprof.setCity(city);
		Thread.sleep(1000);
		objprof.setZip(zip);
		Thread.sleep(1000);
		objprof.setAdres1(address1);
		objprof.setAdres2(address2);
		objprof.setUpdProf();
		
	}
	
	@Test(priority=8)
	public void Logout() throws InterruptedException {
		objprof= new MyProfilePage(driver);
		objprof.setLogoutBtn();
		Thread.sleep(3000);
		String ActualTitle = driver.getTitle();
	    System.out.println(ActualTitle);
	}
}
