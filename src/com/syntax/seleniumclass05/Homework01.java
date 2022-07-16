package com.syntax.seleniumclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Homework01 {
    public static String url = "https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        WebElement newAccButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
        newAccButton.click();
        Thread.sleep(2000);

        WebElement monthDD = driver.findElement(By.id("month"));
        Select select = new Select(monthDD);
        List<WebElement> allMonth = select.getOptions();
        int sizeMonth = allMonth.size();
        System.out.println("month dd has "+sizeMonth+" month options");
        select.selectByValue("7");

        Thread.sleep(2000);

        WebElement daysDD = driver.findElement(By.id("day"));
        select = new Select(daysDD);
        List<WebElement> allDays = select.getOptions();
        int sizeDays = allDays.size();
        System.out.println("day dd has "+sizeDays+" day options");
        select.selectByValue("31");

        Thread.sleep(2000);

        WebElement yearDD = driver.findElement(By.id("year"));
        select = new Select(yearDD);
        List<WebElement> allYears = select.getOptions();
        int sizeYears = allYears.size();
        System.out.println("year dd has "+sizeYears+" year option");
        select.selectByValue("1991");

        Thread.sleep(2000);

        driver.quit();
    }
}
