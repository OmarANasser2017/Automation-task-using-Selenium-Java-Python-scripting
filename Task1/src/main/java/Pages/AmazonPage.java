package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonPage {
    private WebDriver driver;

    public AmazonPage(WebDriver driver) {
        this.driver = driver;
    }

    By Searching = By.id("twotabsearchtextbox");
    By Cliking = By.id("nav-search-submit-button");


    public void search() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));


        WebElement S = wait.until(ExpectedConditions.visibilityOfElementLocated(Searching));
        S.sendKeys("car accessories");

        WebElement C = wait.until(ExpectedConditions.visibilityOfElementLocated(Cliking));
        C.click();



    }
}