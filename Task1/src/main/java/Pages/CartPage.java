package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage extends PageBase {



    By Gotocart = By.xpath("(//a[@class=\"a-button-text\"])[3]");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void Show() {

        click(Gotocart);


    }
}
