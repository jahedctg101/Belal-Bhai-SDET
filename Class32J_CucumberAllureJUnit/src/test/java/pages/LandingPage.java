package pages;

import org.openqa.selenium.By;

import base.Base;

public class LandingPage extends Base {
	
	By LoginBtn = By.xpath("//ul[@id='navli']//li[4]/a[text()='LOG IN']");
	
	public void navigateURL() {
		browser.get("https://sit.skyschooling.com/microtech");
	}
	public void clickOnLogInBtn() {
		
		browser.findElement(LoginBtn).click();
	}

}
