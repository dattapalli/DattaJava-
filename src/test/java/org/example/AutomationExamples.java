package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class AutomationExamples {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        //implicity wait is global wait particular element ki wait chysthundhi
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //sendkeys()
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Test");
        //click()
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(5000);
        //Scrolldown
        WebElement scr = driver.findElement(By.xpath("//h2[text()='Slider']"));
        JavascriptExecutor js1 = ((JavascriptExecutor) driver);
        js1.executeScript("arguments[0].scrollIntoView();", scr);
        //Dropdown
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='country']"));
        Select select = new Select(dropdown);
        //select.selectByValue("canada");
         select.selectByIndex(3);
        // select.selectByVisibleText("Canada");
        // list of all dropdown elements  using for each loop
        List<WebElement> allOptions = select.getOptions();
        System.out.println(allOptions.size());
        for (WebElement option : allOptions)
        {
            System.out.println("Option: " + option.getText());
        }

















    }


}
