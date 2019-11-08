package com.volvo.gloria.createMaterialRequestTest;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddBestSellersToCart {
    WebDriver driver;

    public void wait(ExpectedCondition<WebElement> element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable((By) element));

    }

    @Test
    public void adc() throws Throwable {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.amazon.com");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        String X = "//span[text()='Best Seller']/ancestor::div[@class='sg-row']/following-sibling::div[@class='sg-row']/div[2]/div/div/div/div/div/h2/a/span";
        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
        searchBox.click();
        searchBox.sendKeys("Headphones" + Keys.ENTER);
        Actions action = new Actions(driver);
        List<WebElement> bestSellers = driver.findElements(By.xpath(X));
        for (WebElement wb : bestSellers) {
            
            try {
                wait.until(ExpectedConditions.elementToBeClickable(wb)).click();
                driver.navigate().back();
                
            } catch (StaleElementReferenceException e) {
                bestSellers= driver.findElements(By.xpath(X));
                wait.until(ExpectedConditions.elementToBeClickable(bestSellers.get(1))).click();
                driver.navigate().back();
            }
           
           
           
            
        }
      
        /*
         * for (int i = 1; i <= bestSellers.size(); i++) { action.moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
         * "//span[text()='Best Seller']/ancestor::div[@class='sg-row']/following-sibling::div[@class='sg-row']/child::div['" + i + "']")))) .build().perform();
         * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(
         * "//span[text()='Best Seller']/ancestor::div[@class='sg-row']/following-sibling::div[@class='sg-row']/child::div['" + i + "']"))) .click();
         * wait.until(ExpectedConditions.elementToBeClickable(By.id("add-to-cart-button"))).click(); //
         * System.err.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Added to Cart')]"))).getText());
         * wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.uss-o-close-icon.uss-o-close-icon-medium"))).click();
         * driver.navigate().back(); driver.navigate().refresh(); System.err.println("try to find next best seller item ");
         */

    }
}
