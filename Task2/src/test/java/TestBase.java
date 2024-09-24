import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;


public class TestBase {

    public static WebDriver driver;


    @BeforeSuite()
    public void setDriver(){
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
    }

    @AfterSuite
    public void closeDriver(){
        driver.close();
    }
}