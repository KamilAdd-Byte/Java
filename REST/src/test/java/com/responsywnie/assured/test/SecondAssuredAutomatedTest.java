package com.responsywnie.assured.test;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class SecondAssuredAutomatedTest {

    @Test
    public void givenExistingPetIdWhenGetPetThenPetNotFoundTest(){
        given().when().get("https://swaggerpetstore.przyklady.javastart.pl/v2/pet/1").then().statusCode(200);
    }
}
