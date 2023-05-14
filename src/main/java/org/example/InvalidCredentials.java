package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ResourceBundle;

public class InvalidCredentials {

    WebDriver driver;
    @FindBy(xpath ="//*[@id=\"ap_email\"]")
    WebElement username;

    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    WebElement button;

    public InvalidCredentials(WebDriver driver){

        this.driver=driver;

    }

    public void enterInvalidCredentials( ) throws InterruptedException {

        ResourceBundle invalid = ResourceBundle.getBundle("config");
        String user= invalid.getString("username_email");
        String pass = invalid.getString("user_password");
        username.sendKeys(user);
        Thread.sleep(2000);
        password.sendKeys(pass);
        Thread.sleep(2000);

        button.click();








    }
}



