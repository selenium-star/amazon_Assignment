package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.genericLibraries.BaseTest;

public class HomePage extends BaseTest {
	
	@FindBy(id="twotabsearchtextbox") private WebElement searchBox;
	public WebElement getsearchBox() {
		return searchBox;
	}
	public void typeInSearchBox(String productName) {
		searchBox.sendKeys(productName);
	}
	
	@FindBy(xpath="//input[@type='submit' and @class='nav-input']") private WebElement submitButton;
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public void clickSubmitButton() {
		submitButton.click();
	}
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

}
