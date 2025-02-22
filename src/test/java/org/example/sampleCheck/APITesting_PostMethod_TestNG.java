package org.example.sampleCheck;

import io.qameta.allure.Description;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting_PostMethod_TestNG {

    @Description("My Second Test case Report")
    @Test
    public void testPost(){

        String payload = "{\n" +
                "    \"name\": \"abhishek\",\n" +
                "    \"job\": \"QA\"\n" +
                "}";


                given()
                .header("content-type","application/json")
                .baseUri("https://reqres.in")
                .basePath("/api/users")
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .post()
                .then()
                .statusCode(201).log().all();



    }
}
