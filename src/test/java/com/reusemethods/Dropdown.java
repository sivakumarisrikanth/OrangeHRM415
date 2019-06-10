package com.reusemethods;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class Dropdown {
	public void dropdownmethod(WebElement element,int index) {
	Select sel=new Select(element);
	sel.selectByIndex(index);
		
	}
	
		public void dropdownmethodbytext(WebElement element,String text) {
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
			
		}
}
