package com.qc.panda.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qc.panda.uilocators.PandaLocators;

public class PandaMIMOChannelSetup extends PandaSuperPage implements PageCommonBehaviour {

	By editCheckBx = By.xpath(PandaLocators.editCheckBx);
	By applyFlushBtn = By.xpath(PandaLocators.applyFlushBtn);

	By tx0_rx0_IOR = By.xpath(PandaLocators.tx0_rx0_IOR);
	By tx0_rx1_IOR = By.xpath(PandaLocators.tx0_rx1_IOR);
	By tx1_rx0_IOR = By.xpath(PandaLocators.tx1_rx0_IOR);
	By tx1_rx1_IOR = By.xpath(PandaLocators.tx1_rx1_IOR);

	public PandaMIMOChannelSetup(WebDriver driver) {
		this.driver = driver;
	}

	public void clickApplyFlushBtn() {
		switchFrame();
		click(applyFlushBtn);
	}

	public void clickEditCheckBx() {
		switchFrame();
		boolean isChecked = driver.findElement(editCheckBx).isSelected();
		if (!isChecked) {
			click(editCheckBx);
		}
	}

	public void set_tx0_rx0_IOR(String text) {
		switchFrame();
		setText(tx0_rx0_IOR, text);
	}

	public void set_tx0_rx1_IOR(String text) {
		setText(tx0_rx1_IOR, text);
	}

	public void set_tx1_rx0_IOR(String text) {
		setText(tx1_rx0_IOR, text);
	}

	public void set_tx1_rx1_IOR(String text) {
		setText(tx1_rx1_IOR, text);
	}

	public void switchFrame() {
		driver.switchTo().defaultContent();
		driver.switchTo().frame("work0");
	}

}
