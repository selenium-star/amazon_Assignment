package com.amazon.genericLibraries;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.amazon.pages.SearchResultsPage;

public class WebDriverCommonLibraries extends BaseTest {
	 public String getPageTitle() {
	        String title = driver.getTitle();
	        return title;
	    }

	    public void verifyPage(String actualPage, String expectedPage, String pageName) {
	        Assert.assertEquals(actualPage, expectedPage);
	        Reporter.log(pageName + " is displayed", true);
	    }

	    public void waitForPageTitle(String title) {
	        WebDriverWait w = new WebDriverWait(driver, 20);
	        w.until(ExpectedConditions.titleIs(title));
	    }
	    
	    public void scrollDown() throws InterruptedException {
	    	SearchResultsPage resultsPageObject = new SearchResultsPage();
	    	WebElement element = resultsPageObject.getNextButton();
	    	Point location = element.getLocation();
	    	Thread.sleep(2000);
	    	JavascriptExecutor jseObject = (JavascriptExecutor)driver;
	    	jseObject.executeScript("window.scrollBy" + location);
	    }


}
