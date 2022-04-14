package com.Dec.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TMSelectOption extends ParentClass{

	TMSelectOption(WebDriver driver)
	{
		this.driver = driver;
	}
	By TestPlan = By.xpath("//span[contains(text(),'Test Plan Management')]");
	public WebElement testpln()
	{
		return driver.findElement(TestPlan);	
	}
	By schedule = By.xpath("//a[contains(text(),'Scheduled Test Management')]");
	public WebElement grp()
	{
		return driver.findElement(schedule);
	}
}
