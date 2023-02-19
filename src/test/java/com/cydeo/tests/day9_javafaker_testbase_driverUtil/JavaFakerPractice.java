package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {


    @Test
    public void Test1(){
    //Creating Faker object to reach methods from Faker Dependency(from pom.xml)
        Faker faker = new Faker(); //new Locale("tr") - makes everything Turkish eg. names etc.

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());
        System.out.println("faker.name().fullName() = " + faker.name().fullName());


        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());

        System.out.println("faker.numerify() = " + faker.numerify("###-###-5323")); // #'s will be replaced with random data(numbers)

        System.out.println("faker.letterify(\"???-????\") = " + faker.letterify("???-????")); //returns random data(letters) whenever there is a ?
        System.out.println("faker.bothify(\"##?#-??##-#??#-###?\") = " + faker.bothify("##?#-??##-#??#-###?")); // malgamation of numrify and letterify
        System.out.println("faker.finance().creditCard().replace(\"-\",\"\") = " + faker.finance().creditCard().replace("-", ""));
        System.out.println("faker.chuckNorris().fact() = " + faker.chuckNorris().fact().replace("Chuck Norris", "Koray"));



    }
}
