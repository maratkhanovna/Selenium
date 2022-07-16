package com.syntax.seleniumclass05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Homework02 {
    public static String url = "https://www.facebook.com/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);
        WebElement newAccButton = driver.findElement(By.xpath("//a[text()='Create new account']"));
        newAccButton.click();
        Thread.sleep(2000);

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Goha");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Smith");
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("gaukhar@mail.com");
        WebElement reEnterEmail = driver.findElement(By.name("reg_email_confirmation__"));
        reEnterEmail.sendKeys("gaukhar@mail.com");

        WebElement password = driver.findElement(By.id("password_step_input"));
        password.sendKeys("pass123");

        WebElement monthDD = driver.findElement(By.id("month"));
        Select select = new Select(monthDD);
        select.selectByValue("7");

        WebElement daysDD = driver.findElement(By.id("day"));
        select = new Select(daysDD);
        select.selectByValue("31");

        WebElement yearsDD = driver.findElement(By.id("year"));
        select = new Select(yearsDD);
        select.selectByValue("1991");

        WebElement genderRadioButton = driver.findElement(By.xpath("(//input[@name = 'sex'])[1]"));
        genderRadioButton.click();

        WebElement signUpButton = driver.findElement(By.name("websubmit"));
        signUpButton.click();

        driver.quit();
    }
}
