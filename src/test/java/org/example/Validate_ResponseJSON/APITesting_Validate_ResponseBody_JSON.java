package org.example.Validate_ResponseJSON;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class APITesting_Validate_ResponseBody_JSON {

    @Test
    public void test_JSON_Validate(){

        RequestSpecification requestspec = RestAssured.given();

        requestspec.baseUri("https://reqres.in");
        requestspec.basePath("/api/users?page=2");

        Response response = requestspec.get();

        ResponseBody responseBody = response.body();
        String responseString = responseBody.asString();
        System.out.println("JSON : r"+responseString);

        //Assert.assertEquals(responseString.contains("George"),true,"JSON is Invalid.");
    }

    public static class APITesting_AssertionExample {

            // TestNG Assertion
            // ER == AR
            // Expected Result == Actual Result

            @Test
            public void test_hardAssertExample() {
                System.out.println("Start of the program");
                Assert.assertTrue(false);
                System.out.println("End of the program");


                Assert.assertEquals("Pramod", "Pramod"); //T
                Assert.assertEquals("Pramod", "pramod"); //F


            }

        @Test
        public void test_softAssertExample() {
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertTrue(false); // This will not stop execution.
            System.out.println("This line will be executed.");
            softAssert.assertAll(); // This will report all collected errors.
        }
        }

    public static class APITesting_ValidateJSONRespBody {

        @Test
        public void tes_JSONValidateRespBody(){

            RequestSpecification requestSpecification = RestAssured.given();

            requestSpecification.baseUri("https://reqres.in");
            requestSpecification.basePath("/api/users?page=2");

            Response response =  requestSpecification.get();

            ResponseBody responseBody = response.body();

            String responseString = responseBody.asString();
            System.out.println(responseString);

            JsonPath jsonpathview = responseBody.jsonPath();

            String first_name = jsonpathview.get("data[2].first_name");

            System.out.println("First Name Is : "+first_name);
            Assert.assertEquals(first_name,"Emma","Invalid Name.");





        }
    }
}
