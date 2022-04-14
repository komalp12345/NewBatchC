package com.Dec.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Dashboard extends ParentClass{

	Dashboard(WebDriver driver)
	{
		this.driver=driver;
	}
	By db = By.xpath("//span[contains(text(),'Dashboard')]");
	public WebElement db()
	{
		return driver.findElement(db);
	}
	By db1 = By.xpath("//a[contains(text(),'TestMagic Control Center')]");
	public WebElement db1()
	{
		return driver.findElement(db1);
	}
	By db3 = By.xpath("//input[@id='btnShow']");
	public WebElement db3()
	{
		return driver.findElement(db3);
	}
}
