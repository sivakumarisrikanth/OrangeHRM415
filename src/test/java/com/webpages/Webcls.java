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
			//Commonmethods.clickElementByJs(selectleavetype);
}
		//leave balance objects
		@FindBy(xpath="leaveBalance_details_link")WebElement leave_balance;
		public void leavebalance() {
			leave_balance.click();
		}
			@FindBy(xpath="//input[@id='applyleave_txtFromDate']")WebElement fromdate;
			@FindBy(xpath="//select[@class='ui-datepicker-year']")WebElement year;
			@FindBy(xpath="//select[@class='ui-datepicker-month']")WebElement month;
			@FindBy(xpath="//a[text()='22']")WebElement date;
			@FindBy(xpath="//input[@id='applyleave_txtToDate']")WebElement todate;
			@FindBy(xpath="//select[@class='ui-datepicker-year']")WebElement toyear;
			@FindBy(xpath="//select[@class='ui-datepicker-month']")WebElement tomonth;
			@FindBy(xpath="//a[text()='29']")WebElement toodate;
			@FindBy(xpath="//textarea[@id='applyleave_txtComment']")WebElement commentbox;
			@FindBy(xpath="//input[@id='applyBtn']")WebElement apply_btn;
			@FindBy(xpath="//select[@id='applyleave_partialDays']")WebElement partialdays;
			@FindBy(xpath="//select[@id='applyleave_firstDuration_duration']")WebElement Specify_Time ;
			@FindBy(xpath="//select[@id='applyleave_firstDuration_time_from']")WebElement from_time;
			@FindBy(xpath="//select[@id='applyleave_firstDuration_time_to']")WebElement to_time;
			public void  datefeild() {
				fromdate.click();
			
				drop.dropdownmethodbytext(year, "2019");
				drop.dropdownmethodbytext(month, "Jun");
				date.click();
			}
			public void  todatefeild() {
				Commonmethods.clickElementByJs(todate);
				//todate.click();
				
				drop.dropdownmethodbytext(toyear, "2019");
				drop.dropdownmethodbytext(tomonth, "Jun");
				toodate.click();
				drop.dropdownmethodbytext(partialdays, "All Days");
				drop.dropdownmethodbytext(Specify_Time, "Specify Time");
				drop.dropdownmethodbytext(from_time, "09:00");
				drop.dropdownmethodbytext(to_time, "12:00");
			String commenttext=eload.getstringdata("Sheet1", 1, 3);
				
			commentbox.sendKeys(commenttext);
			
			apply_btn.click();
			}
		
			//my leave objects
			@FindBy(xpath="//a[text()='My Leave']")WebElement myLeavetab;
			@FindBy(xpath="//input[@id='calFromDate']")WebElement from_leave;
			@FindBy(xpath="//select[@class='ui-datepicker-year']")WebElement from_year;
			@FindBy(xpath="//select[@class='ui-datepicker-month']")WebElement from_month;
			@FindBy(xpath="//a[text()='16']")WebElement from_date;
			@FindBy(xpath="//a[text()='18']")WebElement to_date;
			@FindBy(xpath="//select[@class='ui-datepicker-month']")WebElement to_month;
			@FindBy(xpath="//select[@class='ui-datepicker-year']")WebElement to_year ;
			
			@FindBy(xpath="//input[@id='calToDate']")WebElement to_leave;
			@FindBy(xpath="//input[@id='leaveList_chkSearchFilter_2']")WebElement check_schedule;
			@FindBy(xpath="//input[@id='btnSearch']")WebElement click_search;
			public void myleave_details() {
				Commonmethods.mouse_hover(leavetab);
				myLeavetab.click();
				from_leave.click();
				drop.dropdownmethodbytext(from_year, "2019");
				drop.dropdownmethodbytext(from_month, "Jun");
				from_date.click();
				//to_leave.click();
				Commonmethods.clickElementByJs(to_leave);
				drop.dropdownmethodbytext(to_year, "2019");
				drop.dropdownmethodbytext(to_month, "Jun");
				to_date.click();
				check_schedule.click();
				click_search.click();
			}
			//entitlements objects
			@FindBy(xpath="//a[text()='Entitlements']")WebElement Entitlements;
			@FindBy(xpath="//a[text()='My Entitlements']")WebElement My_Entitlements;
			@FindBy(xpath="//select[@id='entitlements_leave_type']")WebElement Entitlements_leave ;
			@FindBy(xpath="//select[@id='period']")WebElement leave_period;
			@FindBy(xpath="//input[@id='searchBtn']")WebElement Entitlements_search;
			//@FindBy(xpath="//a[text()='18']")WebElement to_date;
			public void entitlements_details() {
				Commonmethods.mouse_hover(leavetab);
				Commonmethods.mouse_hover(Entitlements);
				My_Entitlements.click();
				Entitlements_leave.click();
				drop.dropdownmethodbytext(Entitlements_leave, "Personal Leave");
				leave_period.click();
				drop.dropdownmethodbytext(leave_period, "2018-01-01 - 2018-12-31");
				Entitlements_search.click();
			}
		}
		
	
		
