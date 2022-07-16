package com.syntax.seleniumclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Homework03 {

    /*
    Go to ebay.com
    get all the categories and print them in the console
    select Computers/Tables & Networking
    click on search
    verify the header
     */

    public static String url = "https://www.ebay.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        WebElement allCategories = driver.findElement(By.id("gh-cat"));
        Select select = new Select(allCategories);
        List<WebElement> options = select.getOptions();
        for (WebElement option:options){
            String optionText = option.getText();
            System.out.println(optionText);
        }
        select.selectByVisibleText("Computers/Tablets & Networking");

        WebElement searchButton = driver.findElement(By.xpath("//input[@type = 'submit']"));
        searchButton.click();

        WebElement header = driver.findElement(By.xpath("//span[@class = 'b-pageheader__text']"));
        String headerText = header.getText();
        String expectedHeader = "Computers, Tablets & Network Hardware";
        if (header.isDisplayed() && headerText.equals(expectedHeader)){
            System.out.println("Header is verified");
        }

    }
}
