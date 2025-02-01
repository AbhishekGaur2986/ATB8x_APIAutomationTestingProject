package org.example.Validate_ResponseBody;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class APITesting_Response_BDD_Style {

    @Test
    public void test_Response_BDD_Style(){

        given()

        .when()
                .get("https://reqres.in/api/users/19")

        .then()
                .statusCode(200)
                .statusLine("HTTP/1.1 200 OK")
                .log().all();


    }
}
