package com.trello.login;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.trello.genericLib.BaseClass;
import com.trello.pageObjectRepo.LoginPage;
import com.trello.pageObjectRepo.TrelloPage;


public class TrelloLogin extends BaseClass {

	@Test
	public void TrelloLogin() {
		TrelloPage  tp =  PageFactory.initElements(driver, TrelloPage.class);
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		tp.clickLoginButton();
		lp.Login();
		
	}

}