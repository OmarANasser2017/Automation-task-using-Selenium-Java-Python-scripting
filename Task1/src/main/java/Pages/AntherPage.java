package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AntherPage {

    private WebDriver driver;

    public AntherPage(WebDriver driver) {
        this.driver = driver;
    }

    By SecondPage = By.xpath("//li[@aria-label=\"Page 2 of 2\"]//a");

    By Selectitem = By.xpath("//div[@aria-label=\"Deal: MOMAX Magnetic Phone Case for iPhone 14; Deal price: EGP2,288.70\"]//a");

    By Addtocart = By.xpath("//*[@id=\"add-to-cart-button\"]");



    public void Addanthoritem() throws InterruptedException {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));


        WebElement secondPageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(SecondPage));
        secondPageElement.click();



        WebElement Selectitemelement = wait.until(ExpectedConditions.visibilityOfElementLocated(Selectitem));
        Selectitemelement.click();



        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");


        WebElement Addtocartelement = wait.until(ExpectedConditions.visibilityOfElementLocated(Addtocart));
        Addtocartelement.click();




    }






}
