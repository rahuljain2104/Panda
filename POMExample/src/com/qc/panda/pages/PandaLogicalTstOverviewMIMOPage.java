package com.qc.panda.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qc.panda.uilocators.PandaLocators;

public class PandaLogicalTstOverviewMIMOPage extends PandaSuperPage  implements PageCommonBehaviour{

	By editCheckBx = By.xpath(PandaLocators.editCheckBx);
	By applyFlushBtn = By.xpath(PandaLocators.applyFlushBtn);
	By configureBtn = By.xpath(PandaLocators.configureBtn);
	By runBtn = By.xpath(PandaLocators.runBtn);
	By stopBtn = By.xpath(PandaLocators.stopBtn);
	By phnSetupBtn = By.xpath(PandaLocators.phnSetupBtn);
	By channelSetupBtn = By.xpath(PandaLocators.channelSetupBtn);
	By csmTypeSetupBtn = By.xpath(PandaLocators.csmTypeSetupBtn);

	
	public PandaLogicalTstOverviewMIMOPage(WebDriver driver) {
		this.driver = driver ;
	}
	
	public void clickApplyFlushBtn() {
		click(applyFlushBtn);
	}

	public void clickConfigureBtn() {
		click(configureBtn);
	}

	public void clickRunBtn() {
		click(runBtn);
	}

	public void clickStopBtn() {
		click(stopBtn);
	}

	public void clickPhnSetupBtn() {
		click(phnSetupBtn);
	}

	public void clickChannelSetupBtn() {
		switchFrame() ;
		click(channelSetupBtn);
	}

	public void clickCsmTypeSetupBtn() {
		click(csmTypeSetupBtn);
	}

	public void clickEditCheckBx() {
		click(editCheckBx);
	}

	public void switchFrame() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("work0") ;
	}

}
