package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkboxes {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/checkboxes");

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        System.out.println("checkbox1.isSelected(Expecting False) = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected(Expecting True) = " + checkbox2.isSelected());

        Thread.sleep(1000);
        checkbox1.click(); // this will select it because checkbox 1 was not checked

        Thread.sleep(1000);
        checkbox2.click(); // this will deselect it because checkbox 2 was already checked

        System.out.println();

        System.out.println("checkbox1.isSelected(Expecting True) = " + checkbox1.isSelected());
        System.out.println("checkbox2.isSelected(Expecting False) = " + checkbox2.isSelected());

        Thread.sleep(1000);

        driver.close();
    }

}
/*
Practice: Checkboxes
1. Go to http://practice.cydeo.com/checkboxes
2. Confirm checkbox #1 is NOT selected by default
3. Confirm checkbox #2 is SELECTED by default.
4. Click checkbox #1 to select it.
5. Click checkbox #2 to deselect it.
6. Confirm checkbox #1 is SELECTED.
7. Confirm checkbox #2 is NOT selected.
 */