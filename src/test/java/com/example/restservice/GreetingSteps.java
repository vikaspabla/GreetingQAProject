package com.example.restservice;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONException;
import org.json.JSONObject;

import static org.assertj.core.api.Assertions.assertThat;

public class GreetingSteps {

    private Response response;

    @Given("the application is running")
    public void the_application_is_running() {
        System.out.println("The application is running");
    }
    @When("I call the endpoint with {string} as input")
    public void i_call_the_endpoint_with_input(String input) throws JSONException {
        String nameParameter = input.isEmpty() ? "World" : input;
        response = RestAssured.get("/greeting?name=" + nameParameter);
    }

    @Then("the response should contain a greeting with the provided {string}")
    public void the_response_should_contain_a_greeting_with_the_provided_input(String expect) throws JSONException {
        String responseString = response.getBody().asString();

        System.out.println("Response String: " + responseString);

        JSONObject jsonResponse = new JSONObject(responseString);
        String content = jsonResponse.getString("content");

        assertThat(content).isEqualTo(expect);

        System.out.println(content);
    }

    @And("the response status code should be {string}")
    public void theResponseStatusCodeShouldBe(String status) {
        int expectedStatusCode = Integer.parseInt(status);
        int actualStatusCode = response.getStatusCode();

        System.out.println("Response Status Code: " + actualStatusCode);

        assertThat(actualStatusCode).isEqualTo(expectedStatusCode);
    }
}
