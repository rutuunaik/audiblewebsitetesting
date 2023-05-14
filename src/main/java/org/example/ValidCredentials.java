package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ResourceBundle;

public class ValidCredentials {

    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    WebElement username;
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"signInSubmit\"]")
    WebElement button;
    public ValidCredentials(WebDriver driver){
        this.driver=driver;
    }

    public void enterValidCredential() throws InterruptedException {

        ResourceBundle creden = ResourceBundle.getBundle("config");
        String user= creden.getString("username_email_1");
        String pass = creden.getString("user_password_1");

        //ruturajpnaik.9806@gmail.com
        //Rutu@1234
        username.sendKeys(user);
        Thread.sleep(2000);
        password.sendKeys(pass);
        Thread.sleep(10000);
        button.click();

    }
}
