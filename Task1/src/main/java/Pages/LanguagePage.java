package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LanguagePage {

    private WebDriver driver;

    public LanguagePage(WebDriver driver) {
        this.driver = driver;
    }

    By Lang = By.xpath("//span[@class=\"icp-nav-link-inner\"]");

    By Eng = By.xpath("//span[@id=\"icp-language-translation-hint\"]");

    By SaveButton = By.xpath("//span[@id=\"icp-save-button\"]");

    public void Transfer() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));


        WebElement L = wait.until(ExpectedConditions.visibilityOfElementLocated(Lang));
        L.click();

        WebElement E = wait.until(ExpectedConditions.visibilityOfElementLocated(Eng));
        E.click();

        WebElement S = wait.until(ExpectedConditions.visibilityOfElementLocated(SaveButton));
        S.click();



    }






}
