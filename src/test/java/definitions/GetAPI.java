package definitions;

import bdd.api.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import org.testng.Assert;

import java.io.FileNotFoundException;

import static io.restassured.RestAssured.given;

public class GetAPI {


    Response response;

    @When("Get call to {string} API")
    public void getCallToAPI(String url) throws FileNotFoundException {
        System.out.println("Calling API " + url );
        response = given().spec(Utils.getRequestSpec()).when().get(url).then().extract().response();
        System.out.println(response);

    }

    @Then("Response code is {int}")
    public void responseCodeIs(int responseCode) {
        int actualResponseCode = response.getStatusCode();
        System.out.println("status is: "+ actualResponseCode);
        Assert.assertEquals(actualResponseCode,responseCode);
        System.out.println("assertion");

    }

    @And("Response body contains {string} List")
    public void responseBodyContainsProductList(String string) {
        System.out.println("AND");
        String body = response.getBody().asString();
        System.out.println(body);
    }
}
