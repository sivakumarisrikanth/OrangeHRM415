package com.reusemethods;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Takesscreens {
	public static  String getscreens(WebDriver driver) {
		String Screenshotpath="E:\\ssy\\TrainingProject\\Screenshots\\screens_"+gettimestamp()+".png";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Screen=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(Screen,new File(Screenshotpath));
		} catch (IOException e) {
			System.out.println("screens are not attached"+e.getMessage());
		}
		return Screenshotpath;
	}
	public static String gettimestamp() {
		DateFormat dateformat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date date=new Date();
		return dateformat.format(date);
		
		
	}
}
