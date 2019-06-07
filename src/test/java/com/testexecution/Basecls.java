package com.testexecution;

import org.testng.annotations.BeforeSuite;

import com.reusemethods.Dropdown;
import com.reusemethods.Exelload;
import com.reusemethods.Mousehover;

public class Basecls {
	public static Exelload eload; 
	public static Mousehover mover;
	public static Dropdown drop;
	//public static Takesscreens tcs;
	@BeforeSuite
	public void intialexecution() {
		eload=new Exelload();
		mover=new Mousehover();
		drop=new Dropdown();
		
		//tcs=new Takesscreens();
		System.out.println("exel is loaded");
		
	}
}