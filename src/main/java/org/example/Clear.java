package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Clear {
    WebDriver driver;
    @FindBy(xpath ="//*[@id=\"ap_email\"]" )
    WebElement clearUsername;
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    WebElement clearPassword;

    public Clear(WebDriver driver){
        this.driver=driver;

    }

    public void clearFields() throws InterruptedException {
        String us = Keys.chord(Keys.CONTROL, "a");
        clearUsername.sendKeys(us);
        clearUsername.sendKeys(Keys.DELETE);
        Thread.sleep(2000);

        String ps = Keys.chord(Keys.CONTROL, "a");
        clearPassword.sendKeys(ps);
        clearPassword.sendKeys(Keys.DELETE);
        Thread.sleep(2000);
    }
}
