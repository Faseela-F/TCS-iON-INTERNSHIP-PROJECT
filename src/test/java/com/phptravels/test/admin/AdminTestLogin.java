package com.phptravels.test.admin;

import java.io.IOException;
import org.testng.annotations.Test;

import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility;
import com.phptravles.admin.Admin_LoginPage;


public class AdminTestLogin extends TestBase{

	Admin_LoginPage objlogin;
	
	
	@Test(priority=0)
	public void loginPage() throws InterruptedException {
		objlogin = new Admin_LoginPage(driver);
		driver.get("https://phptravels.net/admin");
		//objlogin.setAdminLoginBtn();
		//objlogin.setSwitchTab();
	}
	
	@Test(priority=1, enabled=true)
	public void invalidLoginTC001() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new Admin_LoginPage(driver);
//	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getAdminCellData(1, 1);
	    String psswrd=ExcelUtility.getAdminCellData(1, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	}
	@Test(priority=2,enabled=true)
	public void invalidLoginTC002() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new Admin_LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getAdminCellData(2, 1);
	    String psswrd=ExcelUtility.getAdminCellData(2, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	}
	@Test(priority=3,enabled=true)
	public void invalidLoginTC003() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new Admin_LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getAdminCellData(3, 1);
	    String psswrd=ExcelUtility.getAdminCellData(3, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	}
	@Test(priority=4)
	public void validLoginTC004() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new Admin_LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getAdminCellData(4, 1);
	    String psswrd=ExcelUtility.getAdminCellData(4, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(5000);
	    System.out.println("***Login Successful***");
	}
}
