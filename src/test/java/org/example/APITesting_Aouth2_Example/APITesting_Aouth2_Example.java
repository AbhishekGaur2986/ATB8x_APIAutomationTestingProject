package org.example.APITesting_Aouth2_Example;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class APITesting_Aouth2_Example {

    String access_Token;

    @Test
    public void GetAccesToken(){

        String Client_ID = "AZM8N3ZukZTGaVq9UhptR2frXtu9fbF_SddO02m6Oi2acuuOrbCfKJ0penqfdGfZGTppHTjZn1cMpixa";
        String Secret_Key ="EHmWtvRDVjqZ1A2mRccoMy--SgLULyqEmNezMUs0KEz1Gt88FgJyDPaktGxBCLogMvoyyI91T8XjQffj";


        //https://api-m.sandbox.paypal.com/v1/oauth2/token

        RequestSpecification requestSpecification = RestAssured.given();

        requestSpecification.baseUri("https://api-m.sandbox.paypal.com");
        requestSpecification.basePath("/v1/oauth2/token");

        Response response = requestSpecification.auth().preemptive()
                .basic(Client_ID,Secret_Key)
                .param("grant_type","client_credentials")
                .post();

        response.prettyPrint();

        access_Token = response.getBody().path("access_token");
        System.out.println("Access Token : "+access_Token);

        Assert.assertEquals(response.statusCode(),200,"Not a Valid Code");

        System.out.println("Response Status Line : "+response.statusLine());
        System.out.println("Response Body : "+response.body().asString());
    }

    //https://api-m.sandbox.paypal.com/v1/invoicing/invoices?page=3&page_size=4&total_count_required=true
    @Test (dependsOnMethods = "GetAccesToken")
    public void GetInvoice(){

        Response res = RestAssured.given()
                .baseUri("https://api-m.sandbox.paypal.com")
                .basePath("/v1/invoicing/invoices")
                .auth().oauth2(access_Token)
                .queryParam("page","3")
                .queryParam("page_size","4")
                .queryParam("total_count_required","true")
                .get();

        res.prettyPrint();

        Assert.assertEquals(res.statusCode(),200,"Not a Valid Code");

        System.out.println("Response Status Line : "+res.statusLine());
        System.out.println("Response Body : "+res.body().asString());

    }
}
