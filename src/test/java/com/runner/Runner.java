package com.runner;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


import com.Locators.PageElements;
import com.baseclass.BaseClass;
import com.config.FileReaderManager;

public class Runner extends BaseClass {

	
	@BeforeSuite
	public void launch() {
		getDriver(FileReaderManager.getBrowserName());
	}
	
	@Test
	public void registerPage() {
	//	ConfigReader.propFileReader();
		
		urlLaunch(FileReaderManager.getUrl());
		elementClick(PageElements.getElements().getNewcustomer_btn());
	}
	@Test(dependsOnMethods = "registerPage")
	public void register() {
		implicitWait();
		System.out.println(getPageTitle());
	//	Assert.assertEquals(getPageTitle(), "");
		inputToElement(PageElements.getElements().getFirstName(), FileReaderManager.getFirstName());
		inputToElement(PageElements.getElements().getLastName(), FileReaderManager.getLastName());
		inputToElement(PageElements.getElements().getEmail(), FileReaderManager.getEmail());
		inputToElement(PageElements.getElements().getPhone(), FileReaderManager.getPhone());
		inputToElement(PageElements.getElements().getPassword(), FileReaderManager.getPassword());
		inputToElement(PageElements.getElements().getConfirm_pass(), FileReaderManager.getPassword());
		elementClick(PageElements.getElements().getSubscribe_radiobtn());
		elementClick(PageElements.getElements().getAgree());
		elementClick(PageElements.getElements().getContinue_btn());
	}
	@Test(dependsOnMethods = "register")
	public void registerSuccess() {
		try {
			Assert.assertNotEquals(getPageTitle(),"Your Account Has Been Created!" , "");
			screenshot("errorPage");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
