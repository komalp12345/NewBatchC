package com.Dec.Automation;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class newreport {
	
	public void ExtentReport()
	{
		//creating directory to save html file
		String path = System.getProperty("user.dir")+"\\reports\\index.html";// creating reports folder and storing html file in reports folder  
		ExtentSparkReporter report = new ExtentSparkReporter(path);// passing string argument to extent report
		
		//configuring html file 
		report.config().setReportName("UI Automation");//setting report name
		report.config().setDocumentTitle("Test Page");//setting document page title
		
		//craeting extent report
		ExtentReports ex = new ExtentReports();
		
	}

}
