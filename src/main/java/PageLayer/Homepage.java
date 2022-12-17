package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.ActionClass;
import UtilsLayer.SnapShot;

public class Homepage extends BaseClass {

	
	@FindBy(xpath="//span[text()='Companies']")
	private WebElement company;
	
	@FindBy(xpath="//div[@class='item']/a")
	private WebElement edit;
	
	@FindBy(xpath="//div[@class='ui right corner labeled input']/input")
	private WebElement companyName;
	
	@FindBy(name="address")
	private WebElement AddressStreat;
	
	@FindBy(name="city")
	private WebElement AddressCity;
	
	@FindBy(name="state")
	private WebElement Addressstate;
	
	@FindBy(name="zip")
	private WebElement Addresszip;
	
	@FindBy(xpath="//div[@name='country']/input")
	private WebElement sendcountrySelect;
	
	@FindBy(xpath="//div[@name='country']/div/div[2]")
	private WebElement countrySelect;
	
	@FindBy(xpath="//input[@placeholder='Number']")
	private WebElement number;
	
	@FindBy(name="description")
	private WebElement description1;
	
	@FindBy(name="num_employees")
	private WebElement numemployees1;
	
	@FindBy(name="symbol")
	private WebElement symbol1;
	
	@FindBy(name="annual_revenue")
	private WebElement annualrevenue1;
	
	@FindBy(xpath="	//button[@class='ui linkedin button']")
	private WebElement Save;
	
	
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void companys() throws InterruptedException
	{
		Thread.sleep(5000);
		ActionClass.moveToElement(company);
		ActionClass.click1(company);
	}
	
	public void clickeditbutton()
	{
		edit.click();
	}
	public void CompanyName(String Cname)
	{
		companyName.sendKeys(Cname);	
	}
	
	public void adressstreat(String Aname)
	{
		AddressStreat.sendKeys(Aname);
	}
	public void adresscity(String Acity)
	{
		AddressCity.sendKeys(Acity);
	}
	public void adressstate(String Astate)
	{
		Addressstate.sendKeys(Astate);
	}
	public void adresspostalcode(String pcode)
	{
		Addresszip.sendKeys(pcode);
	}
	public void sendCountrySelect(String name)
	{
		sendcountrySelect.sendKeys(name);
	}
	public void countryselect()
	{
		countrySelect.click();
	}
	public void enterNumber(String num)
	{
		number.sendKeys(num);
	}
	
	public void companyDiscription(String dis)
	{
		description1.sendKeys(dis);
	}
	
	public void numemPloyees(String emp)
	{
		numemployees1.sendKeys(emp);
	}
	
	public void symbolOfCompany(String symb)
	{
		symbol1.sendKeys(symb);
	}
	
	public void revenue(String revnu)
	{
		annualrevenue1.sendKeys(revnu);
	}
	
	public void save()
	{
	Save.click();
	SnapShot.snapshot("add user");
	} 
	
}
