package com.Dec.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewWindow extends ParentClass{

	NewWindow(WebDriver driver)
	{
		this.driver=driver;
	}
	By updateMC = By.xpath("//a[@id='lnkBtnAddMachine']");
	public WebElement MC()
	{
		return driver.findElement(updateMC);
	}
	
}
