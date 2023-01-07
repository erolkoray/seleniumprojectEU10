package com.cydeo.tests.day5_testNG_intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestNG_Selenium {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){      // EVERYTHING IN THIS METHOD NOW WILL AUTOMATICALLY RUN BEFORE EVERY OTHER METHOD (EG. TEST METHODS)
        //Do Browser driver setup
        //Open browser
        driver = WebDriverFactory.getDriver("chrome");
        //maximise the page
        driver.manage().window().maximize();
        //implicit wait
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDownMethod(){ //EVERYTHING IN THIS METHOD WILL AUTOMATICALLY RUN AFTER EVERY OTHER TEST METHOD

        driver.close();
    }

    @Test
    public void selenium_test(){

        //get"https://google.com"
        driver.get("https://google.com");

        // Assert: title is "Google"
        String actualTitle = driver.getTitle();
        String expectedTitle = "Google";
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not matching here."); // message will only show if the test fails.

    }

}
