package com.syntax.seleniumclass04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://syntaxprojects.com/basic-radiobutton-demo.php");
        WebElement ageGroup = driver.findElement(By.cssSelector("input[value='5 - 15']"));

        boolean isAgeRadioButtonEnabled = ageGroup.isEnabled();
        System.out.println(isAgeRadioButtonEnabled);

        boolean isAgeRadioButtonDisplayed = ageGroup.isDisplayed();
        System.out.println(isAgeRadioButtonDisplayed);

        boolean isAgeRadioButtonSelected = ageGroup.isSelected(); //check if it is selected
        System.out.println("Before clicking "+isAgeRadioButtonSelected); //value is false because we didn't click on it yet

        ageGroup.click();
        isAgeRadioButtonSelected = ageGroup.isSelected(); //after clicking, we should check it again and reassign a new value
        System.out.println("After clicking "+isAgeRadioButtonSelected);
    }
}
