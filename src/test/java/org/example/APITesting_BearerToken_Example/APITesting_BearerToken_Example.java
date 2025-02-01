package org.example.APITesting_BearerToken_Example;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_BearerToken_Example {

    @Test
    public void test_bearerToken(){

        RequestSpecification requestSpecification = RestAssured.given();

        requestSpecification.baseUri("https://10.1.150.125");
        requestSpecification.basePath("/WebAPI/v3/ocp/virtualization/provisioningEndPoints/OCP-7E60E9FF-DA68-44F0-8011-D650F0BFBC6A/namespaces");

        String AuthToken = "bearer h9-MdEdxND3NhQYdSwWj1nSgJLABk8ijngaVUqebeTWxJEQIk5_kSRL36OVER2IR4CWPyWpbwTOY9bTqy57FGM6JnQ2nfgsI6BnJSOmkZhLfpvuNvndcJRhxDXhYu3fEArxCyZlJd2dD7m596vnKoZZ35Da4YfevVJXgckmdeDzPYMhgSCmZYrZY9h4uUbS9Wy241XYHYde6QJefWFrq8AbmJAMolQmobqhXOqTswkoTwpNzTbob34naKyOYSvlVGZccI-EnrlEqM0A8epSGJH4XEi-Rp9yzSNoDXXJhFGC9oPAj7MiHHOJedNzkv6CbtXqOm0ygFM24kr7e63ElwgWFF26xP_CHsFEbx2Zra_8SACEdp09Ci5xMjstxG8ltaHcO0BBijEu2Kp5AY_4tXUo1qSXG0ua0r07eWGROpwdP2CBoEPnKyHWAEkODKOJHS8lNRKiCltDSw_n4LCu1CA";

        requestSpecification.headers("Authorization","AuthToken").contentType(ContentType.JSON);

        Response response = requestSpecification.get();

        System.out.println("Response : "+response);

        Assert.assertEquals(response.statusCode(),200,"Not a Valid Code");

        System.out.println("Response Status Line : "+response.statusLine());
        System.out.println("Response Body : "+response.body().asString());




    }
}
