package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PassengerDetailsPage{

    private WebDriver driver;

    public PassengerDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    By SButton = By.xpath("//div[@class=\"select-service\"]//input[@id=\"SrvcSelectBtnForward0\"]");
    By SSeat = By.xpath("//*[@id=\"Forward110\"]/span");
    By Bpoint = By.xpath("//*[@id=\"busSeatLayout\"]/div[1]/div/div");
    By Dpoint = By.xpath("//*[@id=\"Forwarddroping-tab\"]");
    By CDetails = By.xpath("//*[@id=\"Forwardprofile-tab\"]");
    By MNum = By.xpath("//*[@id=\"mobileNo\"]");
    By email = By.xpath("//*[@id=\"email\"]");
    By name = By.xpath("//*[@id=\"passengerNameForward0\"]");
    By gender = By.xpath("//*[@id=\"genderCodeIdForward0\"]");
    By chgender = By.xpath("//*[@id=\"genderCodeIdForward0\"]/option[2]");
    By age = By.xpath("//*[@id=\"passengerAgeForward0\"]");
    By conn = By.xpath("//*[@id=\"concessionIdsForward0\"]");
    By Sconn = By.xpath("//*[@id=\"concessionIdsForward0\"]/option[2]");


    public void setseat(String Phone,String mail,String myname,String myAge) throws InterruptedException {


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(70)); // Adjust the timeout as needed


        WebElement SelectseatButton = wait.until(ExpectedConditions.visibilityOfElementLocated(SButton));
        SelectseatButton.click();




        WebElement Selectseat =  wait.until(ExpectedConditions.visibilityOfElementLocated(SSeat));
        Selectseat.click();


        //click on

        WebElement BoardingPoint = wait.until(ExpectedConditions.visibilityOfElementLocated(Bpoint));
        BoardingPoint.click();


        WebElement DroppingPoint = wait.until(ExpectedConditions.visibilityOfElementLocated(Dpoint));
        DroppingPoint.click();


        //customer Details

        WebElement CustomerDetails =  wait.until(ExpectedConditions.visibilityOfElementLocated(CDetails));
        CustomerDetails.click();


        WebElement MobileNum =  wait.until(ExpectedConditions.visibilityOfElementLocated(MNum));
        MobileNum.sendKeys(Phone);


        WebElement Email =  wait.until(ExpectedConditions.visibilityOfElementLocated(email));
        Email.sendKeys(mail);


        //passenger
        WebElement Name =  wait.until(ExpectedConditions.visibilityOfElementLocated(name));
        Name.sendKeys(myname);


        WebElement Gender =  wait.until(ExpectedConditions.visibilityOfElementLocated(gender));
        Gender.click();


        WebElement ChooseGender =  wait.until(ExpectedConditions.visibilityOfElementLocated(chgender));
        ChooseGender.click();


        WebElement Age =  wait.until(ExpectedConditions.visibilityOfElementLocated(age));
        Age.sendKeys(myAge);


        WebElement Connsion =  wait.until(ExpectedConditions.visibilityOfElementLocated(conn));
        Connsion.click();


        WebElement SelectConnsion =  wait.until(ExpectedConditions.visibilityOfElementLocated(Sconn));
        SelectConnsion.click();
        Thread.sleep(5000);


      /*WebElement Name2 =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"passengerNameForward1\"]")));
      Name2.sendKeys("mohamed");


      WebElement Gender2 =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"genderCodeIdForward1\"]")));
      Gender2.click();


      WebElement ChooseGender2 =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"genderCodeIdForward1\"]/option[2]")));
      ChooseGender2.click();


      WebElement Age2 =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"passengerAgeForward1\"]")));
      Age2.sendKeys("20");


      WebElement Connsion2 =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"concessionIdsForward1\"]")));
      Connsion2.click();


      WebElement SelectConnsion2 =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"concessionIdsForward1\"]/option[2]")));
      SelectConnsion2.click();
      Thread.sleep(5000);*/

    }


}
