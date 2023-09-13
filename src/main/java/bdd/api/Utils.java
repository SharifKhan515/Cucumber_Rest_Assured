package bdd.api;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Utils {


    public static RequestSpecification getRequestSpec() throws FileNotFoundException {
        PrintStream printStream = new PrintStream(new FileOutputStream("Log.txt"));
        RestAssured.baseURI = Config.getBaseUrl();
        RequestSpecification requestSpecification = new RequestSpecBuilder().setBaseUri(Config.getBaseUrl())
                        .addFilter(RequestLoggingFilter.logRequestTo(printStream))
                        .addFilter(ResponseLoggingFilter.logResponseTo(printStream))
                        .build();

        return requestSpecification;
    }


}
