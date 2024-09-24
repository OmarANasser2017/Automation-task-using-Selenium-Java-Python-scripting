package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CarAccessoriesPage extends PageBase{

    By Selecting = By.xpath("(//h2[@class=\"a-size-mini a-spacing-none a-color-base s-line-clamp-4\"])[1]");

    public CarAccessoriesPage(WebDriver driver) {
        super(driver);
    }


    public void Add() {


        click(Selecting);



    }
}
