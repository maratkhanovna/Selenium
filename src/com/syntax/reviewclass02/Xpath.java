package com.syntax.reviewclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //launch the website
        driver.get("https://demo.guru99.com/insurance/v1/register.php");
        //access the text box Surname using absolute Xpath
        WebElement surname = driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div[1]/input"));
        surname.sendKeys("sadig");
        //access the text box Firstname using relative Xpath
        WebElement firstname = driver.findElement(By.xpath("//input[@id = 'user_firstname']"));
        firstname.sendKeys("aladin");
        //access the webelement date of birth and print the text on console
        WebElement dob = driver.findElement(By.xpath("//label[text() = 'Date of Birth']"));
        System.out.println(dob.getText());
        //access the webelement lisence period and print the text on console
        WebElement licence = driver.findElement(By.xpath("//label[contains(text(),'Licence Period')]"));
        System.out.println(licence.getText());

        //access the webelement radio button and click on it
        WebElement radioBtn = driver.findElement(By.xpath("//label[text() = 'Full']/following-sibling::input"));
        radioBtn.click();
        //access the webelement city using cascading ('and' operator)
        WebElement city = driver.findElement(By.xpath("//input[@name='city' and @type = 'text']"));
        city.sendKeys("Ocean");
        //access the webelement phone using css selector
        WebElement phone = driver.findElement(By.cssSelector("input#user_phone"));
        phone.sendKeys("1234567888");

        //access the webelement address using css selector
        WebElement address = driver.findElement(By.cssSelector("input[id*='attributes_street']"));
        address.sendKeys("1233ocean");


    }
}
