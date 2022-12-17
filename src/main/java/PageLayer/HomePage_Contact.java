package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.ActionClass;
import UtilsLayer.JavaScript;

public class HomePage_Contact extends BaseClass
{

	@FindBy(xpath="//span[text()='Contacts']")
	private WebElement contactpage ;
	
	@FindBy(xpath="//div[@class='item']/a")
	private WebElement edit;
	
	@FindBy(name="first_name")
	private WebElement fname;
	
	@FindBy(name="last_name")
	private WebElement lname;
	
	@FindBy(xpath="//div[@name='company']/input")
	private WebElement enterCompanName;
	
	@FindBy(xpath="//span[text()='infosys']")
	private WebElement selectCompanName;
	
	@FindBy(name="status")
	private WebElement clickstatus;

	@FindBy(xpath="//div[@name='status']/div/div[5]")
	private WebElement selectstatus;
	
	@FindBy(xpath="//div[@name='channel_type']")
	private WebElement socialclick;
	
	@FindBy(xpath="//div[@name='channel_type']/div/div[3]")
	private WebElement social;
	
	@FindBy(xpath = "(//label[text()='Do not Call'])[2]")
	private WebElement do_not_call;
	
	@FindBy(xpath = "(//label[text()='Do not Text'])[2]")
	private WebElement do_not_text;
	
	@FindBy(xpath="//input[@name='day']")
	private WebElement Day_DOI;
	
	@FindBy(xpath="//input[@name='year']")
	private WebElement Year_DOI;
	
	@FindBy(xpath="//div[@name='month']")
	private WebElement ClickMonth_DOI;
	
	@FindBy(xpath="//div[@name='month']/div/div[4]")
	private WebElement Month_DOI;
	
	@FindBy(xpath="//i[@class='save icon']")
	private WebElement saveButton;
	
	public HomePage_Contact()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void contactpage()
	{
		ActionClass.moveToElement(contactpage);
		ActionClass.click1(contactpage);
	}
	
	public void clickOnEditButton()
	{
		edit.click();
	}
	
	public void enterFname(String Fname)
	{
		fname.sendKeys(Fname);
	}
	
	public void enterLname(String Lname)
	{
		lname.sendKeys(Lname);
	}
	
	public void entercompanyName(String companyName11)
	{
		enterCompanName.sendKeys(companyName11);
		selectCompanName.click();
	}
	
	public void clickStatus()
	{
		clickstatus.click();
		selectstatus.click();
	}
	
	public void selectsocial()
	{
		socialclick.click();
		social.click();
	}
	
	public void donotcall()
	{
		JavaScript.JavaScript(do_not_call);
		do_not_call.click();
	}
	public void donottext()
	{
		do_not_text.click();
	}
	
	public void enterday_DOI(String day)
	{
		Day_DOI.sendKeys(day);
	}
	public void entermonth_DOI()
	{
		ClickMonth_DOI.click();
		Month_DOI.click();
	}
	public void enteryear_DOI(String year)
	{
		Year_DOI.sendKeys(year);
	}
	
	public void savbutton()
	{
		saveButton.click();
	}
}






























