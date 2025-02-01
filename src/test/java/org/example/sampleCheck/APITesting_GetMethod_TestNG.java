package org.example.sampleCheck;

import io.qameta.allure.Description;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

import java.sql.Time;

public class APITesting_GetMethod_TestNG {

    @Description("My First Test case Report")
    @Test
    public void APITest(){

        baseURI = "https://reqres.in/api/users";
                given()
                .queryParam("id","2")
                .when()
                .get()
                .then()
                .statusCode(200).log().all();



    }
}
