package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {
    public static void main(String[] args) {
        //TC #4: Library verifications
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");

        //3. Enter username: “incorrect@email.com”
        String expectedEmail = "incorrect@email.com";
        WebElement username = driver.findElement(By.id("inputEmail"));
        username.sendKeys("incorrect email "+ Keys.ENTER);

        //4. Enter password: “incorrect password”
        String expectedPassword = "incorrect password";
        WebElement password = driver.findElement(By.id("inputPassword"));
        password.sendKeys("incorrect password"+ Keys.ENTER);

        //5. Click to Sign in button
        WebElement signInButton = driver.findElement(By.className("btn btn-lg btn-primary btn-block"));
        signInButton.click();

        //6. Verify: visually “Sorry, Wrong Email or Password”
        //displayed







    }
}
