package org.example.sampleCheck;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_GetMethod_TestNG {

    @Description("My First Test case Report")
    @Test
    public void APITest(){
        RestAssured.
                given()
                .baseUri("https://reqres.in")
                .basePath("/api/users?page=2")
                .when()
                .get()
                .then()
                .statusCode(200).log().all();

    }
}
