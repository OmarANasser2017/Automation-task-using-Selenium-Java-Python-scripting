package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddToCart extends PageBase {

    By Addtocart = By.xpath("//input[@id=\"add-to-cart-button\"]");

    public AddToCart(WebDriver driver) {
        super(driver);
    }

    public void Add() {


       click(Addtocart);


    }
}
