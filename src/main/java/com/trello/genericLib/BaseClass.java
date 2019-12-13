package com.trello.genericLib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

/**
 * 
 *
 */
public class BaseClass 

{
	public static WebDriver driver;
	@BeforeMethod
    public void launchBrowser(){
    	WebDriver  driver =  new ChromeDriver();
	driver.get("https://trello.com");
    	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.manage().window().maximize();
    }
	@AfterMethod
	public void closeBrowser(){
	    driver.close();
	}
}
