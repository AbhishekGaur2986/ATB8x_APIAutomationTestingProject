package org.example.sampleCheck;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class APITesting_DeleteMethod_TestNG {

    @Test
    public void test_delete(){

                given()
                .baseUri("https://reqres.in")
                .basePath("/api/users/226")
                .contentType(ContentType.JSON)
                .when()
                .delete()
                .then()
                .statusCode(204).log().all();
    }

}

