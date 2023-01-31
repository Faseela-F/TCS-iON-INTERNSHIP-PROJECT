package com.phptravels.test.customer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import com.phptravels.customer.LoginPage;
import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility;
import com.phptravelsproject.constants.AutomationConstants;

public class LoginTest extends TestBase{

	
	LoginPage objLogin;
	@Test(priority = 0)
	public void loginpage() {
	  objLogin = new LoginPage(driver);
	  
	  objLogin.clickCookie();
	  objLogin.clickAccntbtn();
	  objLogin.clickCustlogin();
	  
	}
	
	@Test(priority=1, enabled=false)
	public void invalidLoginTC001() throws IOException, InterruptedException {
		//Create Login Page object
	    objLogin = new LoginPage(driver);
	    String usrname= ExcelUtility.getCustomerCellData(1, 1);
	    String psswrd=ExcelUtility.getCustomerCellData(1, 2);
	    
	    objLogin.setEmail(usrname);
	    objLogin.setPass(psswrd);
	    objLogin.clickLogin();
	    Thread.sleep(3000);
	}
	
	@Test(priority=2, enabled=false)
	public void invalidLoginTC002() throws IOException, InterruptedException {
		objLogin = new LoginPage(driver);
		driver.navigate().refresh();
		
		String usrname = ExcelUtility.getCustomerCellData(2, 1);
		String psswrd = ExcelUtility.getCustomerCellData(2, 2);
		objLogin.setEmail(usrname);
		objLogin.setPass(psswrd);
		objLogin.clickLogin();
		Thread.sleep(3000);
		
	
	}
	
	@Test(priority = 3, enabled = false)
	public void invalidLoginTC003() throws IOException, InterruptedException {
		objLogin = new LoginPage(driver);
		driver.navigate().refresh();
		
		String usrname= ExcelUtility.getCustomerCellData(3, 1);
	    String psswrd=ExcelUtility.getCustomerCellData(3, 2);
	    objLogin.setEmail(usrname);
	    objLogin.setPass(psswrd);
	    objLogin.clickLogin();
	    Thread.sleep(3000);
	    
	}
	
	@Test(priority = 4, enabled = true)
	public void validLoginTC004() throws IOException, InterruptedException {
		objLogin = new LoginPage(driver);
		driver.navigate().refresh();
		
		String usrname= ExcelUtility.getCustomerCellData(4, 1);
	    String psswrd=ExcelUtility.getCustomerCellData(4, 2);
	    objLogin.setEmail(usrname);
	    objLogin.setPass(psswrd);
	    objLogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualURL = driver.getCurrentUrl();
	    System.out.println(ActualURL);
	    String expURL = AutomationConstants.DASHBOARDUrl;
	    Assert.assertEquals(ActualURL, expURL);
	    System.out.println("***Login Successful***");
	}
	
}
