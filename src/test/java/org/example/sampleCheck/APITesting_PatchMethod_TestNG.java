package org.example.sampleCheck;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import org.testng.annotations.Test;

public class APITesting_PatchMethod_TestNG {

    @Test
    public void test_patch() {

        String payload = "{\n" +
                "    \"name\": \"Gaur\",\n" +
                "    \"job\": \"QA\"\n" +
                "}";

                given()
                .header("content-type", "application/json")
                .baseUri("https://reqres.in")
                .basePath("/api/users/226")
                .contentType(ContentType.JSON)
                .body(payload)
                .when()
                .patch()
                .then()
                .statusCode(200).log().all();

    }
}
