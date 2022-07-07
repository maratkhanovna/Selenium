package com.syntax.seleniumclass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com");
        WebElement start = driver.findElement(By.cssSelector("a#btn_basic_example"));
        start.click();
        Thread.sleep(2000);
        WebElement simpleFormDemo = driver.findElement(By.xpath("//a[text() = 'Check Box Demo']/preceding-sibling::a"));
        simpleFormDemo.click();
        Thread.sleep(2000);
        WebElement message = driver.findElement(By.cssSelector("input[placeholder ^='Please']"));
        message.sendKeys("Hello World");
        Thread.sleep(2000);
        WebElement showMessage = driver.findElement(By.cssSelector("button[onclick *= 'show']"));
        showMessage.click();
        Thread.sleep(2000);

        driver.quit();
    }
}
