package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseoverActions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/?utm_source=google&utm_medium=cpc&utm_platform=paidads&utm_content=668803176719&utm_campaign=Search-Brand-APAC-Navigational&utm_campaigncode=Core+9198632&utm_term=e+browserstack&gad_source=1&gad_campaignid=20426403243&gbraid=0AAAAADD4yG0DFISyBUqjSHXXeXvdEhDcZ&gclid=Cj0KCQjw_8rBBhCFARIsAJrc9yCOJq9RHxU0dsdP18gORun_jUkRWYC0KSw85FkVYWjN7igJv4fPlwoaAq0gEALw_wcB");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement menu = driver.findElement(By.xpath("//button[contains(text(),'Products')]") );
        Actions actions = new Actions(driver);
        actions.moveToElement(menu).perform();
        Thread.sleep(5000);
        System.out.println(menu.getText());
        driver.quit();

    }
}
