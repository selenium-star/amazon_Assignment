package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.genericLibraries.BaseTest;

public class SearchResultsPage extends BaseTest {
	
	@FindBy(xpath="//li[@class='a-last']") private WebElement nextButton;
	public WebElement getNextButton() {
		return nextButton;
	}
	public void clickNextButton() {
		nextButton.click();
	}
	
	public SearchResultsPage() {
		PageFactory.initElements(driver, this);
	}

}
