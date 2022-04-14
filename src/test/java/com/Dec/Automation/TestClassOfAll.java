package com.Dec.Automation;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestClassOfAll {

	ExtentReports ex;
	WebDriver driver;
	@BeforeTest
	public void m1()
	{
		String path = System.getProperty("user.dir")+"\\TMReports\\index.html";// creating reports folder and storing html file in reports folder  
		ExtentSparkReporter report = new ExtentSparkReporter(path);// passing string argument to extent report
		
		//configuring html file 
		report.config().setReportName("UI Automation");//setting report name
		report.config().setDocumentTitle("Test Page");//setting document page title
		
		ex = new ExtentReports();
		ex.attachReporter(report);
		ex.setSystemInfo("Test Engg", "Komal Pokharkar");	
	}
	@Test
	void m2() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\chromeSelenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost/TestMagic/Login.aspx");
		driver.manage().window().maximize();
		
		//Dropdown for username and password
		ex.createTest("LoginReport");
		TMLogin objnew = new TMLogin(driver);
		Select role = new Select(driver.findElement(By.id("dllRole")));
		role.selectByVisibleText("Project Admin");
		objnew.Login();
		
		Select subrole = new Select(driver.findElement(By.id("cboProject")));
		subrole.selectByVisibleText("Sample");
		objnew.pass();
		objnew.button().click();
		
		//Click on Login Button
		TMSelectOption obj1 = new TMSelectOption(driver);
		obj1.testpln().click();
		Thread.sleep(3000);
		obj1.grp().click();
		
		//Select dropdown for project
		Grp obj2 = new Grp(driver);
		Select project = new Select(driver.findElement(By.id("cboSubProject")));
	    project.selectByVisibleText("Sample");
	    obj2.prjct();
	}
	@Test
	void m3() throws Exception
	{
		ex.createTest("CalendarReport");
		Calendar obj3 = new Calendar(driver);
		obj3.cal1().click();
//Calendar 1
		WebElement month = driver.findElement(By.xpath("//div[@id='CalendarExtender1_title']"));
		String s1 = "January, 2021";
		while(!month.getText().contains(s1))//Check till desire month
		{
			driver.findElement(By.id("CalendarExtender1_prevArrow")).click();//To click on calendar prev arrow
		}
		List<WebElement> date = driver.findElements(By.xpath("//div[@id='CalendarExtender1_day_0_5']"));
		Thread.sleep(3000);
		for(WebElement day:date)
		{
			if(day.getText().equalsIgnoreCase("1"))
			{
				day.click();
			}
		}
		Thread.sleep(2000);
//Calendar 2
		obj3.cal2().click();
		WebElement month2 = driver.findElement(By.xpath("//div[@id='CalendarExtender2_title']"));
		String s2 = "December, 2022";
		while(!month2.getText().contains(s2))
		{
			driver.findElement(By.id("CalendarExtender2_nextArrow")).click();
		}
		List<WebElement> date2 = driver.findElements(By.xpath("//div[@id='CalendarExtender2_day_4_6']"));
		for(WebElement day2:date2)
		{
			if(day2.getText().equalsIgnoreCase("31"))
			{
				day2.click();
			}
		}
	}
	@Test
	void m4() throws Exception
	{
		ex.createTest("DashBoardReport");
		Thread.sleep(2000);
		go obj4 = new go(driver);
		obj4.go().click();
		Thread.sleep(2000);
		
		//obj4.delete().click();
	    //driver.switchTo().alert().accept();    
	    //obj4.msg().getText();
	    
	    Dashboard obj5 = new Dashboard(driver);
        obj5.db().click();
        Thread.sleep(2000);
        obj5.db1().click();
	    obj5.db3().click();
	}
	@Test
	void m5() throws Exception  
	{
		ex.createTest("NewWindowReport");
	    NewWindow obj6 = new NewWindow(driver);
	    obj6.MC().click();
	    
	    Set<String> win =driver.getWindowHandles();//To store multiple windows
	    Iterator<String> itr1 = win.iterator();//To iterate through all the elements
	    String main = itr1.next();//Main window
	    String subwin = itr1.next();//Child window
	    driver.switchTo().window(subwin);//To switch from main to child
	    
	    WebElement textwin = driver.findElement(By.xpath("//span[@id='lblReportH']"));//Text element
		System.out.println(textwin.getText());
		driver.switchTo().window(main);
		Thread.sleep(3000);
		
//		Select project1 = new Select(driver.findElement(By.id("cboSubProject")));
//	    project.selectByVisibleText("Sample");
	    //obj7.sample();
	    
//		JavascriptExecutor js = (JavascriptExecutor) driver;//javascript executer object
//		WebElement Schedule = driver.findElement(By.xpath("//input[@id='btnMSReport']"));
//		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		js.executeScript("arguments[0].scrollIntoView();", Schedule);//scroll down till element find
//		
	}
	@Test
	void m6() throws Exception
	{
		ex.createTest("LogoffReport");
		ScrollBar obj7 = new ScrollBar(driver);
		obj7.testpln().click();
		obj7.grp().click();
		obj7.TC().click();
		
		WebElement textwin1 = driver.findElement(By.xpath("//span[@id='lblCopyright']"));//Text element
		System.out.println(textwin1.getText());
		Thread.sleep(2000);
		
		obj7.logoff();
		driver.quit();
		ex.flush();
	}
	}

