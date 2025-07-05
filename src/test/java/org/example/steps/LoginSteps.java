package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginSteps {

    @Given("the user is on the login page")
    public void userOnLoginPage(){
        System.out.println("User is on the login page");
    }

    @When("the user enters valid credentials")
    public void userEntersValidCredentials(){
        System.out.println("User enters valid credentials");
    }

    @Then("the user should be directed to the dashboard")
    public void userIsDirectedToDashboard(){
        System.out.println("User is directed to dashboard page");
    }

}

















//    @Given("the user is on the login page")
//    public void the_user_is_on_the_login_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @When("the user enters valid credentials")
//    public void the_user_enters_valid_credentials() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("the user should be directed to the dashboard")
//    public void the_user_should_be_directed_to_the_dashboard() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }

