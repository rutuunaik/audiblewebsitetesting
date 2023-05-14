package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Browse {

    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"top-1\"]/div/div/div/header/div[2]/div[1]/nav/span/ul/li[3]/div/div[1]/a/span")
    WebElement browse;
    @FindBy(xpath = "//*[@id=\"navTop_pl2_popover\"]/div/div/div/div/div[1]/div[2]/span/ul/li[2]/a")
    WebElement selectG;


    public Browse(WebDriver driver){
        this.driver=driver;
    }

    public void selectBrowse()
    {
        browse.click();
        selectG.click();
    }
}