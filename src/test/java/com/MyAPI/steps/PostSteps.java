package com.MyAPI.steps;

import com.MyAPI.RegressionTestSuits;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static org.hamcrest.Matchers.equalToIgnoringCase;
import static org.hamcrest.Matchers.is;

public class PostSteps {
    @Given("^: I perform post operation for \"([^\"]*)\"$")
    public void i_perform_post_operation_for(String arg1) throws Throwable {

    }

    @Given("^:   I sent post request$")
    public void i_sent_post_request() throws Throwable {
        RegressionTestSuits.postMethod();

    }

    @Then("^:   I should be able to see updated register\\.$")
    public void i_should_be_able_to_see_updated_register() throws Throwable {

    }


}
