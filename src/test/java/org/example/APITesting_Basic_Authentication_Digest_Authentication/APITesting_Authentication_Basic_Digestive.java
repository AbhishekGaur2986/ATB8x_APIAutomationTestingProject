package org.example.APITesting_Basic_Authentication_Digest_Authentication;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.bidi.browsingcontext.ReadinessState;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.SQLOutput;

public class APITesting_Authentication_Basic_Digestive {

    @Test
    public void test_BasicAuth(){

        RequestSpecification requestSpecification = RestAssured.given();

        requestSpecification.baseUri("http://postman-echo.com");
        requestSpecification.basePath("/basic-auth");

        Response response = requestSpecification.auth().basic("postman","password").get();

        System.out.println("Response Body : "+response.statusLine());

    }

    @Test
    public void test_DigestAuth(){

        RequestSpecification requestSpecification = RestAssured.given();

        requestSpecification.baseUri("https://httpbin.org/");
        requestSpecification.basePath("digest-auth/undefined/prachi/prachi");

        Response response = requestSpecification.auth().digest("prachi","prachi").get();

        Assert.assertEquals(response.statusCode(),200,"Not a valid Code.");

        System.out.println("Response Body : "+response.statusLine());

    }
}
