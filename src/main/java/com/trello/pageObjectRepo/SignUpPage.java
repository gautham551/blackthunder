package com.trello.pageObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.trello.genericLib.BaseClass;
import com.trello.genericLib.WebdriverCommonLib;

public class SignUpPage extends BaseClass{
	WebdriverCommonLib comm = new WebdriverCommonLib();
	@FindBy(id = "email")
	private WebElement enterEmailforSignUpTxt;
	
	@FindBy(id = "password")
	private WebElement enterNewPasswordTxt;
	
	@FindBy(id = "displayName")
	private WebElement displayNameTxt;
	
	@FindBy(id = "Sign up")
	private WebElement SignUpBtn;
	
	
	
	public WebElement getEnterEmailforSignUpTxt() {
		return enterEmailforSignUpTxt;
	}



	public WebElement getEnterNewPasswordTxt() {
		return enterNewPasswordTxt;
	}



	public WebElement getDisplayNameTxt() {
		return displayNameTxt;
	}



	public WebElement getSignUpBtn() {
		return SignUpBtn;
	}

/**
 * this method is used to sign up for a new user
 */

	public void SignUp(){
		int num = comm.randomNum();
		String enteredEmail = "raju_gautham@hotmail.com";
		SignUpPage signUp = PageFactory.initElements(driver, SignUpPage.class);
		signUp.getEnterEmailforSignUpTxt().sendKeys(enteredEmail);
		String actTitle = driver.getTitle();
		String exptitle = "Sign up to Trello";
		//Assertion for title -this must be done for every page 
		Assert.assertEquals(actTitle, exptitle);
		//reporting the value
		Reporter.log(actTitle +"is matching"+ exptitle);
		signUp.getSignUpBtn().click();
		signUp.getDisplayNameTxt().sendKeys("Gautham raju"+num);
		signUp.getEnterNewPasswordTxt().sendKeys("Newpassword123*");
		signUp.getSignUpBtn().click();
			
	}
}
