package org.example.sampleCheck;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_PutMethod_TestNG {

    @Description("Put Testing")
    @Test
    public void testPut(){

        String payload = "{\"name\":\"Abhishek\",\"job\":\"QA\"}";

        RestAssured
                .given()
                .header("content-type","application/json")
                .baseUri("https://reqres.in")
                .basePath("/api/users/2")
                .body(payload)
                .when()
                .put()
                .then()
                .statusCode(200).log().all();
    }
}
