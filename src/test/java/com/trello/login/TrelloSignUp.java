package com.trello.login;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.trello.genericLib.BaseClass;
import com.trello.pageObjectRepo.SignUpPage;
import com.trello.pageObjectRepo.TrelloPage;

public class TrelloSignUp extends BaseClass {

	@Test
	public void SignUptest(){
		TrelloPage  tp =  PageFactory.initElements(driver, TrelloPage.class);
		SignUpPage signUp = PageFactory.initElements(driver, SignUpPage.class);
		tp.getSingUpBtn().click();
		//verify if the page is successfully re-directed
		signUp.SignUp();
		//Verify if the user is successfully signed up	
		
	}
}
