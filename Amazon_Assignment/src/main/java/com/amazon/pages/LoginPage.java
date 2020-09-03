package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.genericLibraries.BaseTest;

public class LoginPage extends BaseTest {
	@FindBy(id="ap_email") private WebElement email;
	public WebElement getEmail() {
		return email;
	}
	public void typeEmail(String emailId) {
		email.sendKeys(emailId);
	}
	
	@FindBy(id="continue") private WebElement continueButton;
	public WebElement getContinueButton() {
		return continueButton;
	}
	public void clickcontinueButton() {
		continueButton.click();
	}
	
	public LoginPage () {
		PageFactory.initElements(driver, this);
	}

}
