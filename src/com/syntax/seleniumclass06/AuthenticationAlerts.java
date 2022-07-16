package com.syntax.seleniumclass06;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationAlerts {
    public static String url = "https://admin:admin@the-internet.herokuapp.com/basic_auth";
                            //username:password@ - we have to add it before url
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}
