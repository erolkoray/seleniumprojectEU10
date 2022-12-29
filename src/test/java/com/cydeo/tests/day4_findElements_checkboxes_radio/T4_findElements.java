package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest ");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));

        int numberOfLinks = allLinks.size();
        System.out.println("numberOfLinks = " + numberOfLinks);

        for (WebElement each : allLinks) {
            System.out.println("Text of link: " + each.getText()); // getText() method will get the text of the WebElement
            System.out.println("HREF values: " + each.getAttribute("href"));
        }
        driver.close();
    }
}
/*
C #4: FindElements Task
1- Open a Chrome browser
2- Go to: https://practice.cydeo.com/abtest
3- Locate all the links in the page.
4- Print out the number of the links on the page.
5- Print out the texts of the links.
6- Print out the HREF attribute values of the links
 */