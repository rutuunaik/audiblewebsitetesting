/*
package org.example;

import org.OpenQASM.selenium.*;
import org.OpenQASM.selenium.support.FindBy;
import org.OpenQASM.selenium.support.ui.Select;

import java.util.ArrayList;

public class PlacingOrder {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"netbanking-form-label\"]/div[1]/div[1]/div/div/div/span/div/label/input")
    WebElement bankCheckbox;
    @FindBy(xpath = "//*[@id=\"netbanking-form-label\"]/div[1]/div[2]/div/div/span/span/span[1]/span/span[2]")
    WebElement Bname;
    @FindBy(xpath = "//*[@id=\"select2-netBankingDropDown-7i-result-bynl-HDF\"]")
    WebElement bankName;
    @FindBy(xpath = "//*[@id=\\\"place-order-button\\\"]\"")
    WebElement placeOrder;


    public PlacingOrder(WebDriver driver){
        this.driver=driver;
    }

    public void placeyourorder() {

        bankCheckbox.click();
        Bname.click();
//        WebElement element = driver.findElement((By) Bname);


//        Select select = new Select(element);
//        select.selectByValue("HDFC Bank");
        bankName.click();


        placeOrder.click();
    }
}

*/

package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class PlacingOrder {
    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"netbanking-form-label\"]/div[1]/div[1]/div/div/div/span/div/label/input")
    WebElement bankCheckbox;

    @FindBy(xpath = "//*[@id=\"netbanking-form-label\"]/div[1]/div[2]/div/div/span/span/span[1]/span/span[2]")
    WebElement bankDropdown;

//    @FindBy(id = "//span[@class='select2-results']/ul/li[1]/ul/li[2]/span")
//    WebElement Bank;
//    @FindBy(xpath = "//*[@id=\"select2-netBankingDropDown-an-result-apb7-SBI\"]")
//    WebElement bankOption;



    @FindBy(xpath = "//*[@id=\"place-order-button\"]")
    WebElement placeOrder;

    public PlacingOrder(WebDriver driver) {
        this.driver = driver;
    }

    public void placeYourOrder() throws InterruptedException {
        bankCheckbox.click();

        Thread.sleep(2000);
        bankDropdown.click();
        driver.findElement(By.xpath("//span[@class='select2-results']/ul/li[1]/ul/li[2]")).click();
        Thread.sleep(3000);

        placeOrder.click();
        Thread.sleep(3000);
    }

}
