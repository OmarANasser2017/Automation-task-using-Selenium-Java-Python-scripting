package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LanguagePage extends PageBase{


    By Lang = By.xpath("//span[@class=\"icp-nav-link-inner\"]");

    By Eng = By.xpath("//span[@id=\"icp-language-translation-hint\"]");

    By SaveButton = By.xpath("//span[@id=\"icp-save-button\"]");

    public LanguagePage(WebDriver driver) {
        super(driver);
    }

    public void Transfer() {

        click(Lang);
        click(Eng);
        click(SaveButton);


    }






}
