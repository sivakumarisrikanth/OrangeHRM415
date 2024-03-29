package com.reusemethods;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class Commonmethods {
	public static WebDriver driver;
	static Exelload eload=new Exelload();
	public static WebDriver getbrowser(String Browser) {
		if(Browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\ssy\\TrainingProject\\BrowserDrivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			//driver.get("http://testingmasters.com/hrm/symfony/web/index.php/auth/login");
			String url=eload.getstringdata("Sheet1", 1, 0);
			driver.get(url);
			//driver.get("http://automationpractice.com");
			System.out.println("browser launched");
		}
		else if(Browser.equals("Firefox")) {
			System.setProperty("webdriver.firefox.driver","E:\\sivakumari\\Trainingproject\\Browserdrivers\\geckodriver.exe");
			 driver=new FirefoxDriver();
			 driver.get("http://www.testingmasters.com/hrm/");
			System.out.println("firefox is launched");	
		
		
		}
		else if(Browser.equals("internetexplorer")) {
			System.setProperty("webdriver.ie.driver","E:\\sivakumari\\Trainingproject\\Browserdrivers\\IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
			 driver.get("http://www.testingmasters.com/hrm/");
			System.out.println("InternetExplorer is launched");
		
	}
		return driver;
		
	}
	public static void mouse_hover(WebElement element ) {
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();

}
	public static void clickElementByJs(WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		
	}
	public static void acceptAlert() {
		Alert alt=driver.switchTo().alert();
		alt.accept();
	}
	public static void dismissAlert() {
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
	
	}

}
