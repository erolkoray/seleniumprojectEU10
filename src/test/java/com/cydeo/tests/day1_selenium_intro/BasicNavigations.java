package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        //1- Set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the Selenium WebDriver
        WebDriver driver = new ChromeDriver(); // this line will open an empty browser for us
        driver.manage().window().maximize(); // this will make the window full screen

        //3- Go to https://www.tesla.com
        driver.get("https://www.tesla.com");


        //4- Delay the code execution for 1 seconds
        Thread.sleep(1000);

        //5- use selenium to navigate back
        driver.navigate().back();

        //6- use selenium to navigate forward & Delay the code execution for 1 seconds
        Thread.sleep(1000);
        driver.navigate().forward();
        String currentTitle = driver.getTitle(); // gets the current title
        System.out.println("Website title: "+ currentTitle);
        String currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: "+currentURL);

        // Delay the code execution for 1 second and go to amazon.com then go to amazon prime
        Thread.sleep(1000);
        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.amazon.com/prime");

        // Delay the code execution for 1 seconds & refresh the page
        Thread.sleep(1000);
        driver.navigate().refresh();

        // get the title of the page
        currentTitle = driver.getTitle(); // gets the latest website title after re-assigning the getTitle to CurrentTitle variable
        System.out.println("Website title: "+ currentTitle);

        currentURL = driver.getCurrentUrl();
        System.out.println("Current URL: "+currentURL);

        driver.close(); // this will close the current open window

        driver.quit(); // this will close all Google chrome windows from your current session - NOT ALL CHROME WINDOWS ON YOUR PC outside of the session. This will close multiple tabs too


    }


}
