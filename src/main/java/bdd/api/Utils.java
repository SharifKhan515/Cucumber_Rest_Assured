package bdd.api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class Utils {


    public static RequestSpecification getRequestSpec(){
        RestAssured.baseURI = "https://automationexercise.com/api/";
        return new RequestSpecBuilder().setBaseUri("https://automationexercise.com/api/").build();
    }

}
