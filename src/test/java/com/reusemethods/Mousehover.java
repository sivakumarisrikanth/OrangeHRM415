package com.reusemethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {
	

	public  void mouse_hover(WebElement element,WebDriver driver) {
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();

}
}