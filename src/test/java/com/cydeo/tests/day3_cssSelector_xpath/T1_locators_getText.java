package com.cydeo.tests.day3_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_locators_getText {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");
        WebElement inputUsername = driver.findElement(By.name("USER_LOGIN"));
        inputUsername.sendKeys("Incorrect");
        // TO AUTO GENERATE VARIABLE = option + enter
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("Incorrect");

        WebElement loginButton = driver.findElement(By.className("login-btn"));
        loginButton.click();

        WebElement errorText = driver.findElement(By.className("errortext"));

        String expectedErrorText = "Incorrect login or password";
        String actualErrorText = errorText.getText();

        if(actualErrorText.equals(expectedErrorText)){
            System.out.println("Error message verification PASSED!");
        }else {
            System.out.println("Error message verification FAILED!");
        }


    }
}
/*
TC #1: NextBaseCRM, locators and getText() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/
3- Enter incorrect username: “incorrect”
4- Enter incorrect password: “incorrect”
5- Click to login button.
6- Verify error message text is as expected:
Expected: Incorrect login or password




PS: Inspect and decide which locator you should be using to locate web
elements.
 */