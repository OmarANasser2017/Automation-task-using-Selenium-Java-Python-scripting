package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    private WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    By Showing = By.xpath("//*[@id=\"sw-gtc\"]/span/a");

    public void Show() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));


        WebElement S = wait.until(ExpectedConditions.visibilityOfElementLocated(Showing));
        S.click();


    }
}
