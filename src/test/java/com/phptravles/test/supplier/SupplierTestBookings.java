package com.phptravles.test.supplier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.phptravels.supplier.Supplier_BookingsPage;
import com.phptravels.testbase.TestBase;

public class SupplierTestBookings extends TestBase{
	
	Supplier_BookingsPage objBook;
	@Test(priority=5)
	public void dashboardTS002() {
		objBook= new Supplier_BookingsPage(driver);
		objBook.setdashboardBtn();
		String overview=objBook.setsalesOverviewText();
		System.out.println(overview);
		
		boolean chart=objBook.setRevenueBreakChart();
		System.out.println("Chart Visible: "+ chart);
		Assert.assertEquals(chart, true);
	}
	@Test(priority=6)
	public void Tours() {
		objBook=new Supplier_BookingsPage(driver);
		objBook.setToursManin();
		objBook.setToursSub();
		objBook.setManageTours();
		WebElement heading= driver.findElement(By.cssSelector(".lead > small"));
		String headingText=heading.getText();
		System.out.println("***Tours Page is visible***");
	}
	@Test(priority = 7)
	public void BookingsTS004() throws InterruptedException {
		objBook= new Supplier_BookingsPage(driver);
		objBook.setBookingsBtn();
		Thread.sleep(2000);
		String errormsg = driver.findElement(By.cssSelector("#container > h1")).getText();
		System.out.println(errormsg);
	}

}
