package com.syntax.seleniumclass02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    /*
    navigate to fb.com
    click on create new account
    fill up all the textboxes
    click on sign up button
    close the pop up
    close the browser
     */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.fb.com");
        driver.findElement(By.partialLinkText("Create")).click();
        Thread.sleep(2000);
        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Goa");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Raza");
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("gaukhar@mail.com");
        WebElement reEnter = driver.findElement(By.name("reg_email_confirmation__"));
        reEnter.sendKeys("gaukhar@mail.com");
        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("pass1234");
        WebElement day = driver.findElement(By.id("day"));
        day.sendKeys("31");
        WebElement year = driver.findElement(By.id("year"));
        year.sendKeys("1991");
        driver.findElement(By.className("_58mt")).click();
        driver.findElement(By.name("websubmit")).click();
        Thread.sleep(8000);
        driver.findElement(By.name("reset_action")).click();
        Thread.sleep(2000);
        driver.quit();
    }

}
