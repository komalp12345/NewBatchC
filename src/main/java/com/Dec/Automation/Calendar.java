package com.Dec.Automation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class Calendar extends ParentClass{

	Calendar(WebDriver driver)
	{
		this.driver = driver;
	}
	By cal11 = By.xpath("//input[@id='ImageButton1']");
	
	public WebElement cal1()
	{
		return driver.findElement(cal11);	
	}
	By cal2 = By.xpath("//input[@id='ImageButton2']");
	public WebElement cal2()
	{
		return driver.findElement(cal2);	
	}
}
