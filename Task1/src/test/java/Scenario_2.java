import Pages.AmazonPage;
import Pages.AntherPage;
import Pages.LanguagePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.TodayDeals;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scenario_2 {

    WebDriver driver;
    TodayDeals todaydeal;
    LanguagePage Engpage;
    AntherPage Ann;

    @BeforeClass()
    public void setDriver(){

        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.eg/");
    }

    @Test(priority = 0)
    public void TransferLanguage() throws InterruptedException {
        Thread.sleep(3000);
        Engpage =new LanguagePage(driver);
        Engpage.Transfer();

    }


    @Test(priority = 1)
    public void SearchonWebsite() throws InterruptedException {
        Thread.sleep(3000);
        todaydeal = new TodayDeals(driver);
        todaydeal.Shopping();
    }

    @Test(priority = 2)
    public void ToAnthorPage() throws InterruptedException {
        Thread.sleep(3000);
        Ann =new AntherPage(driver);
        Ann.Addanthoritem();


    }


    @AfterClass
    public void closeDriver() {
        driver.close();
    }
}
