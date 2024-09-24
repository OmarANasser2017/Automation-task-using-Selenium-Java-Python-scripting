
import Pages.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class Scenario_1 extends TestBase {

    String search ="car accessories";

     LanguagePage lang;
     AmazonPage amazon;
     CarAccessoriesPage Car_acc;
     CartPage cart;
     AddToCart add;

    @Test(priority = 0)
    public void transferlang() throws InterruptedException {
        Thread.sleep(3000);
        lang =new LanguagePage(driver);
        lang.Transfer();

        String expectedUrl = "https://www.amazon.eg/customer-preferences/edit?ie=UTF8&preferencesReturnUrl=%2F&ref_=topnav_lang";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl,"can not login with this data");
        System.out.println("Expected URL: " + expectedUrl);
        System.out.println("Actual URL: " + actualUrl);

    }


    @Test(priority = 1)
    public void SearchonWebsite() throws InterruptedException {
        Thread.sleep(3000);
        amazon =new AmazonPage(driver);
        amazon.search(search);

        String expectedUrl = "https://www.amazon.eg/s?k=car+accessories&ref=nb_sb_noss";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl,"passed");
        System.out.println("Expected URL: " + expectedUrl);
        System.out.println("Actual URL: " + actualUrl);

    }
    @Test(priority = 2)
    public void Additem() throws InterruptedException {
        Thread.sleep(3000);
        Car_acc =new CarAccessoriesPage(driver);
        Car_acc.Add();

        String expectedUrl = "https://www.amazon.eg/Car-Mat-PASSAT-Sedan-Variant/dp/B096DFH4HN/ref=sr_1_1_sspa?crid=1ECEBOIS20B1W&dib=eyJ2IjoiMSJ9.Dw0y5N0sXE1PjS4jfY-gGCtU1ll0VaHYLodyMb0sa0EEd47csbTXDb_E7ECIGqU6BNTQ6pwWXX0PNAk3I4ejD4op-K5g4upN7xAPNpEpY4ewx6kNEuvP-Dloim1cZlRbINyGS ";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl,"passed");
        System.out.println("Expected URL: " + expectedUrl);
        System.out.println("Actual URL: " + actualUrl);

    }
    @Test(priority = 3)
    public void Additemtocart() throws InterruptedException {
        Thread.sleep(3000);
        add =new AddToCart(driver);
        add.Add();

        String expectedUrl = "https://www.amazon.eg/cart/smart-wagon?newItems=516e3097-e8c2-474e-b7b5-074dcf801faf,1&ref_=sw_refresh";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl,"passed");
        System.out.println("Expected URL: " + expectedUrl);
        System.out.println("Actual URL: " + actualUrl);

    }
    @Test(priority = 4)
    public void Check() throws InterruptedException {
        Thread.sleep(3000);
        cart =new CartPage(driver);
        cart.Show();

        String expectedUrl = "https://www.amazon.eg/-/en/cart?ref_=sw_gtc";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl,"passed");
        System.out.println("Expected URL: " + expectedUrl);
        System.out.println("Actual URL: " + actualUrl);
    }




}
