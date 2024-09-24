package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage extends PageBase{




    By CheckButton = By.className("checkbox");
    By ClickbButton = By.xpath("//div[@class=\"flex-all-c navswitchbtn\"]");



    By iframe = By.className("razorpay-checkout-frame");


    By Upibutton = By.xpath("(//div[@class=\"stack svelte-j1plw7 horizontal\"])[1]");
    By Mobile = By.xpath("//div[@class=\"vpa-title svelte-wbn63g\"]");

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    public void Submitting() throws InterruptedException {
         // Adjust the timeout as needed
        Thread.sleep(5000);

        click(CheckButton);
        click(ClickbButton);
        Thread.sleep(5000);
        WebElement element = driver.findElement(iframe);
        Thread.sleep(5000);
        driver.switchTo().frame(element);

       click(Upibutton);



    }


}
