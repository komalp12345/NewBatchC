package com.Dec.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	ExtentReports ex;
	WebDriver driver;
	
	@BeforeTest
	public void ExtentReport()
	{
		//creating directory to save html file
		String path = System.getProperty("user.dir")+"\\reportsnew\\index.html";// creating reports folder and storing html file in reports folder  
		ExtentSparkReporter report = new ExtentSparkReporter(path);// passing string argument to extent report
		
		//configuring html file 
		report.config().setReportName("UI Automation");//setting report name
		report.config().setDocumentTitle("Test Page");//setting document page title
		
		//craeting extent report
		ex = new ExtentReports();
		ex.attachReporter(report);
		ex.setSystemInfo("Test Engg", "Komal Pokharkar");	
	}
	@Test 
	public void tc()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromeSelenium\\chromedriver.exe");
		driver= new ChromeDriver();
		
		//report generation starts 
		ex.createTest("TMLogin");
		driver.get("http://localhost/TestMagic/Login.aspx");
		driver.manage().window().maximize();
		
		Select role = new Select(driver.findElement(By.id("dllRole")));
		role.selectByVisibleText("Project Admin");
		 
		Select subrole = new Select(driver.findElement(By.id("cboProject")));
		subrole.selectByVisibleText("Sample");
		 
		WebElement Login = driver.findElement(By.id("btnLogin"));
		Login.click();
		//ex.flush();//report generation stop
		
	}
	@Test
	public void m2()
	 {
		//report generation starts 
		
			 ex.createTest("Select option");
			 
			 WebElement testplan = driver.findElement(By.xpath("//span[contains(text(),'Test Plan Management')]"));
			 testplan.click();
			 
			 WebElement opt = (driver.findElement(By.xpath("//a[contains(text(),'Scheduled Test Management')]")));
			 opt.click();
			
			 driver.quit();
			
	     ex.flush();//report generation stop
	    
	     }
	public void m3()
	 {
		//report generation starts 
		
			 ex.createTest("Select option");
			 
			 WebElement testplan = driver.findElement(By.xpath("//span[contains(text(),'Test Plan Management')]"));
			 testplan.click();
			 
			 WebElement opt = (driver.findElement(By.xpath("//a[contains(text(),'Scheduled Test Management')]")));
			 opt.click();
	 }		
}
