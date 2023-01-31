package com.phptravels.test.agent;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.phptravels.agent.Agent_LoginPage;
import com.phptravels.testbase.TestBase;
import com.phptravels.utilities.ExcelUtility;


public class TestLogin extends TestBase{

	Agent_LoginPage objlogin;
	@Test(priority=0)
	public void loginPage() throws InterruptedException {
		objlogin = new Agent_LoginPage(driver);
		objlogin.setAccntBtn();
		objlogin.setAgentLoginBtn();
		objlogin.setSwitchTab();
		Thread.sleep(3000);
		driver.findElement(By.id("cookie_stop")).click();
	}
	
	@Test(priority=1, enabled=true)
	public void invalidLoginTC001() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new Agent_LoginPage(driver);
//	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getAgentCellData(1, 1);
	    String psswrd=ExcelUtility.getAgentCellData(1, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
  }
	
	@Test(priority=2,enabled=true)
	public void invalidLoginTC002() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new Agent_LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getAgentCellData(2, 1);
	    String psswrd=ExcelUtility.getAgentCellData(2, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	}
	
	@Test(priority=3,enabled=true)
	public void invalidLoginTC003() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new Agent_LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getAgentCellData(3, 1);
	    String psswrd=ExcelUtility.getAgentCellData(3, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	}
	
	@Test(priority=4)
	public void validLoginTC004() throws IOException, InterruptedException {
		 //Create Login Page object
	    objlogin = new Agent_LoginPage(driver);
	    driver.navigate().refresh();
	    //login to application
	    String usrname= ExcelUtility.getAgentCellData(4, 1);
	    String psswrd=ExcelUtility.getAgentCellData(4, 2);
	    objlogin.setUserName(usrname);
	    objlogin.setPassword(psswrd);
	    objlogin.clickLogin();
	    Thread.sleep(3000);
	    System.out.println("***Login Successful***");
	}
	
	
}