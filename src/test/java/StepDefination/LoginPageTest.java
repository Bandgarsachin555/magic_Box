package StepDefination;

import BaseLayer.BaseClass;
import PageLayer.LoginPage;
import UtilsLayer.SnapShot;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class LoginPageTest extends BaseClass{
	private LoginPage l;
	@Given("User is on login page")
	public void user_is_on_login_page() 
	{
		BaseClass.browserinitialize();
		SnapShot.snapshot("loginpage");
		
	}
	@When("Enter correct password and password")
	public void enter_correct_password_and_password() 
	{
	     l=new LoginPage();
	    l.enterUName(prop.getProperty("username"));
		l.enterPass(prop.getProperty("password"));
	}


	@Then("user click on login button")
	public void user_click_on_login_button()
	{
	    l.clicksubmitbutton();
	}
	@Then("page will redired on Homepage")
	public void page_will_redired_on_homepage() 
	{
		SnapShot.snapshot("HomePage");
	}

	
	
}
