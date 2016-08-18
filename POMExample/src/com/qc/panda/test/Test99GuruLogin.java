package com.qc.panda.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.qc.panda.pages.PandaLoginPage;

public class Test99GuruLogin {

	WebDriver driver;
	PandaLoginPage objLogin;
	
	
	@BeforeTest
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/V4/");
	}

	/**
	 * This test case will login in http://demo.guru99.com/V4/
	 * Verify login page title as guru99 bank
	 * Login to application
	 * Verify the home page using Dashboard message
	 */
	@Test(priority=0)
	public void test_Home_Page_Appear_Correct(){
		//Create Login Page object
	objLogin = new PandaLoginPage(driver);
	//Verify login page title
	//String loginPageTitle = objLogin.getLoginTitle();
	//Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
	//login to application
	//objLogin.loginToGuru99("mgr123", "mgr!23");
	// go the next page
	//objHomePage = new PandaHomePage(driver);
	//Verify home page
	//Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
	}
	
}
