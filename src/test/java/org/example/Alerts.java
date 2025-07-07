package org.example;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // driver.findElement(By.id("alertBtn")).click();
        //Thread.sleep(5000);
        //simple alert
       /* Alert alert =driver.switchTo().alert();
        alert.accept();*/
        //confirm alert
//        WebElement scr = driver.findElement(By.xpath("Alerts & Popups"));
//        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
//        js1.executeScript("arguments[0].scrollIntoView();", scr);
        WebElement ele = driver.findElement(By.xpath("//button[text()='Confirmation Alert']"));
        ele.click();
        Thread.sleep(5000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();



    }
}
