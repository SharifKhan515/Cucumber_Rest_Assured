package definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class GetPostAPI {
    @Given("Get call to {string}")
    public void getCallTo(String url) {
        System.out.println("Calling api " +url);
    }

    @Then("Response is {string}")
    public void responseIs(String statusCode) {
        System.out.println("Got code "+ statusCode);
    }

}
