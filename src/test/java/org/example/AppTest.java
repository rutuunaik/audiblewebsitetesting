package org.example;
import com.driver.DriverClass;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class AppTest {


    WebDriver d = DriverClass.setUpBrowser("chrome", "https://www.audible.in/");

    //WebDriver d = DriverClass.setUpBrowser("chrome","https://www.audible.in/dppui/pay-select?c=audible&v=web&collectShippingAddress=true&ref=a_one_click_purchase_cash_voltron&inAppBrowser=false&transactionContext=oneTimePurchase&purchaseType=cash&useCash=true&asin=B0BKBPQZW4&displayedPrice=210&displayedPriceCurrency=INR");
    @Test(priority = 1)
    public void SigninButton() throws InterruptedException {

        SigninButton signin = PageFactory.initElements(d, SigninButton.class);
        signin.pressSigninbtn();
    }

    @Test(priority = 2)
    public void pressLogin() {
        EmptySignin log = PageFactory.initElements(d, EmptySignin.class);
        //log.pressloginbtn();
        try {
            log.pressloginbtn();
        } catch (Exception e) {
            System.out.println("Please Enter Credentials");
        }
    }

    @Test(priority = 3)
    public void InvalidCredentials() throws InterruptedException {

        InvalidCredentials invalid = PageFactory.initElements(d, InvalidCredentials.class);
        try {
            invalid.enterInvalidCredentials();
        } catch (Exception e) {
            System.out.println("Entered Wrong Details!!");
        }

    }

    @Test(priority = 4)
    public void clearDetails() throws InterruptedException {
        Clear clear = PageFactory.initElements(d, Clear.class);
        clear.clearFields();
    }

    @Test(priority = 5)
    public void ValidCredentials() throws InterruptedException {

        ValidCredentials valid = PageFactory.initElements(d, ValidCredentials.class);
        valid.enterValidCredential();
        try {
            valid.enterValidCredential();

        } catch (Exception e) {
            System.out.println("Entered Wrong Details!!");
        }
    }


    @Test(priority = 6)
    public void Browse() throws InterruptedException {

        Browse br = PageFactory.initElements(d, Browse.class);
        try {
            br.selectBrowse();
        } catch (Exception e) {
            System.out.println("Browse not selected");
        }
    }

    @Test(priority = 7)
    public void selectItem() {
        SelectingBook books = PageFactory.initElements(d, SelectingBook.class);
        try {
            books.selectItem();
        } catch (Exception e) {
            System.out.println("Not able to select the product");
        }
    }

    @Test(priority = 8)
    public void clicktoBuy() throws InterruptedException {
        BuyTheBook buy = PageFactory.initElements(d, BuyTheBook.class);
        buy.clicktoBuy();
    }

    @Test(priority = 9)
    public void placeYourOrder() throws InterruptedException {
        PlacingOrder place = PageFactory.initElements(d, PlacingOrder.class);
        place.placeYourOrder();

    }
    @AfterClass
    public void driverclode()
    {
        d.close();
    }
}
