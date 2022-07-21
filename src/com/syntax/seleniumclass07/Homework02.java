package com.syntax.seleniumclass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/*
navigate to http://www.uitestpractice.com/Students/Contact
click on the link
get text
print out in the console
 */
public class Homework02 {
    public static String url = "http://www.uitestpractice.com/Students/Contact";
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement ajaxLink = driver.findElement(By.linkText("This is a Ajax link"));
        ajaxLink.click();
        WebElement ajaxText = driver.findElement(By.xpath("//*[contains(text(), 'Selenium')]"));
        System.out.println(ajaxText.getText());

        driver.quit();
    }
}
