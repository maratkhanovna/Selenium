package com.syntax.seleniumclass06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework02 {
    /*
    Go to https://syntaxprojects.com/javascript-alert-box-demo.php
    click on each button and handle the alert accordingly
     */
    public static String url = "https://syntaxprojects.com/javascript-alert-box-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement alertButton = driver.findElement(By.xpath("//button[@onclick = 'myAlertFunction()']"));
        alertButton.click();
        Thread.sleep(2000);
        Alert simple = driver.switchTo().alert();
        simple.accept();

        WebElement confirmButton = driver.findElement(By.xpath("//button[@onclick = 'myConfirmFunction()']"));
        confirmButton.click();
        Thread.sleep(2000);
        Alert confirm = driver.switchTo().alert();
        confirm.dismiss();

        WebElement promptButton = driver.findElement(By.xpath("//button[@onclick = 'myPromptFunction()']"));
        promptButton.click();
        Thread.sleep(2000);
        Alert prompt = driver.switchTo().alert();
        prompt.sendKeys("Gaukhar");
        prompt.accept();
    }
}
