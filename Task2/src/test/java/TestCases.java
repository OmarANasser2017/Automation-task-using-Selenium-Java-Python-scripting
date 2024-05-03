import Pages.HomePage;
import Pages.PassengerDetailsPage;
import Pages.PaymentPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;


public class TestCases {
    WebDriver driver;
    HomePage home;
    PassengerDetailsPage passenger;
    PaymentPage pay;
    @DataProvider(name = "BookSeatDetails")
    public Object[][] getdata(){
        Object[][] data={
                {"6789125987","mo512@gmail.com","Mohamed","20"}


        };
        return data;
    }

    @BeforeClass()
    public void setDriver(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
    }

   @Test(priority = 0)
    public void firstpage() throws InterruptedException {
        Thread.sleep(3000);
        home =new HomePage(driver);

        home.chooseRoute();

    }
  @Test(priority = 1,dataProvider = "BookSeatDetails")
  public void Secondpage(String ph, String mail , String nammme ,String aaage) throws InterruptedException {


      Thread.sleep(3000);
      passenger=new PassengerDetailsPage(driver);
      passenger.setseat(ph, mail, nammme, aaage);



  }
    @Test(priority = 2)
    public void makepayment() throws InterruptedException {
        Thread.sleep(3000);
        pay =new PaymentPage(driver);

        pay.Submitting();

    }




    @AfterClass
    public void closeDriver(){
        driver.close();
    }

}
