package com.Dec.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactory {

     WebDriver driver;
     
     PageFactory() 
     {
    	 this.driver = driver;
     }
     
     @FindBy(xpath = "//input[@id='sb_form_q']")
     WebElement Search;
     public WebElement Search()
     {
    	 return Search;
     }
     @FindBy(xpath = "//body/div[2]/div[1]/div[3]/div[2]/form[1]/label[1]/*[1]")
     WebElement Enter;
     public WebElement EnterMethod()
     {
		return Enter;
    	 
     }
     
     
}