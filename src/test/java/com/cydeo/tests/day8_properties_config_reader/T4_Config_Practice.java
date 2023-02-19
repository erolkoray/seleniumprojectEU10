package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {
/*
    public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        // WE ARE GETTING THE BROWSERTYPE DYNAMICALLY FROM OUR CONFIGURATION.PROPERTIES FILE
        String browserType = ConfigurationReader.getProperty("browser");
        //1- Open a chrome browser
        //2- Go to: https://google.com

        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com ");
    }

 */



    @Test
    public void google_search_test(){
        Driver.getDriver().get("https://google.com");
        //3- Write “apple” in search box

        WebElement acceptCookies = Driver.getDriver().findElement(By.xpath("//*[@id=\"L2AGLb\"]"));
        acceptCookies.click();


        WebElement googleSearchBox = Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);
        //4- Verify title:
        //Expected: apple - Google Search

        String expectedTitle = ConfigurationReader.getProperty("searchValue")+" - Google Search";
        String actualTitle = Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);



    }
    //Use `configuration.properties` for the following:
    //1. The browser type
    //2. The URL
    //3. The search keyword
    //4. Make title verification dynamic. If search value changes, title
    //assertion should not fail.
}
