package UtilsLayer;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import BaseLayer.BaseClass;

public class SnapShot extends BaseClass{

	
	public static void snapshot(String name)
	{
		
		try {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File f=ts.getScreenshotAs(OutputType.FILE);
			
			File fis =new File("C:\\Users\\vilaas\\eclipse-workspace\\CRM_Cucumber\\Pass_ScreenShot\\"+name+".png"+" "+System.currentTimeMillis());
		   
			FileUtils.copyFile(f, fis);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
	}
}
