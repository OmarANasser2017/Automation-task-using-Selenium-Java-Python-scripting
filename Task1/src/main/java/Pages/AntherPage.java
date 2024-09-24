package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AntherPage extends PageBase {

    By Selectitem = By.xpath("(//span[@class=\"a-size-mini\"])[16]");

    public AntherPage(WebDriver driver) {
        super(driver);
    }


    public void Addanthoritem() throws InterruptedException {

        click(Selectitem);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");

    }

}
