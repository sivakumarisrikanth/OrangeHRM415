package com.testexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.reusemethods.Commonmethods;
import com.webpages.Webcls;

public class Textrunner extends Basecls {
 // WebDriver driver;
  ExtentTest logger;
  
 // WebElement element;
  Commonmethods cm=new Commonmethods();
	@Test
	public void baseexecution() {
		logger=report.createTest("loginhrm");
		logger.info("hrm login with valid details");
driver= Commonmethods.getbrowser("Chrome");
//tcs.getscreens(driver);
// cm.browserclose();
Webcls cls= PageFactory.initElements(driver,Webcls.class );
logger=report.createTest("pagelogin sucess");
 cls.pagelogin();
 //cls.ecommerce();
// logger=report.createTest("apply leave successfully");
 cls.applyleave();
// cls.leavebalance();
/* cls.datefeild();
 cls.todatefeild();
 cls.myleave_details();
 cls.entitlements_details();*/
}
}
