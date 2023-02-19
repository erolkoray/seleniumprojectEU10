package com.cydeo.utilities;

import org.openqa.selenium.WebDriver;

public class Driver {

    //Creating a private constructor, so we are closing access to the object of this class from the outside of the class
    private Driver(){} // this is a private constructor

    // We make WebDriver private, because we want to close access from outside the class
    // We make it static because we will use it in a static method (and it will run before everything else too)

    private static WebDriver driver;

    // Create a reusable utility method which will return same driver instance when we call it
    public static WebDriver getDriver(){
        if(driver == null){

        }
        return driver;
    }

}
