package com.trello.pageObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trello.genericLib.BaseClass;

public class TrelloPage extends BaseClass {

	@FindBy(linkText = "Log In")
	private WebElement loginBtn;
	
	@FindBy(linkText = "Sign Up")
	private WebElement singUpBtn;

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getSingUpBtn() {
		return singUpBtn;
	}
	
	public void clickLoginButton(){
		TrelloPage  tp =  PageFactory.initElements(driver, TrelloPage.class);
		tp.getLoginBtn().click();
	}
	
	public void clickSignUpButton(){
		TrelloPage  tp =  PageFactory.initElements(driver, TrelloPage.class);
		tp.getLoginBtn().click();
	}
}
