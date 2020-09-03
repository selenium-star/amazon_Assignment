package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amazon.genericLibraries.BaseTest;

public class ProductPage extends BaseTest{
	@FindBy(xpath="//input[@id='checkout-button']") private WebElement buyNow;
	public WebElement getBuyNow() {
		return buyNow;
	}
	public void clickOnButton() {
		buyNow.click();
	}
	
	public ProductPage() {
		PageFactory.initElements(driver, this);
	}

}
