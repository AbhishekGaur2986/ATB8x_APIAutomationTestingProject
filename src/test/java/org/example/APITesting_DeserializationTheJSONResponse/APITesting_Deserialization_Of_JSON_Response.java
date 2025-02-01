package org.example.APITesting_DeserializationTheJSONResponse;

import io.qameta.allure.internal.shadowed.jackson.databind.util.JSONPObject;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Deserialization_Of_JSON_Response {

    @Test
    public void DeserializeJSONResponse(){

        RequestSpecification requestSpecification = RestAssured.given();

        requestSpecification.baseUri("https://reqres.in");
        requestSpecification.basePath("/api/users");

        String payload = "{\n" +
                "    \"name\": \"Prachi\",\n" +
                "    \"job\": \"QA\"\n" +
                "}";

        Response response = requestSpecification.contentType(ContentType.JSON)
                .body(payload.toString())
                .post();

        ResponseBody responseBody = response.getBody();
        responseBody.prettyPrint();

        APITesting_JSONPostReqRes jsonPostReqRes = responseBody.as(APITesting_JSONPostReqRes.class);

        Assert.assertEquals(jsonPostReqRes.name,"Prachi","Name is not valid.");
        Assert.assertEquals(jsonPostReqRes.job,"QA","JOB is not valid.");




    }
}
