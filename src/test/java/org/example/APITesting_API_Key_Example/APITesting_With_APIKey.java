package org.example.APITesting_API_Key_Example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_With_APIKey {

    //https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}

    @Test
    public void test_APIKey_Example(){

        RequestSpecification requestSpecification = RestAssured.given();

        requestSpecification.baseUri("https://api.openweathermap.org");
        requestSpecification.basePath("/data/2.5/weather");

        requestSpecification.queryParam("q","Delhi").queryParam("appid","9e7f389b6f22e1861c13162e78b1bbe5");

        Response response = requestSpecification.get();
        System.out.println("Weather :"+response);

        Assert.assertEquals(response.statusCode(),200,"Not a Valid Code");

        System.out.println("Response Status Line : "+response.statusLine());
        System.out.println("Response Body : "+response.body().asString());


    }
}
