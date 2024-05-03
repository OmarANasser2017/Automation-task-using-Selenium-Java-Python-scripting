package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();


        driver.manage().window().maximize();
        driver.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
        WebElement popularRoutesSection = driver.findElement(By.xpath("//div[contains(@class, 'popular-routes')]//div[contains(text(), 'CHIKKAMAGALURU')]//following-sibling::div[contains(text(), 'BENGALURU')]\n"));
        popularRoutesSection.click();





    }
}