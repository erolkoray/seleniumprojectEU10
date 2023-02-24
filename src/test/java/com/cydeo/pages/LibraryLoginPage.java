package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    public LibraryLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }



    //TC #1: Required field error message test
    //1- Open a chrome browser
    //2- Go to: https://library1.cydeo.com
    //3- Do not enter any information
    //4- Click to “Sign in” button
    //5- Verify expected error is displayed:
    //Expected: This field is required.
    //
    //NOTE: FOLLOW POM DESIGN PATTERN


}
