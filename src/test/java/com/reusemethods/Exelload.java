package com.reusemethods;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exelload {
	public XSSFWorkbook xsw;
	public Exelload() {
		File src=new File("E:\\ssy\\TrainingProject\\TestDataFile\\hrmexel.xlsx");
		FileInputStream fis;
		try {
			fis = new FileInputStream(src);
		
		
			xsw=new XSSFWorkbook(fis);
		} catch (IOException e) {
			System.out.println("file is not found");
		}


	
}
          public String getstringdata(String sheetname,int rownum,int cellnum){
		return xsw.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
    	   
       }
	}


