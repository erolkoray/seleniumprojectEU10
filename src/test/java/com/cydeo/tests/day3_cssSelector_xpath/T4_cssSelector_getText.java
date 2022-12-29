package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes");

        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[class='login-btn']")); // same function as web element below, just different cssSelector
        WebElement resetPasswordButton2 = driver.findElement(By.cssSelector("button[value='Reset password']"));// same function as web element above, just different cssSelector

        String expectedResetPassButtonText = "Reset password";
        String actualResetPassButtonText = resetPasswordButton2.getText();

        if(actualResetPassButtonText.equals(expectedResetPassButtonText)){
            System.out.println("Reset password button text verification PASSED!");
        }else {
            System.out.println("Reset password button text verification FAILED!");
        }


    }
}
/*
TC #4: NextBaseCRM, locators, getText(), getAttribute() practice
1- Open a chrome browser
2- Go to: https://login1.nextbasecrm.com/?forgot_password=yes
3- Verify “Reset password” button text is as expected:
Expected: Reset password



PS: Inspect and decide which locator you should be using to locate web
elements.
PS2: Pay attention to where to get the text of this button from
 */