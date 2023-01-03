package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    @Test
    public void selenium_test(){
        //Do Browser driver setup
        //Open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //maximise the page
        driver.manage().window().maximize();

        //implicit wait
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        //get"https://google.com"
        driver.get("https://google.com");

        // Assert: title is "Google"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching here."); // message will only show if the test fails.

        driver.close();

    }

}
