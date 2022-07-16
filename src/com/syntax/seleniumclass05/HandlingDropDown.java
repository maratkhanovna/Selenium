package com.syntax.seleniumclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlingDropDown {
    public static String url = "https://syntaxprojects.com/basic-select-dropdown-demo.php";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement daysDD = driver.findElement(By.id("select-demo"));//identifying the dropdown as a single element
        Select select = new Select(daysDD);//create an object of Select class for this specific WebElement
        select.selectByIndex(3);//clicks on Tuesday
        Thread.sleep(1000);
        select.selectByVisibleText("Thursday");//clicks on Thursday
        Thread.sleep(1000);
        select.selectByValue("Friday");

        List<WebElement> allOptions = select.getOptions(); // gets all options from dropdown
        int size = allOptions.size();
        System.out.println(size);

        for (int i=1; i<size; i++){
            String option = allOptions.get(i).getText(); //gets text of all options from dropdown
            System.out.println(option);
            select.selectByIndex(i);
            Thread.sleep(1000);
        }

    }
}
