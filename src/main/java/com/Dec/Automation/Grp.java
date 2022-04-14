package com.Dec.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Grp extends ParentClass{
	
	Grp(WebDriver driver)
	{
		this.driver = driver;
	}
	By project = By.xpath("//select[@id='cboSubProject']");
	public WebElement prjct()
	{
		return driver.findElement(project);
		
	}
}
