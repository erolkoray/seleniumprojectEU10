package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector_practice {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/forgot_password");
//a. “Home” link

        //locating homeLink using cssSelector syntax #1
        WebElement homeLink1 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        //locating homeLink using cssSelector syntax #2
        WebElement homeLink2 = driver.findElement(By.cssSelector("a.nav-link"));

        //locating homeLink using cssSelector, href value
        WebElement homeLink3 = driver.findElement(By.cssSelector("a[href='/']"));


//b. “Forgot password” header
        // locate header using cssSelector: locate parent element and move down to h2
        WebElement header1 = driver.findElement(By.cssSelector("div.example>h2")); //. means class
        // locate header using xpath, and using web elements text "Forgot Password"
        WebElement header2 = driver.findElement(By.xpath("//h2[text()='Forgot Password']"));

//c. “E-mail” text
        WebElement email1 = driver.findElement(By.cssSelector("label[for='email']")); // cssSelector
        WebElement email2 = driver.findElement(By.xpath("//label[@for='email']")); // xpath



//d. E-mail input box

        WebElement emailInputBox = driver.findElement(By.xpath("//input[@name='email']")); // xpath

//e. “Retrieve password” button

        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']")); // xpath

//f. “Powered by Cydeo text

        WebElement cydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']")); // xpath

//4. Verify all web elements are displayed.

        System.out.println("header1.isDisplayed() = " + header1.isDisplayed());
        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("cydeoText.isDisplayed() = " + cydeoText.isDisplayed());
        System.out.println("email1.isDisplayed() = " + email1.isDisplayed());


    }
}
/*
TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS
locator only (total of 6)
a. “Home” link
b. “Forgot password” header
c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button
f. “Powered by Cydeo text
4. Verify all web elements are displayed.
First solve the task with using cssSelector only. Try to create 2 different
cssSelector if possible

Then solve the task using XPATH only. Try to create 2 different
XPATH locator if possible

 */