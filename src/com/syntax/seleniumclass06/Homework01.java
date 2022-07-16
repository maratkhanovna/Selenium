package com.syntax.seleniumclass06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework01 {
    /*
    Navigate to https://syntaxprojects.com/bootstrap-iframe.php
    verify the header text Sorry, We Couldn't Find Anything For "Asksn" is displayed
    verify enroll today button is enabled
     */
    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement header = driver.findElement(By.xpath("//h1[contains(text(),'Sorry')]"));

        String headerText = header.getText();
        String expectedHeader = "Sorry, We Couldn't Find Anything For “Asksn”";
        if (header.isDisplayed() && headerText.equals(expectedHeader)){
            System.out.println("Header is displayed and verified");
        }
        driver.switchTo().defaultContent();

        driver.switchTo().frame(1);
        WebElement enrollButton = driver.findElement(By.linkText("Enroll today"));
        boolean enabled = enrollButton.isEnabled();
        System.out.println("is enroll today button is enabled : "+enabled);

    }
}
