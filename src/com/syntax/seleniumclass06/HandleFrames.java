package com.syntax.seleniumclass06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {
    public static String url = "http://www.uitestpractice.com/Students/Switchto";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.switchTo().frame(0);
        WebElement textBox = driver.findElement(By.id("name"));
        textBox.sendKeys("Batch 13 Forever!!");

        driver.switchTo().defaultContent(); //switches back to main webpage

        WebElement alertButton = driver.findElement(By.id("alert"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        //after alert close we don't need to switch back to the main page

        driver.switchTo().frame("iframe_a");
        textBox.clear(); //delete previous message text
        textBox.sendKeys("we are back to the frame"); //we don't need to locate again to textBox, we already have it

        driver.switchTo().defaultContent();

        WebElement frameElement = driver.findElement(By.xpath("//iframe[@src = '/Demo.html']"));
        driver.switchTo().frame(frameElement); // switches to the frame by webElement that we identified
        textBox.clear();
        textBox.sendKeys("Hold your horses");
    }
}
