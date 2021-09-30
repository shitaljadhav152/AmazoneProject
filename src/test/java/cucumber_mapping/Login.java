package cucumber_mapping;

import java.util.Hashtable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations;

public class Login 
{
	@Given("user open Browser as {string} and exe {string}")
	public void user_open_browser_as_and_exe(String bName, String exe)
	{
		Object input[]=new Object[2];
		input[0]=bName;
		input[1]=exe;
	SeleniumOperations.browserLaunch(input);
	
	}

	@Given("user open url as {string}")
	public void user_open_url_as(String url)
	{
		Object input[]=new Object[1];
		input[0]=url;
	    SeleniumOperations.openApplication(input);
	
	    
	}

	@When("user move to Element sign in")
	public void user_move_to_element_sign_in()
	{
		Object input[]=new Object[1];
		input[0]="//*[@id=\"nav-link-accountList\"]";
	    SeleniumOperations.moveToElement(input);
	}

	@When("user clicks on Sign in")
	public void user_clicks_on_sign_in()
	{
		Object input[]=new Object[1];
		input[0]="(//*[text()='Sign in'])";
	    SeleniumOperations.click(input);
	}

	@When("^user enters (.+) as a username$")
	public void user_enters_as_a_username(String mobNo) 
	{
		Object input[]=new Object[2];
		input[0]="//*[@id=\"ap_email\"]";
		input[1]=mobNo;
	Hashtable<String,Object>input_op =SeleniumOperations.sendkey(input); 
	HTMLReportGenerator.StepDetails(input_op.get("STATUS").toString(),"^user enters (.+) as a username$" ,input_op.get("MESSAGE").toString() );
	}
	
	@When("user clicks on continue")
	public void user_clicks_on_continue()
	{
		Object input[]=new Object[1];
		input[0]="(//*[@id=\"continue\"])[1]";
		Hashtable<String,Object>input_op =SeleniumOperations.click(input);
		HTMLReportGenerator.StepDetails(input_op.get("STATUS").toString(),"user clicks on continue" ,input_op.get("MESSAGE").toString() );
	}
	
	

	@When("^user enters (.+) as a password$")
	public void user_enters_as_a_password(String passW)
	{
		Object input[]=new Object[2];
		input[0]="//*[@name=\"password\"]";
		input[1]=passW;
		Hashtable<String,Object>input_op =SeleniumOperations.sendkey(input);
		HTMLReportGenerator.StepDetails(input_op.get("STATUS").toString(),"^user enters (.+) as a password$" ,input_op.get("MESSAGE").toString() );
	}
	@When("user clicks on a Sign in")
	public void user_clicks_on_a_sign_in()
    {
		Object input[]=new Object[1];
		input[0]="//*[@id=\"signInSubmit\"]";
		Hashtable<String,Object>input_op =SeleniumOperations.click(input);
		HTMLReportGenerator.StepDetails(input_op.get("STATUS").toString(),"user clicks on a Sign in" ,input_op.get("MESSAGE").toString() );
	    
	}

	@Then("validation for sign in with valid credentials")
	public void validation_for_sign_in_with_valid_credentials()
	{
		Object input[]=new Object[2];
		input[0]="Hello, Shital";
		input[1]= "//*[text()='Hello, Shital']";
		Hashtable<String,Object>input_op = SeleniumOperations.validation(input);
		HTMLReportGenerator.StepDetails(input_op.get("STATUS").toString(),"validation for sign in with valid credentials" ,input_op.get("MESSAGE").toString() );
	    
	}

	@Then("validation for sign in with invalid credentials")
	public void validation_for_sign_in_with_invalid_credentials() 
	{
		Object input[]=new Object[2];
		input[0]="Incorrect phone number";
		input[1]="//*[text()='Incorrect phone number']";
		Hashtable<String,Object>input_op =SeleniumOperations.validation(input);
		HTMLReportGenerator.StepDetails(input_op.get("STATUS").toString(),"validation for sign in with invalid credentials" ,input_op.get("MESSAGE").toString() );
	}

	@Then("validation for sign in with valid username and invalid password")
	public void validation_for_sign_in_with_valid_username_and_invalid_password() 
	{
		Object input[]=new Object[2];
		input[0]="There was a problem";
		input[1]="//*[text()='There was a problem']";
		Hashtable<String,Object>input_op = SeleniumOperations.validation(input);
		HTMLReportGenerator.StepDetails(input_op.get("STATUS").toString(),"validation for sign in with valid username and invalid password" ,input_op.get("MESSAGE").toString() );
	}

	@Then("validation for sign in with Invalid username and valid password")
	public void validation_for_sign_in_with_invalid_username_and_valid_password()
	{
		Object input[]=new Object[2];
		input[0]="Incorrect phone number";
		input[1]="//*[text()='Incorrect phone number']";
		Hashtable<String,Object>input_op =SeleniumOperations.validation(input);
		HTMLReportGenerator.StepDetails(input_op.get("STATUS").toString(),"validation for sign in with Invalid username and valid password" ,input_op.get("MESSAGE").toString() );
	}

	@Then("user close the browser")
	public void user_close_the_browser()
	{
		SeleniumOperations.close();
	    
	}

}
