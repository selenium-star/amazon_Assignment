package com.amazon.addToCart;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.amazon.genericLibraries.BaseTest;
import com.amazon.genericLibraries.FileLibrary;
import com.amazon.genericLibraries.WebDriverCommonLibraries;
import com.amazon.pages.AfterClickingOnNext;
import com.amazon.pages.HomePage;
import com.amazon.pages.SearchResultsPage;


@Listeners(com.amazon.genericLibraries.MyListener.class)
public class SelectingLowestPriceBook extends BaseTest{
	@Test
	public void addingProduct() throws IOException, InterruptedException {
		HomePage homePage = new HomePage();
		FileLibrary flib = new FileLibrary();
		WebDriverCommonLibraries wlib = new WebDriverCommonLibraries();
		wlib.waitForPageTitle(flib.getPropKeyValue(PROPERTY_PATH, "pageTitle"));
		wlib.verifyPage(wlib.getPageTitle(), flib.getPropKeyValue(PROPERTY_PATH, "pageTitle"), "Page Title");
		homePage.typeInSearchBox("Selenium Books");
		homePage.clickSubmitButton();
		Thread.sleep(4000);
		wlib.waitForPageTitle(flib.getPropKeyValue(PROPERTY_PATH, "searchResultsPagetitle"));
		wlib.verifyPage(wlib.getPageTitle(), flib.getPropKeyValue(PROPERTY_PATH, "searchResultsPagetitle"), "Search Page Title ");
		wlib.scrollDown();
		SearchResultsPage srp = new SearchResultsPage();
		srp.clickNextButton();
		Thread.sleep(4000);
		AfterClickingOnNext ac = new AfterClickingOnNext();
		Thread.sleep(4000);
		int minPrice = ac.selectMinimumPrice();
		System.out.println(minPrice);
		for(WebElement element : ac.getPriceList()) {
			String text=element.getText();
			if(text.equals(minPrice)) {
				System.out.println("clicking");
				driver.findElement(By.xpath("//span[.='3.']/ancestor::div[@class='sg-row']//h2")).click();
			} 
			else    
			{
				//System.out.println("else part clicking");
				driver.findElement(By.xpath("//span[.='3.']/ancestor::div[@class='sg-row']//h2")).click();
			}
		}
	}
}
		
		//Unable to buy the product because it is prompting to buy on amazon.in
		
		
		
		
		



