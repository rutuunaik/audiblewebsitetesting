package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmptySignin {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    WebElement loginbtn;

    public EmptySignin(WebDriver driver){
        this.driver=driver;

    }

    public void pressloginbtn(){

        loginbtn.click();
    }
}
