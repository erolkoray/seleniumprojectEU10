package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_Iframes {


    WebDriver driver;

    @BeforeMethod

    public void setupMethod(){
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2. Go to website: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe  ");
    }


//  @ignore - means it will skip the following test method
    @Test
    public void iframe_test1(){

        // we need to switch drivers focus to iframe
        // Opt. 1  - switching to iframe using id attribute value
        driver.switchTo().frame("mce_0_ifr");

        //Opt 2
     //  driver.switchTo().frame(0); - this is by the index number. index number is always whatever results it returns in the inspect HTML page -1

        //Opt 3
     //  driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")

        // locate the p tag
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHereText.isDisplayed());

        //verify "An iframe containing the TinyMCE WYSIWYG Editor"
        // we need to switch back to ParentFrame from iframe
        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        // Assertion of the header text is displayed or not

        Assert.assertTrue(headerText.isDisplayed());


    }

}
