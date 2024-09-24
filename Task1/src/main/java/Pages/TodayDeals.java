package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TodayDeals extends PageBase{


    By todayclick = By.xpath("//a[@href=\"/-/en/deals?ref_=nav_cs_gb\"]");

    By Discount = By.xpath("(//i[@class=\"a-icon a-icon-radio\"])[18]");

    By seemore = By.xpath("//a[@aria-labelledby=\"see-more-departments-label\"]");

    By SelectingGrocery = By.xpath("(//i[@class=\"a-icon a-icon-radio\"])[11]");

    public TodayDeals(WebDriver driver) {
        super(driver);
    }

    //By SelectingElectonics = By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/div/span[7]/div/label/i");



    public void Shopping() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        click(todayclick);
        js.executeScript("window.scrollBy(0, 10000)");
        click(Discount);
        click(seemore);
        click(SelectingGrocery);



    }






}
