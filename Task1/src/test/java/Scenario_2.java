import Pages.*;
import org.testng.annotations.Test;

public class Scenario_2 extends TestBase{


    TodayDeals todaydeal;
    LanguagePage Engpage;
    AntherPage Ann;
    AddToCart add;


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
    @Test(priority = 3)
    public void Addtocart() throws InterruptedException {
        Thread.sleep(3000);
        add =new AddToCart(driver);
        add.Add();


    }




}
