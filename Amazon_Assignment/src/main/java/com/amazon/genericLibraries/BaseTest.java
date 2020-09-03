package com.amazon.genericLibraries;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoConstants {
	public static WebDriver driver;
    @BeforeClass
    public void openBrowser() throws IOException {
        FileLibrary flib = new FileLibrary();
        String browserValue = flib.getPropKeyValue(PROPERTY_PATH, "browser");
        if (browserValue.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\5570\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            System.out.println("Enter correct browser name");
        }
        driver.manage().window().maximize();
        String appUrl = flib.getPropKeyValue(PROPERTY_PATH, "url");
        driver.get(appUrl);
        driver.manage().deleteAllCookies();
    }

    @AfterClass
    public void closeBrowser() {
       
    	//driver.quit();
    }


}
