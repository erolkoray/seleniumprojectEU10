package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_Registiration_Form {


    @Test

    public void registiration_form_test(){
//1. Open browser
//2. Go to website: https://practice.cydeo.com/registration_form
        Driver.getDriver().get(ConfigurationReader.getProperty("registiration.form.url"));

//Create JavaFaker object
        Faker faker = new Faker();
//3. Enter first name
        WebElement inputFirstName = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        inputFirstName.sendKeys(faker.name().firstName());

//4. Enter last name
        WebElement inputLastName = Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());
//5. Enter username
        WebElement inputUsername = Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
        String user = faker.bothify("helpdesk###");
        inputUsername.sendKeys(user);
//6. Enter email address
        WebElement inputEmail = Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user+"@hotmail.com");
//7. Enter password
        WebElement inputPassword = Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.bothify("###??##?#"));
//8. Enter phone number
        WebElement inputPhoneNumber = Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhoneNumber.sendKeys(faker.numerify("###-###-####"));

//9. Select a gender from radio buttons
        WebElement selectGender = Driver.getDriver().findElement(By.xpath("//input[@value='male']"));
        selectGender.click();

//10. Enter date of birth
        WebElement inputDoB = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        inputDoB.sendKeys("10/04/1993");
//11. Select Department/Office
        WebElement selectDepartment = Driver.getDriver().findElement(By.xpath("//*[@id='registrationForm']/div[9]/div/select/option[9]"));
        selectDepartment.click();
//12. Select Job Title
//13. Select programming language from checkboxes
//14. Click to sign up button
//15. Verify success message “You’ve successfully completed registration.” is
//displayed.
    }
}
/*
TC#1: Registration form confirmation
Note: Use JavaFaker OR read from configuration.properties file when possible.




Note:
1. Use new Driver utility class and method
2. User JavaFaker when possible
3. User ConfigurationReader when it makes sense
 */