package com.phptravels.customer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

	public class LoginPage {

		WebDriver driver;
		
		/*Locating elements*/
		
		@FindBy(id="cookie_stop")
		private WebElement cookie;
		public void clickCookie() {
			cookie.click();
		}
		
		@FindBy(css="#ACCOUNT")
		private WebElement account_bttn;
		public void clickAccntbtn() {
			account_bttn.click();
		}
		
		@FindBy(css="ul.show > li:nth-child(1) > a")
		private WebElement customerlogin;
		public void clickCustlogin() {
			customerlogin.click();
		}
		
		@FindBy(css="div.modal-body:nth-child(2) > div:nth-child(1) > form:nth-child(2) > div:nth-child(1) > div:nth-child(2) > input")
		private WebElement customerEmail;
		public void setEmail(String strEmail) {
			customerEmail.sendKeys(strEmail);
		}
		
		@FindBy(css=".mb-2 > input")
		private WebElement customerPassword;
		public void setPass(String strPass) {
			customerPassword.sendKeys(strPass);
		}
		
		@FindBy(css="button.btn-lg")
		private WebElement loginbtn;
		public void clickLogin() {
			loginbtn.click();
		}
		
		public LoginPage(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
	}
