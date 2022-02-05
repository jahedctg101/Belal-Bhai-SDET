package step_definitions1;

import base.Base;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmployeeLogInPage;
import pages.HomePage;
import pages.LandingPage;

public class EmpLogin_Functionality_Test extends Base{
	LandingPage landingPage = new LandingPage();
	EmployeeLogInPage empLoginPage = new EmployeeLogInPage();
	HomePage empHomePage = new HomePage();
	
	@Given("I am in Landing Page")
	public void i_am_in_Landing_Page() {
		landingPage.navigateURL();	    
	}

	@When("I click on Login")
	public void i_click_on_Login() {
		landingPage.clickOnLogInBtn();
	   
	}

	@Then("Verify the EmpLogin Page")
	public void verify_the_EmpLogin_Page() {
//	    assertEquals("Employee Login",empLoginPage.EmpLogInPageHeadingText());
//	    assertEquals("Login",empLoginPage.EmpLogInPageHeadingText());
		System.err.println(empLoginPage.EmpLogInPageHeadingText());
		System.err.println(empLoginPage.EmpLogInText());
		
	    
	} 

	@And("Enter valid User Id")
	public void enter_valid_User_Id() {
	    empLoginPage.EnterUserId();
	}

	@And("Enter valid Password")
	public void enter_valid_Password() {
	    empLoginPage.EnterPassword();
	}

	@And("Click on Login Button")
	public void click_on_Login_Button() {
	    empLoginPage.ClickOnLogInBtn();
	}

	@Then("Verify Employee Homepage")
	public void verify_Employee_Homepage() {
	    assertEquals("Welcome Test", empHomePage.HomePageHeading());
	}
}
