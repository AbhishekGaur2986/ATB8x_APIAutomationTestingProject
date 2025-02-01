package org.example.Validate_ResponseBody;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_validate_ResonseBody {

    @Test
    public void test_ResponseBody(){

        baseURI = "https://reqres.in/api/users/2";

        RequestSpecification requestSpecification = RestAssured.given();

        Response res = requestSpecification.get();

        int statusCode = res.statusCode();
        String statusline = res.statusLine();

        //Fetch the single Response Header at a time
        String contentType = res.getHeader("Content-Type");
        System.out.println("Content - Type is : "+contentType);

        //Fetch the headerList of all the Headers from Response

        Headers headerList = res.getHeaders();

        // iterate all the headers from the list by for each loop

        for (Header header :headerList)
        {
            System.out.println("Key : "+header.getName() +" "+"Value : "+header.getValue());
        }

        Assert.assertEquals(statusCode,200,"Recieved Code is Incorrect !");
        Assert.assertEquals(statusline,"HTTP/1.1 200 OK","No");
    }

}
