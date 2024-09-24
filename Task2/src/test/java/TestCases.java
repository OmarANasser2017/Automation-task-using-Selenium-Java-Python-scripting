import Pages.HomePage;
import Pages.PassengerDetailsPage;
import Pages.PaymentPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCases extends TestBase {

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


   @Test(priority = 0)
    public void firstpage() throws InterruptedException {
        Thread.sleep(3000);
        home =new HomePage(driver);

        home.chooseRoute();
       String expectedUrl = "https://ksrtc.in/search?fromCity=555%7CChikkamagaluru&toCity=368%7CBengaluru+&departDate=15-10-2024&mode=oneway&src=h&stationInFromCity=&stationInToCity=&IsSingleLady=0";
       String actualUrl = driver.getCurrentUrl();
       Assert.assertEquals(actualUrl, expectedUrl,"datapassed");
       System.out.println("Expected URL: " + expectedUrl);
       System.out.println("Actual URL: " + actualUrl);


    }
  @Test(priority = 1,dataProvider = "BookSeatDetails")
  public void Secondpage(String ph, String mail , String nammme ,String aaage) throws InterruptedException {


      Thread.sleep(3000);
      passenger=new PassengerDetailsPage(driver);
      passenger.setseat(ph, mail, nammme, aaage);

      String expectedUrl = "https://ksrtc.in/co/exp/e5d18b88460edea49540ca4a3e5c0b3a_73004285_1727204407";
      String actualUrl = driver.getCurrentUrl();
      Assert.assertEquals(actualUrl, expectedUrl,"can not login with this data");
      System.out.println("Expected URL: " + expectedUrl);
      System.out.println("Actual URL: " + actualUrl);



  }
  @Test(priority = 2)
  public void makepayment() throws InterruptedException {
        Thread.sleep(3000);
        pay =new PaymentPage(driver);

        pay.Submitting();
      String expectedUrl = "https://ksrtc.in/payment?s=eyJwYXJhbXMiOnsibmFtZSI6Ikthcm5hdGFrYSBTdGF0ZSBSb2FkIFRyYW5zcG9ydCBDb3Jwb3JhdGlvbiAtIEtTUlRDIiwib3JkZXJfaWQiOiJvcmRlcl9QMTZ4aWxrSW5wYllMdiIsImFtb3VudCI6NjM2MDAsImNhbGxiYWNrX3VybCI6Imh0dHBzOlwvXC9rc3J0Yy5pblwvcGF5bWVudFwvY2FsbGJhY2tcL3Jhem9ycGF5P29yZGVyX2lkPU9CNzMwMDQyODUiLCJpbWFnZSI6Imh0dHBzOlwvXC9zdGF0aWNhc3NldHNrc3J0Yy5pYW1nZHMuY29tXC9pbWFnZXNcL2tzcnRjLmluX2xvZ28xNS5wbmciLCJwcmVmaWxsX25hbWUiOiJNb2hhbWVkIiwicHJlZmlsbF9jb250YWN0IjoiNjc4OTEyNTk4NyIsInByZWZpbGxfZW1haWwiOiJtbzUxMkBnbWFpbC5jb20iLCJib29raW5nX29yZGVyX2lkIjoiT0I3MzAwNDI4NSJ9fQ==";
      String actualUrl = driver.getCurrentUrl();
      Assert.assertEquals(actualUrl, expectedUrl,"can not login with this data");
      System.out.println("Expected URL: " + expectedUrl);
      System.out.println("Actual URL: " + actualUrl);

    }


}
