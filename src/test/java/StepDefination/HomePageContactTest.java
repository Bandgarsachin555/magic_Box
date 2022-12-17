package StepDefination;

import java.util.List;
import java.util.Map;

import BaseLayer.BaseClass;
import PageLayer.HomePage_Contact;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;
public class HomePageContactTest extends BaseClass {
private HomePage_Contact homec;
	@Given("user is on Contact page")
	public void user_is_on_contact_page() {
	   
		homec=new HomePage_Contact();
		homec.contactpage();
	}
	@When("use try to create Contact details")
	public void use_try_to_create_contact_details() {
		homec.clickOnEditButton();
	}
	@When("Enter {string} and {string} and {string}")
	public void enter_and_and(String Fname, String Lname, String CompanyName1) {
		homec.enterFname(Fname);
		homec.enterLname(Lname);
		homec.entercompanyName(CompanyName1);
	}
	@When("Enter correct Status and socialChannel")
	public void enter_correct_status_and_social_channel() {
		homec.clickStatus();
		homec.selectsocial();
	}
	@When("click on do not call and do not Text")
	public void click_on_do_not_call_and_do_not_text() {
		homec.donotcall();
		homec.donottext();
	}
	@When("Enter Date of Birth")
	public void enter_date_of_birth(DataTable dataTable) {
		List<Map<String,String>>ls=dataTable.asMaps();
		for(int i=0;i<ls.size();i++)
		{
		homec.enterday_DOI(ls.get(i).get("day"));
		homec.enteryear_DOI(ls.get(i).get("year"));
		}
		homec.entermonth_DOI();
	}
	@When("Click on save button")
	public void click_on_save_button() {
	   homec.savbutton();
		
	}


	
}
