package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage {

    private WebDriver driver;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }

    By CheckButton = By.xpath("//*[@id=\"termsChk\"]");
    By ClickbButton = By.xpath("//*[@id=\"PgBtn\"]");


    By FirstButton = By.xpath("//div[@data-block=\"rzp.cluster\"]//div//button[1]");
    By ClickbuttonNum = By.xpath("//*[@id=\"upi-collect-list\"]/div/div");
    By WriteNUM = By.xpath("//*[@id=\"vpa-upi\"]");




    public void Submitting() throws InterruptedException {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70)); // Adjust the timeout as needed


        WebElement AcceptanceButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(CheckButton));
        AcceptanceButton.click();


        WebElement MakepaymentButton =  wait.until(ExpectedConditions.visibilityOfElementLocated(ClickbButton));
        WebElement SS = wait.until(ExpectedConditions.elementToBeClickable(MakepaymentButton));
        SS.click();
        System.out.println("passsssed");


       /*WebElement FirstPay =  wait.until(ExpectedConditions.visibilityOfElementLocated(FirstButton));
        FirstPay.click();


      WebElement MOBTap =  wait.until(ExpectedConditions.visibilityOfElementLocated(ClickbuttonNum));
      MOBTap.click();


      WebElement Enterupi =  wait.until(ExpectedConditions.visibilityOfElementLocated(WriteNUM));
      Enterupi.sendKeys("01287599325");*/


    }


}
