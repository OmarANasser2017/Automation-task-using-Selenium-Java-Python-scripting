package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.eg/");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement todayclick = driver.findElement(By.xpath("//a[@href=\"/-/en/deals?ref_=nav_cs_gb\"]"));
        todayclick.click();
        Thread.sleep(5000);
        WebElement SelectingGrocery = driver.findElement(By.xpath("//input[@type=\"checkbox\"and @ data-csa-c-id=\"yfqaek-uend3x-uq26f3-jrnmvd\"]"));

        if (!SelectingGrocery.isSelected()) {
            Thread.sleep(3000);
            SelectingGrocery.click();

        }





    }

}