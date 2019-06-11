package com.testexecution;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.reusemethods.Dropdown;
import com.reusemethods.Exelload;
import com.reusemethods.Mousehover;
import com.reusemethods.Takesscreens;

public class Basecls {
	public static Exelload eload; 
	public static Mousehover mover;
	public static Dropdown drop;
	public static Takesscreens tcs;
	public static ExtentReports report;
	public static ExtentTest logger;
	public  WebDriver driver;
	@BeforeSuite
	public void intialexecution() {
		eload=new Exelload();
		mover=new Mousehover();
		drop=new Dropdown();
		
		//tcs=new Takesscreens();
		System.out.println("exel is loaded");
		ExtentHtmlReporter extent=new ExtentHtmlReporter("E:\\ssy\\TrainingProject\\ExtentsReports\\TRAININGPROJECTHTMLREPORTS"+Takesscreens.gettimestamp()+".html");
		 report=new ExtentReports();
		 report.attachReporter(extent);
	}
	@AfterMethod
	public void screenshotattach(ITestResult result) throws IOException {
		Reporter.log("Attach testcases screenshot to htmlreport");
		if(result.getStatus()==ITestResult.SUCCESS) {
			logger.pass("success",MediaEntityBuilder.createScreenCaptureFromPath(Takesscreens.getscreens(driver)).build());
			Reporter.log("Attach pass testcases screenshot to htmlreport");
		}
		else if(result.getStatus()==ITestResult.FAILURE) {
			logger.fail("failure",MediaEntityBuilder.createScreenCaptureFromPath(Takesscreens.getscreens(driver)).build());
			Reporter.log("Attach fail testcases screenshot to htmlreport");
		}
		else {
			System.out.println("screens are not attached");
		}
		report.flush();
		
			Reporter.log("htmlreport are done",true);
		}
		
	}
