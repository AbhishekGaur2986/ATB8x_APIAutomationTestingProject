package org.example.sampleCheck;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_PostMethod_TestNG {

    @Description("My Second Test case Report")
    @Test
    public void testPost(){

        String payload = "{\"name\":\"morpheus\",\"job\":\"leader\"}";

        RestAssured
                .given()
                .header("content-type","application/json")
                .baseUri("https://reqres.in")
                .basePath("/api/users")
                .body(payload)
                .when()
                .post()
                .then()
                .statusCode(201).log().all();



    }
}
