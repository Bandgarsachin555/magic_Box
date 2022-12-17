package UtilsLayer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class JavaScript extends BaseClass{
	private static JavascriptExecutor js;
	public static void  JavaScript(WebElement wb)
	{
		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].scrollIntoView(true);", wb);
		                  
	}
	
}
