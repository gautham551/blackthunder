package com.trello.genericLib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

import org.openqa.selenium.OutputType;

public class WebdriverCommonLib {
	FileInputStream fis;

	public int randomNum() {
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		return randomNumber;
	}

	public String getCommonData(String key) throws Throwable {
		fis = new FileInputStream("/trello/FileData/commonData.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		String data = pObj.getProperty(key);
		return data;

	}
}
