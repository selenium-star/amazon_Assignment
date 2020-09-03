package com.amazon.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import com.amazon.genericLibraries.BaseTest;

public class AfterClickingOnNext extends BaseTest {
	@FindBy(xpath="//span[@class='a-price-whole']") private List<WebElement> webElements;
	public List<WebElement> getPriceList() {
		return webElements;
	}
	public int selectMinimumPrice() {
		List<Integer> priceList = new ArrayList<Integer>();
		for(WebElement webElement : webElements) {
			int priceFromElement = Integer.parseInt(webElement.getText());
			if (priceFromElement > 0) {
				priceList.add(Integer.parseInt(webElement.getText()));
			} else {
				System.out.println("Ignoring price of value zero");
			}
		}
		Collections.sort(priceList);
		System.out.println("Least price priceList " + priceList.get(0));
		Integer minimumPricedBook = priceList.get(0);
		return minimumPricedBook;
		
	}
  public AfterClickingOnNext() {
	  PageFactory.initElements(driver, this);
  }

}
