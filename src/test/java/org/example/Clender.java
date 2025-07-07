package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Year;
import java.util.List;

public class Clender {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//span[text()='03 Jul, 2025']")).click();
       String MonthandYear= "September 2030";
       String Date = "30";

       while (true) {

           String currentMY = driver.findElement(By.xpath("//p[contains(@class,'monthYear')]")).getText();
           if(currentMY.equals(MonthandYear)) {
               break;

           }
           driver.findElement(By.xpath("//div[contains(@class,'mainDatesWrap')]//i[contains(@class,'right')]")).click();
       }

       List<WebElement> data = driver.findElements(By.xpath("//ul[contains(@class,'datesWrap')]/li/child::div/descendant::div/span"));
       for(WebElement dat:data) {

           if(dat.getText().equals(Date)) {

               dat.click();
               break;
           }
       }












    }
}
