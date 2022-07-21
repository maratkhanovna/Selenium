package com.syntax.seleniumclass08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandleStaticWebTables {
    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id = 'task-table']/tbody/tr"));
        System.out.println(rowData.size() + " rows in the table");

        Iterator<WebElement> iterator = rowData.iterator();
        while (iterator.hasNext()) {
            WebElement row = iterator.next();
            String rowText = row.getText();
            System.out.println(rowText);
        }
        System.out.println("-----------------------------");

        List<WebElement> columnsData = driver.findElements(By.xpath("//table[@id = 'task-table']/thead/tr/th"));

        for (WebElement colData : columnsData) {
            String colText = colData.getText();
            System.out.println(colText);
        }

        System.out.println("-----------------------------");
        List<WebElement> secondCol = driver.findElements(By.xpath("//table[@id = 'task-table']/tbody/tr/td[2]"));
        iterator = secondCol.iterator();
        while (iterator.hasNext()) {
            WebElement col = iterator.next();
            String colText = col.getText();
            System.out.println(colText);
        }
        System.out.println("-------------------------");

        WebElement exactData = driver.findElement(By.xpath("//*[@id='task-table']/tbody/tr[2]/td[4]"));
        System.out.println(exactData.getText());


    }
}
