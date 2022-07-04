package com.syntax.seleniumclass01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();//launch the browser
        driver.get("https://www.amazon.com");
        String url = driver.getCurrentUrl();
        String title = driver.getTitle();
        System.out.println(title+" "+url);
        driver.quit();
    }
}
