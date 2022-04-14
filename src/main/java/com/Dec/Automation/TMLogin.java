package com.Dec.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TMLogin extends ParentClass{
	
          WebDriver driver; 
          
	TMLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	By login = By.id("dllRole");
	public WebElement Login() 
	{
			
			return driver.findElement(login);
	}
	By pass = By.id("cboProject");
	public WebElement pass()
	{
			
			return driver.findElement(pass);
	}
	By button  = By.xpath("//input[@id='btnLogin']");
	public WebElement button ()
	{
			return driver.findElement(button);
	}		 
			
		
        
	}	
	
	

	
	
	

