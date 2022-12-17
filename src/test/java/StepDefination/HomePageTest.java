package StepDefination;

import java.util.List;

import BaseLayer.BaseClass;
import io.cucumber.datatable.DataTable;
import PageLayer.Homepage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageTest extends BaseClass{
private Homepage home;
	@When("user click on company tab")
	public void user_click_on_company_tab() throws InterruptedException
	{
		 home=new Homepage();
		 home.companys();
	}
	@Then("click on Edit button and add employee")
	public void click_on_edit_button_and_add_employee()
	{
	   home.clickeditbutton();
	}
	@Then("enter Company {string}")
	public void enter_company(String name)
	{
	    home.CompanyName(name);
	}
	@Then("Add Adress details {string} , {string} , {string} , {string}")
	public void add_adress_details(String streatAddress, String city, String state, String postcode)
	{
	  home.adressstreat(streatAddress);
	  home.adresscity(city);
	  home.adressstate(state);
	  home.adresspostalcode(postcode);
	}
	@Then("select {string} country")
	public void select_country(String countryname)
	{
		home.sendCountrySelect(countryname);
		home.countryselect();
	}
	@Then("Add phone no details {string}")
	public void add_phone_no_details(String num)
	{
	   home.enterNumber(num);
	}
	
	@When("add discription number of employee")
	public void add_discription_number_of_employee(DataTable dataTable) 
	{
		List<List<String>>ls=dataTable.asLists();
		
		
		home.companyDiscription(ls.get(0).get(0));
	home.numemPloyees(ls.get(0).get(1));
	}
	@When("add stock symbol anualRevenue")
	public void add_stock_symbol_anual_revenue(DataTable dataTable) 
	{
		List<List<String>>ls=dataTable.asLists();
		
	home.symbolOfCompany(ls.get(0).get(0));
	home.revenue(ls.get(0).get(1));
	}
		
		@Then("click on save button")
	public void click_on_save_button() 
	{
	       home.save(); 
	}


	
}
