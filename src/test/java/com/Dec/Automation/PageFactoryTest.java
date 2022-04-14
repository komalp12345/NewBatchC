package com.Dec.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class PageFactoryTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\chromeSelenium\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/?toWww=1&redig=3D7B810CC3C442BD946571028B5F95FE");
		
		PageFactory obj = new PageFactory();
		obj.Search().sendKeys("TestNG");
        obj.EnterMethod().click();
        Thread.sleep(2000);
        driver.close();
	}

}
