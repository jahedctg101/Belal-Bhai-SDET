package pages;

import org.openqa.selenium.By;

import base.Base;

public class EmployeeLogInPage extends Base {
	
	By EmpLogInPageHeadingText = By.xpath("//h1[text()='Employee Login '] ");
	By UserId = By.name("mailuid");
	By Password = By.name("pwd");
	By ClickOnLogInBtn = By.name("login-submit");
	By EmpLogInPageText = By.name("login-submit");
	
	public String EmpLogInPageHeadingText() {
//		return browser.findElement(EmpLogInPageHeadingText).getText();
		String Ltext=browser.findElement(EmpLogInPageHeadingText).getAttribute("value");
		return Ltext;
	}
	
//	public String LoginText() {
//		browser.findElement(EmpLogInPageHeadingText).getAttribute(null)
//	}
	
	public void EnterUserId(){
		browser.findElement(UserId).sendKeys("testpilot@gmail.com");
	}
	
	public void EnterPassword() {
		browser.findElement(Password).sendKeys("1234");
	}
	
	public void ClickOnLogInBtn() {
		browser.findElement(ClickOnLogInBtn).click();
	}
	
	public String EmpLogInText() {
		return browser.findElement(EmpLogInPageText).getAttribute("name");
	}
	

}
