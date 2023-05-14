package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class BuyTheBook {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"adbl-confirm-cash-purchase-button-voltron\"]/button")
    WebElement button;


    public BuyTheBook(WebDriver driver){
        this.driver=driver;
    }

    public void clicktoBuy() throws InterruptedException {

        Thread.sleep(2000);
        button.click();


    }
}


