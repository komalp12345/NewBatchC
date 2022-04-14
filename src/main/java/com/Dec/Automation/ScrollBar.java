package com.Dec.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ScrollBar extends ParentClass{

	ScrollBar(WebDriver driver)
	{
		this.driver=driver;
	}
	By TestPlan = By.xpath("//span[contains(text(),'Test Plan Management')]");
	public WebElement testpln()
	{
		return driver.findElement(TestPlan);	
	}
	By suite = By.xpath("//span[contains(text(),'Test Suite Management')]");
	public WebElement grp()
	{
		return driver.findElement(suite);
	}
	By autoTC = By.xpath("//a[contains(text(),'Automated Test Case')]");
	public WebElement TC()
	{
		return driver.findElement(autoTC);
	}
	By sample = By.xpath("//select[@id='cboSubProject']");
	public WebElement sample()
	{
		return driver.findElement(sample);
	}
	By logoff = By.xpath("//input[@id='LogOff']");
	public WebElement logoff()
	{
		return driver.findElement(logoff);
	}
}
