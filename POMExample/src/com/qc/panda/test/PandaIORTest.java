package com.qc.panda.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.qc.panda.pages.PandaLogicalTstOverviewMIMOPage;
import com.qc.panda.pages.PandaLoginPage;
import com.qc.panda.pages.PandaMIMOChannelSetup;
import com.qc.panda.pages.PandaSuperPage;




public class PandaIORTest {

	WebDriver driver;
	PandaSuperPage pandaSupePage;
	PandaLoginPage pandaLogin;
	
	PandaLogicalTstOverviewMIMOPage pandaLogicalTstOverviewMIMO;
	PandaMIMOChannelSetup pandaMIMOChannelSetup ;
	
	@BeforeTest
	public void setup(){
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://qct-8593-panda-0/");
	}

	
	@Test(priority=0)
	public void test_Home_Page_Appear_Correct(){
		//Create Login Page object
	pandaLogin = new PandaLoginPage(driver);
	pandaSupePage = new PandaSuperPage(driver);
	pandaLogicalTstOverviewMIMO = new PandaLogicalTstOverviewMIMOPage(driver);
	pandaMIMOChannelSetup = new PandaMIMOChannelSetup(driver) ;
	
	
	//Verify login page title
 	pandaLogin.setOwnerName("randomOwner");
	
	pandaLogin.clickLogin();
	
	Alert alert=driver.switchTo().alert();
	
	alert.accept();
	
 	
	
	pandaSupePage.clickCell0() ;
	
	
	pandaLogicalTstOverviewMIMO.clickChannelSetupBtn();
	
	pandaMIMOChannelSetup.clickEditCheckBx();
	
	pandaMIMOChannelSetup.set_tx0_rx0_IOR("-40");
	pandaMIMOChannelSetup.set_tx0_rx1_IOR("-45");
	pandaMIMOChannelSetup.set_tx1_rx0_IOR("-50");
	pandaMIMOChannelSetup.set_tx1_rx1_IOR("-55");
	
	pandaMIMOChannelSetup.clickApplyFlushBtn();
	
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	
	pandaMIMOChannelSetup.set_tx0_rx0_IOR("-60");
	pandaMIMOChannelSetup.set_tx0_rx1_IOR("-60");
	pandaMIMOChannelSetup.set_tx1_rx0_IOR("-60");
	pandaMIMOChannelSetup.set_tx1_rx1_IOR("-60");
	
	pandaMIMOChannelSetup.clickApplyFlushBtn();
	}
	
}
