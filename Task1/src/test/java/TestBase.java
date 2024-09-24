import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;


public class TestBase {

    public static WebDriver driver;


    @BeforeSuite()
    public void setDriver(){
        driver=new EdgeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.get("https://www.amazon.eg/");
    }

    @AfterSuite
    public void closeDriver(){
        driver.close();
    }
}