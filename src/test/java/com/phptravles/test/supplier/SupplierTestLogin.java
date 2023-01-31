package com.phptravles.test.supplier;

import java.io.IOException;

import org.testng.annotations.Test;

import com.phptravels.supplier.Supplier_LoginPage;
import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility;

public class SupplierTestLogin extends TestBase{

	Supplier_LoginPage objlogin;
	@Test(priority=0)
	public void loginPage() throws InterruptedException {
		objlogin = new Supplier_LoginPage(driver);
		objlogin.AccntClick();
		objlogin.setAdminLoginBtn();
		objlogin.setSwitchTab();
	}
	@Test(priority=1, enabled=false)
	public void invalidLoginTC001() throws IOException, InterruptedException {
		
	    objlogin = new Supplier_LoginPage(driver);
   
	    String usrname= ExcelUtility.getSupplierCellData(1, 1);
	    String psswrd=ExcelUtility.getSupplierCellData(1, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	}
	@Test(priority=2,enabled=false)
	public void invalidLoginTC002() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new Supplier_LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getSupplierCellData(2, 1);
	    String psswrd=ExcelUtility.getSupplierCellData(2, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	}
	@Test(priority=3,enabled=false)
	public void invalidLoginTC003() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new Supplier_LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getSupplierCellData(3, 1);
	    String psswrd=ExcelUtility.getSupplierCellData(3, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	}
	@Test(priority=4)
	public void validLoginTC004() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new Supplier_LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getSupplierCellData(4, 1);
	    String psswrd=ExcelUtility.getSupplierCellData(4, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(5000);
	    String ActualTittle = driver.getTitle();
	    System.out.println(ActualTittle);
	    System.out.println("***Login Successful***");
	}

	
}
