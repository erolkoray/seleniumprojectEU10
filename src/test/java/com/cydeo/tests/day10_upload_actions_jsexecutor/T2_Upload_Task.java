package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Task {
    @Test
    public void upload_test(){
        //TC #2 Upload Test
        //1. Go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");
        //2. Find some small file from your computer, and get the path of it.
        String path = "/Users/koray/Desktop/Screenshot 2023-01-06 at 15.54.44.png";
        //3. Select the file.
        WebElement fileUpload = Driver.getDriver().findElement(By.id("file-upload"));
        fileUpload.sendKeys(path);
        //4. Upload the selected file
        WebElement uploadButton = Driver.getDriver().findElement(By.xpath("//*[@id=\"file-submit\"]"));
        uploadButton.click();

        WebElement fileUploadedHeader = Driver.getDriver().findElement(By.id("h3"));


        //4. Assert:
        //-File uploaded text is displayed on the page
        Assert.assertTrue(fileUploadedHeader.isDisplayed());


    }
}
/*



 */
