package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(name="email")
	private WebElement uname;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement submit;
	
	@FindBy(xpath="//div[contains(@style,'background')]")
	private WebElement logo;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUName(String Uname)
	{
		uname.sendKeys(Uname);
	}
	
	public void enterPass(String Pass)
	{
		pass.sendKeys(Pass);
	}
	
	public void clicksubmitbutton()
	{
		submit.click();
	}
	
	
	
}
