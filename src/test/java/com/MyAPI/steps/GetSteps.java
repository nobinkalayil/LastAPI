package com.MyAPI.steps;

import com.MyAPI.RegressionTestSuits;
import com.MyAPI.utils.GetPostMethods;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;

public class GetSteps {
    //GetPostMethods getPostMethods = new GetPostMethods();
    @Given("^: I perform GET operation for \"([^\"]*)\"$")
    public void i_perform_GET_operation_for(String arg1) throws Throwable {


    }

    @And("^:   I perform GET for the post number \"([^\"]*)\"$")
    public void i_perform_GET_for_the_post_number(String postnumber) throws Throwable {
        RegressionTestSuits.getMethod(postnumber);


    }

    @Then("^:   I should see the author name as \"([^\"]*)\"$")
    public void i_should_see_the_author_name_as(String arg1) throws Throwable {


    }
}
