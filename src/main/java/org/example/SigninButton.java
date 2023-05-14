package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SigninButton {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"top-1\"]/div/div/div/header/div[1]/span/nav/span/ul/li[2]/a")
    WebElement signinbtn;

    public SigninButton(WebDriver driver){
        this.driver=driver;

    }
    public void pressSigninbtn() throws InterruptedException {
        signinbtn.click();
        Thread.sleep(2000);
    }
}
