package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragandDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/p/gui-elements-ajax-hidden.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement scr = driver.findElement(By.xpath("//h2[text()='Drag and Drop']"));
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("arguments[0].scrollIntoView();", scr);
        WebElement drp1 = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
        WebElement drp2 = driver.findElement(By.xpath("//p[text()='Drop here']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drp1,drp2).perform();
        Thread.sleep(3000);

        // Optional: verify result
        System.out.println("Dropped text: " +drp2.getText());



    }
}
