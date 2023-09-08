package definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class GetAPI {

    RequestSpecification requestSpecification = new RequestSpecBuilder().setBaseUri("https://automationexercise.com/api/").build();
    Response response;

    @When("Get call to {string} API")
    public void getCallToAPI(String url) {
        System.out.println("Calling API");
        response = given().spec(requestSpecification).when().get(url).then().extract().response();
        System.out.println(response);

    }

    @Then("Response code is {int}")
    public void responseCodeIs(int responseCode) {
        int actualResponseCode = response.getStatusCode();
        System.out.println("status is: "+ actualResponseCode);
        Assert.assertEquals(actualResponseCode,responseCode);
        System.out.println("assertion");

    }

    @And("Response body contains Product List")
    public void responseBodyContainsProductList() {
        System.out.println("AND");
        String body = response.getBody().asString();
        System.out.println(body);
    }
}
