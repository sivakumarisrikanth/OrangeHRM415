package com.webpages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.reusemethods.Commonmethods;
import com.reusemethods.Dropdown;
import com.reusemethods.Exelload;
import com.reusemethods.Mousehover;



public class Webcls {
	public static WebDriver driver;
	Exelload eload=new Exelload();
	Mousehover mover=new Mousehover();
	Commonmethods cm=new Commonmethods();
	Dropdown drop=new Dropdown();
	@FindBy(xpath="//input[@id='txtUsername']")WebElement user;
	@FindBy(xpath="//input[@id='txtPassword']")WebElement pass;
	//@FindBy(xpath="//input[contains(@name,'password')]")WebElement password;
	@FindBy(xpath="//input[@id='btnLogin']")WebElement submit_btn;
	
	public void pagelogin() {
		//String APPURL=load.getstringdata("Sheet1", 1, 0);
		String USERNAME=eload.getstringdata("Sheet1", 1, 1);
		String PASSWORD=eload.getstringdata("Sheet1", 1, 2);
	
		
		user.sendKeys(USERNAME);
		pass.sendKeys(PASSWORD);
		submit_btn.click();
	}
	//for eecommerce site
	
	@FindBy(xpath="//a[text()='Women']")WebElement select_women;
	@FindBy(xpath="//ul[@class='submenu-container clearfix first-in-line-xs']//ul//li//a[contains(text(),'T-shirts')]")WebElement select_tshirts;
		public void ecommerce() {
			//mover.mouse_hover(select_women, driver);
			//Actions act=new Actions(driver);
			//act.moveToElement(select_women).build().perform();
    
			select_women.click();
			select_tshirts.click();
			
		}
		//apply leave objects
		@FindBy(id="menu_leave_viewLeaveModule")WebElement leavetab;
		@FindBy(id="menu_leave_applyLeave")WebElement applytab;
		@FindBy(xpath="//select[@id='applyleave_txtLeaveType']")WebElement leavetype;
		@FindBy(xpath="//a[text()='view details']")WebElement viewdetails;
		@FindBy(xpath="//select[@id='applyleave_txtLeaveType']")WebElement selectleavetype;

		public void applyleave() {
			/*leavetab.click();
			applytab.click();
			leavetype.click();*/
			//selectleavetype.click();
			//Commonmethods.clickElementByJs(selectleavetype);
			//drop.dropdownmethod(leavetype,2);
			// viewdetails.click();
			//// Alert alt=driver.switchTo().alert();
			// alt.getText();
			// alt.accept();
			Commonmethods.mouse_hover(leavetab);
			applytab.click();
			leavetype.click();
			drop.dropdownmethod(leavetype,2);
			Commonmethods.clickElementByJs(selectleavetype);
}
		
	
		
}