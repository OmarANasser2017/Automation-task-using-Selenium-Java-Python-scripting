package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class HomePage extends PageBase {



    private By Select1=By.xpath("//*[@id=\"fromCity_chosen\"]/div/ul/li[1]");
    private By Depature=By.xpath("//div[@class=\"search-from-city\"]/div/div/div[@class=\"input-bottom-box\"][1]");
    private By box1=By.xpath("//*[@id=\"fromCity_chosen\"]/div/div[1]/input");

    private By Select2=By.xpath("//*[@id=\"toCity_chosen\"]/div/ul/li[1]");
    private By Destination=By.xpath("//div[@class=\"search-to-city\"]/div/div/div[@class=\"input-bottom-box\"][1]");
    private By box2=By.xpath("//*[@id=\"toCity_chosen\"]/div/div[1]/input");

    By Select3 = By.xpath("//*[@id=\"imgDepartDate\"]");
    By arrival = By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[3]/a");
    By Search = By.xpath("//div[@id=\"submitSearch\"]");

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void chooseRoute() throws InterruptedException {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));


        click(Depature);
        Thread.sleep(3000);
        sendKeys(box1,"Chikkamagaluru");
        click(Select1);



        click(Destination);
        Thread.sleep(3000);
        sendKeys(box2,"Bengaluru");
        click(Select2);
        Thread.sleep(5000);

        click(Select3);
        click(arrival);
        click(Search);

    }



}
