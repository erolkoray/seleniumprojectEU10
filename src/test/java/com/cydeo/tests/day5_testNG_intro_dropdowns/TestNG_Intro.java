package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Intro { // TESTNG IS A UNIT TESTING TOOL FOR TESTERS

    @BeforeClass        // runs once
    public void setupMethod(){
        System.out.println("------- BeforeClass is running!");
        System.out.println();
    }

    @BeforeMethod // runs before every method
    public void setUpMethod(){
        System.out.println("--- BeforeMethod is running.");
    }

    @AfterMethod // runs after every method
    public void tearDownMethod(){
        System.out.println("--- AfterMethod is running.");
        System.out.println();
    }

    @Test
    public void test1(){
        System.out.println("Test 1 is running.");

        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual, expected); // returns the variables
    }

    @Test
    public void test2(){
        System.out.println("Test 2 is running.");

        String actual = "apple";
        String expected = "apple";

        Assert.assertTrue(actual.equals(expected)); // returns boolean
    }

}
