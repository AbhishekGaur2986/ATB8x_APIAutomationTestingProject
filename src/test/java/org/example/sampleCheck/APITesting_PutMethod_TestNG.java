package org.example.sampleCheck;

import io.qameta.allure.Description;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting_PutMethod_TestNG {

    @Description("Put Testing")
    @Test
    public void testPut(){

        String payload = "{\n" +
                "    \"name\": \"Abhi\",\n" +
                "    \"job\": \"Tester\"\n" +
                "}";


                given()
                .header("content-type","application/json")
                .baseUri("https://reqres.in")
                .basePath("/api/users/226")
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .put()
                .then()
                .statusCode(200).log().all();
    }
}
