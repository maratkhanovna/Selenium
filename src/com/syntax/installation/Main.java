package com.syntax.installation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        //1. set a system property
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        //2. create an object of webdriver type and import
        WebDriver driver = new ChromeDriver();
        //3. navigate to any web application
        driver.get("https://www.google.com");
    }
}
