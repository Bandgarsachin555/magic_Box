package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import BaseLayer.BaseClass;

public class ActionClass extends BaseClass{

	public static Actions act;
	public static void moveToElement(WebElement wb)
	{
		 act=new Actions(driver);
		 
		 act.moveToElement(wb).build().perform();
		 
	}
	public static void click1(WebElement wb)
	{
		act.click(wb).click().perform();
	}
}
