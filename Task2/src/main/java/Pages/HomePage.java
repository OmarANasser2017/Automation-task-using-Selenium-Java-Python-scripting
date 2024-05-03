package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By popularRoutesSection = By.xpath("//a[@onclick=\"populateSearch('1467469338690', 'Chikkamagaluru', '1467467616730', 'Bengaluru');\"]");
    By arrival = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]/a");
    By Search = By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button");


    public void chooseRoute() throws InterruptedException {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70)); // Adjust the timeout as needed

        WebElement Route =  wait.until(ExpectedConditions.visibilityOfElementLocated(popularRoutesSection));
        Route.click();


        WebElement date =  wait.until(ExpectedConditions.visibilityOfElementLocated(arrival));
        date.click();


        WebElement S =  wait.until(ExpectedConditions.visibilityOfElementLocated(Search));
        S.click();






    }


}
