package com.phptravels.test.customer;

import org.testng.annotations.Test;

import com.phptravels.customer.AddFundsPage;
import com.phptravels.testbase.TestBase;
public class TestAddFund extends TestBase{

	AddFundsPage objFund;
	
	@Test(priority = 6)
	public void AddFund() throws InterruptedException {
		objFund = new AddFundsPage(driver);
		
		objFund.setAddFund();
		objFund.setPaypalRdBtn();
		objFund.setAmount();
		objFund.setPayBtn();
		objFund.setCancelPay();
	}
}
