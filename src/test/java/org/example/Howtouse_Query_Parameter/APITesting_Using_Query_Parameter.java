package org.example.Howtouse_Query_Parameter;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Using_Query_Parameter {

    @Test
    public void test_QueryParameter(){

        RequestSpecification requestSpecification = RestAssured.given();

        requestSpecification.baseUri("https://reqres.in/");
        requestSpecification.basePath("/api/users");
        requestSpecification.queryParam("page",2).queryParam("id",10);
        Response response = requestSpecification.get();

        String responseBody = response.getBody().asString();
        System.out.println("Response after Useing Query Params : "+responseBody);

        JsonPath jsonPathView = response.jsonPath();
        String firstName = jsonPathView.get("data.first_name");

        Assert.assertEquals(firstName,"Byron","First Name is not Valid.");



    }
}
