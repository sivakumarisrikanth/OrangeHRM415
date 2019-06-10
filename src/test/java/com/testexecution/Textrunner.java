package com.testexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.reusemethods.Commonmethods;
import com.webpages.Webcls;

public class Textrunner {
  WebDriver driver;
 // WebElement element;
  Commonmethods cm=new Commonmethods();
	@Test
	public void baseexecution() {
driver= cm.getbrowser("Chrome");
//tcs.getscreens(driver);
// cm.browserclose();
Webcls cls= PageFactory.initElements(driver,Webcls.class );
 cls.pagelogin();
 //cls.ecommerce();
 cls.applyleave();
// cls.leavebalance();
 cls.datefeild();
 cls.todatefeild();
 cls.myleave_details();
 cls.entitlements_details();
}
}
