package com.trello.pageObjectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.trello.genericLib.BaseClass;
import com.trello.genericLib.WebdriverCommonLib;

public class LoginPage extends BaseClass {
	WebdriverCommonLib comm = new WebdriverCommonLib();

	@FindBy(id = "user")
	private WebElement enterEmailTxt;

	@FindBy(id = "password")
	private WebElement enterPasswordTxt;

	@FindBy(id = "login")
	private WebElement loginBtn;

	public WebElement getEnterEmailTxt() {
		return enterEmailTxt;
	}

	public WebElement getEnterPasswordTxt() {
		return enterPasswordTxt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public void Login() {
		int num = comm.randomNum();
		LoginPage login = PageFactory.initElements(driver, LoginPage.class);
		login.getEnterEmailTxt().sendKeys("gautham_raju"+num);
		login.getEnterPasswordTxt().sendKeys("Newpassword123*");
		login.getLoginBtn().click();

	}

}
