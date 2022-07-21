package com.syntax.seleniumclass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/*
Go to https://demoqa.com/browser-windows
click on New Tab and print the text from new tab in the console
click on New Window and print the text from new window in the console
click on New Window Message and print the text from new window in the console
Verify (compare) the titles for each page
Print out the title of the all pages
 */
public class Homework01 {
    public static String url = "https://demoqa.com/browser-windows";
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        //driver.manage().window().maximize();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String mainPage = driver.getWindowHandle();
        WebElement newTab = driver.findElement(By.id("tabButton"));
        WebElement windowButton = driver.findElement(By.id("windowButton"));
        WebElement windowMessage = driver.findElement(By.id("messageWindowButton"));

        newTab.click();
        windowButton.click();
        windowMessage.click();

        Set<String> allTabs = driver.getWindowHandles();
        Iterator<String> iterator = allTabs.iterator();
        while (iterator.hasNext()){
            String handle = iterator.next();
            if(!mainPage.equals(handle)) {
                driver.switchTo().window(handle);
                WebElement text = driver.findElement(By.tagName("body"));
                System.out.println(text.getText());
                String title = driver.getTitle();
                if(title.isEmpty()){
                    System.out.println("No title");
                }else {
                    System.out.println(title);
                }
            }
        }
    }
}
