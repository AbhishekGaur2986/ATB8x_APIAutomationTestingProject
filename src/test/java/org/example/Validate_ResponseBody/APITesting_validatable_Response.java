package org.example.Validate_ResponseBody;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.baseURI;

public class APITesting_validatable_Response {

    @Test
    public void validatable_ResponseBody(){

        baseURI = "https://reqres.in/api/users/2";

        RequestSpecification requestSpecification = RestAssured.given();

        Response res = requestSpecification.get();

        //Fetch the single Response Header at a time

        String content = res.getHeader("Content-Type");
        System.out.println("Content - Type "+content);

        //Fetch the headerList of all the Headers from Response

        Headers headerList = res.getHeaders();

        // iterate all the headers from the list by for each loop

        for (Header header :headerList)
        {
            System.out.println(header.getName() +" : "+header.getValue());
        }

        ValidatableResponse validres = res.then();

        validres.statusCode(200);
        validres.statusLine("HTTP/1.1 200 OK");
        //validres.header("content-type");

    }


}
