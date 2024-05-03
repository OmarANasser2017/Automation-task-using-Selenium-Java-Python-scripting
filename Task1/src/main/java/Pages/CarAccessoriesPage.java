package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CarAccessoriesPage {

    private WebDriver driver;

    public CarAccessoriesPage(WebDriver driver) {
        this.driver = driver;
    }

    By Selecting = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div[1]");
    By Adding = By.xpath("//*[@id=\"add-to-cart-button\"]");
    public void Add() {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));


        WebElement S = wait.until(ExpectedConditions.visibilityOfElementLocated(Selecting));
        S.click();

        WebElement A = wait.until(ExpectedConditions.visibilityOfElementLocated(Adding));
        A.click();


    }
}
