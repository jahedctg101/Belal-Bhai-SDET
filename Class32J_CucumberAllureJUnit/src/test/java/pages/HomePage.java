package pages;

import org.openqa.selenium.By;

import base.Base;

public class HomePage extends Base {
	
	By HomePageHeading = By.xpath("//div[@id='divimg']/div/h2[text()='Welcome Test ']");
	
	public String HomePageHeading() {
		return browser.findElement(HomePageHeading).getText();
	}

}
