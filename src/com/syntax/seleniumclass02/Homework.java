package com.syntax.seleniumclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    /*
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser
     */
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        WebElement firstName = driver.findElement(By.id("customer.firstName"));
        firstName.sendKeys("Gaukhar");
        WebElement lastName = driver.findElement(By.id("customer.lastName"));
        lastName.sendKeys("Razakberlina");
        WebElement address = driver.findElement(By.name("customer.address.street"));
        address.sendKeys("1110 Avenue K");
        WebElement city = driver.findElement(By.id("customer.address.city"));
        city.sendKeys("Brooklyn");
        WebElement state = driver.findElement(By.id("customer.address.zipCode"));
        state.sendKeys("New York");
        WebElement phone = driver.findElement(By.name("customer.phoneNumber"));
        phone.sendKeys("6465370790");
        WebElement ssn = driver.findElement(By.name("customer.ssn"));
        ssn.sendKeys("123456879");
        WebElement username = driver.findElement(By.id("customer.username"));
        username.sendKeys("maratkhanovna");
        WebElement password = driver.findElement(By.name("customer.password"));
        password.sendKeys("pass12345");
        WebElement confirmation = driver.findElement(By.name("repeatedPassword"));
        confirmation.sendKeys("pass12345");
        driver.findElement(By.className("button")).click();
        Thread.sleep(3000);
        driver.quit();
    }
}
