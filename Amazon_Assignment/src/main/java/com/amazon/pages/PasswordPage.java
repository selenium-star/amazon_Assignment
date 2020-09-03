package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.genericLibraries.BaseTest;

public class PasswordPage extends BaseTest {
	@FindBy(id="ap_password") private WebElement password;
	public WebElement getPassword() {
		return password;
	}
	public void typePassword(String passwordForSignin) {
		password.sendKeys(passwordForSignin);
	}
	
	@FindBy(id="signInSubmit") private WebElement signIn;
	public WebElement getSignIn() {
		return signIn;
	}
	public void clickSignIn() {
		signIn.click();
	}
	
	public PasswordPage() {
		PageFactory.initElements(driver, this);
	}
}
