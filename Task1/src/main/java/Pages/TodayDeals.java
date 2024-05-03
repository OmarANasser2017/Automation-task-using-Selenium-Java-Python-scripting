package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TodayDeals {

    private WebDriver driver;

    public TodayDeals(WebDriver driver) {
        this.driver = driver;
    }

    By todayclick = By.xpath("//a[@href=\"/-/en/deals?ref_=nav_cs_gb\"]");

    By SelectingGrocery = By.xpath("//span[@aria-label=\"Departments filter\"]//label//input[@data-csa-c-element-id=\"filter-department-18020637031\"]");

    By SelectingElectonics = By.xpath("//span[@aria-label=\"Departments filter\"]//label//input[@data-csa-c-element-id=\"filter-department-18018102031\"]");

    By Discount = By.xpath("//span[@aria-label=\"Discount filter\"]//a[@data-csa-c-element-id=\"filter-discount-10-\"]");

    public void Shopping() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70));


        WebElement T = wait.until(ExpectedConditions.visibilityOfElementLocated(todayclick));
        T.click();


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");



        WebElement G = wait.until(ExpectedConditions.visibilityOfElementLocated(SelectingGrocery));
        G.click();


        WebElement E = wait.until(ExpectedConditions.visibilityOfElementLocated(SelectingElectonics));
        E.click();


        js.executeScript("window.scrollBy(0, 600)");


        WebElement D = wait.until(ExpectedConditions.visibilityOfElementLocated(Discount));
        D.click();

        js.executeScript("window.scrollBy(0, 15000)");


    }






}
