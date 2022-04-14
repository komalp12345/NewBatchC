package com.Dec.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class go extends ParentClass{
	
	go(WebDriver driver)
	{
		this.driver = driver;
	}
    By go = By.xpath("//input[@id='btnGo']");
    public WebElement go()
    {
		return driver.findElement(go);	
    }
    By delete = By.xpath("//tbody/tr[@id='dgvGroup_ctl00__1']/td[9]/a[1]/img[1]");
    public WebElement delete()
    {
		return driver.findElement(delete);	
    }
    By msg = By.xpath("\"//span[contains(text(),'Record deleted successfully')]\"");
    public WebElement msg()
    {
		return driver.findElement(msg);  	
    }
}
