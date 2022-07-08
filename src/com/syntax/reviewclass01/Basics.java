package com.syntax.reviewclass01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basics {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com/index.php");
        WebElement start = driver.findElement(By.linkText("Start Practising"));
        start.click();
        Thread.sleep(2000);
        WebElement next = driver.findElement(By.partialLinkText("Proceed"));
        next.click();
    }
}
