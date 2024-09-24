package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonPage extends PageBase{


    By Searching = By.xpath("//input[@id=\"twotabsearchtextbox\"]");
    By Cliking = By.id("nav-search-submit-button");

    public AmazonPage(WebDriver driver) {
        super(driver);
    }


    public void search(String search) {


        sendKeys(Searching,search);

        click(Cliking);



    }
}