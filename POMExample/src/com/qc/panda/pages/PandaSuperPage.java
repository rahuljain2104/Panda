package com.qc.panda.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qc.panda.uilocators.PandaLocators;

public class PandaSuperPage {

	WebDriver driver;
	By cell0Locator = By.xpath(PandaLocators.cell0);

	public PandaSuperPage() {
	}

	public PandaSuperPage(WebDriver driver) {
		this.driver = driver;
	}

	// Get the User name from Home Page
	public void clickCell0() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("tree") ;
		click(cell0Locator); 
	}
	
	
	
	// generic functions

	public void setText(By locator, String text) {
		WebElement element = driver.findElement(locator) ;
		element.clear();
		element.sendKeys(text);
	}

	public String getText(By locator) {
		String text = driver.findElement(locator).getText();
		return text;
	}

	public void click(By locator) {
		driver.findElement(locator).click();
	}


}
