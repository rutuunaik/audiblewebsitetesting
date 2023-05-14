package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectingBook {

    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"product-carousel-image-c8-i1\"]")
    WebElement book;

    public  SelectingBook(WebDriver driver){
        this.driver=driver;
    }

    public  void selectItem() throws InterruptedException {
        book.click();
        Thread.sleep(3000);
    }

}