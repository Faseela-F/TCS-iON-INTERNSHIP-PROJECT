package com.phptravels.test.agent;


import org.testng.annotations.Test;

import com.phptravels.agent.Agent_Search;
import com.phptravels.testbase.TestBase;


public class TestSearch extends TestBase{
	
	Agent_Search objSearch;
	
	@Test(priority = 14)
	public void search() throws InterruptedException {
		objSearch= new Agent_Search(driver);
		objSearch.setSearchField();
		objSearch.setSearchText("Dubai");
		Thread.sleep(2000);
		objSearch.setSearchSel();
		objSearch.setSearchBtn();
		
	}

}
