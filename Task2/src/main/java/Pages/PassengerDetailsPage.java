package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PassengerDetailsPage extends PageBase{




    By SButton = By.xpath("(//div[@class=\"selectbutton\"])[1]");
    By SSeat = By.xpath("(//div[@class=\"seatlook\"])[7]");
    By Bpoint = By.xpath("//div[@class=\"pick--val\"]");
    By selectdpoint = By.xpath("//div[@class=\"picklabel\"][text()=\"Select Dropping Point\"]");
    By Dpoint = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/div[2]/div[1]/div[2]/div[2]/div[2]/div[3]/div");
    By passDetails = By.xpath("//div[@class=\"btnPassDetails\"]");



    By MNum = By.xpath("//input[@name=\"mobileNo\"]");
    By email = By.xpath("//input[@name=\"email\"]");
    By gotodetails = By.xpath("(//div[@class=\"navswitchbtn flex-all-c\"])[1]");


    By name = By.xpath("//input[@name=\"paxName[0]\"]");
    By gender = By.xpath("//input[@name=\"paxGender[0]\"]");
    By  chgender= By.xpath("(//div[@class=\"ddn\"])[1]");

    By age = By.xpath("//input[@name=\"paxAge[0]\"]");
    By conn = By.xpath("//input[@name=\"paxConcessionType[0]\"]");
    By Sconn = By.xpath("//div[@class=\"ddn\"]");
    By Click = By.xpath("(//div[@class=\"navswitchbtn flex-all-c\"])[2]");

    public PassengerDetailsPage(WebDriver driver) {
        super(driver);
    }

    public void setseat(String Phone,String mail,String myname,String myAge) throws InterruptedException {

        click(SButton);
        click(SSeat);


        //click on
        click(Bpoint);
        click(selectdpoint);
        click(Dpoint);
        click(passDetails);


        //customer Details
        sendKeys(MNum,Phone);
        sendKeys(email,mail);
        click(gotodetails);


        //passenger
        sendKeys(name,myname);
        click(gender);
        click(chgender);
        sendKeys(age,myAge);
        click(conn);
        click(Sconn);
        Thread.sleep(3000);
        click(Click);


    }


}
