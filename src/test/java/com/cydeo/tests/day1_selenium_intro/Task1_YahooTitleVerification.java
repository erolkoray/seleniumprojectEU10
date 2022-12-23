package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.uk.yahoo.com");
        Thread.sleep(2000);
        String actualTitle = driver.getTitle();

        String expectedTitle = "Yahoo is part of the Yahoo family of brands";

        if(actualTitle.equals(expectedTitle)){
           System.out.println("Title is as expected. Verification PASSED");
        }else {
           System.err.println("Title is not as expected. Verification FAILED");
        }

        driver.quit();




    }
}
