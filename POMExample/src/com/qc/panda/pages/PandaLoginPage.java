package com.qc.panda.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qc.panda.uilocators.PandaLocators;


public class PandaLoginPage extends PandaSuperPage  implements PageCommonBehaviour {

	By ownerNameTxtBx = By.xpath(PandaLocators.ownerNameTextBox);
	By loginBtn = By.xpath(PandaLocators.loginButton);
	By releaseSystemBtn = By.xpath(PandaLocators.releaseSystemBtn);
	
	public PandaLoginPage(WebDriver driver){
		this.driver = driver;
	}
	
	//Set owner name in textbox
	public void setOwnerName(String ownerName){
		switchFrame() ;
		if(driver.findElements(releaseSystemBtn).size() != 0){
			clickReleaseSystemBtn();
		}
		setText(ownerNameTxtBx, ownerName);
	}
	
	//Click on login button
	public void clickLogin(){
			click(loginBtn);
	}
	
	public void clickReleaseSystemBtn(){
		switchFrame() ;
		click(releaseSystemBtn);
	}
	
	public void switchFrame(){
		driver.switchTo().defaultContent();
		driver.switchTo().frame("work0") ;
	}

}
