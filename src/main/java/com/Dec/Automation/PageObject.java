package com.Dec.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject {

	WebDriver driver;
	
	 PageObject(WebDriver driver)
	{
		this.driver = driver;
	}
	By username = By.xpath("//input[@id='username']");
	public WebElement username()
	{
		return driver.findElement(username);
	}
	By password = By.xpath("//input[@id='password']");
	public WebElement password()
	{
		return driver.findElement(password);
	}
	By login = By.xpath("//button[contains(text(),'Log in')]");
	public WebElement login()
	{
		return driver.findElement(login);
	}
	
	
	
	
}
