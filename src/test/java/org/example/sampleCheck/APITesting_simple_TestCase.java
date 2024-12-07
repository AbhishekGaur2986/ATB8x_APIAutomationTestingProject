package org.example.sampleCheck;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITesting_simple_TestCase {

    //https://restful-booker.herokuapp.com/booking

    void testcase001(){

        Response res = RestAssured.get("https://restful-booker.herokuapp.com/booking");
        System.out.println(res.asString());
        System.out.println(res.getStatusCode());

    }


}
