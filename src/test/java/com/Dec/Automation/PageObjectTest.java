package com.Dec.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectTest {

	public static void main(String[] args) throws Exception {

    System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.pokharkar\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    
    driver.get("https://odc.greythr.com/uas/portal/auth/login?login_challenge=eb071b46909f459385ea3c145044cab2");
    driver.manage().window().maximize();

    PageObject obj = new PageObject(driver);
    obj.username().sendKeys("P0119");
    obj.password().sendKeys("1234566");
    Thread.sleep(2000);
    obj.login().click();
    //driver.close();
	}

}
