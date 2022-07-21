package com.syntax.seleniumclass07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class AdvancedWindowHandling {
    public static String url = "https://syntaxprojects.com/window-popup-modal-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        String mainPageHandle = driver.getWindowHandle();
        WebElement instagramButton = driver.findElement(By.linkText("Follow On Instagram"));
        WebElement facebookButton = driver.findElement(By.linkText("Like us On Facebook"));
        WebElement igAndFbButton = driver.findElement(By.linkText("Follow Instagram & Facebook"));

        instagramButton.click();
        facebookButton.click();
        igAndFbButton.click();

        Set<String> allWindows = driver.getWindowHandles();
        System.out.println(allWindows.size()+" windows");

        Iterator<String> iterator = allWindows.iterator();
        while(iterator.hasNext()){ //start iterating through the handles(tabs)
            String handle = iterator.next(); //get one handle (tab)
            if(!mainPageHandle.equals(handle)) { //set of condition where main page is not equal to the handle
                driver.switchTo().window(handle);// switch to that specific handle
                //driver.manage().window().maximize(); //optional maximizing
                String title = driver.getTitle(); //get the title
                System.out.println(title);
                driver.close();//close the tab
            }
        }
        driver.switchTo().window(mainPageHandle);
        instagramButton.click();
    }
}
