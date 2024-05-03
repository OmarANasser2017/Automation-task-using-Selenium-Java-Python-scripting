
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import Pages.AmazonPage;
import Pages.CarAccessoriesPage;
import Pages.CartPage;

public class Scenario_1 {
    WebDriver driver;
     AmazonPage amazon;
     CarAccessoriesPage Car_acc;
     CartPage cart;



    @BeforeClass()
    public void setDriver(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.eg/");
    }

    @Test(priority = 0)
    public void SearchonWebsite() throws InterruptedException {
        Thread.sleep(3000);
        amazon =new AmazonPage(driver);
        amazon.search();

    }
    @Test(priority = 1)
    public void Additem() throws InterruptedException {
        Thread.sleep(3000);
        Car_acc =new CarAccessoriesPage(driver);
        Car_acc.Add();

    }
    @Test(priority = 2)
    public void Check() throws InterruptedException {
        Thread.sleep(3000);
        cart =new CartPage(driver);
        cart.Show();
    }



    @AfterClass
    public void closeDriver(){
        driver.close();
    }


}
