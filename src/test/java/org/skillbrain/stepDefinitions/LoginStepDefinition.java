package org.skillbrain.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.skillbrain.pageObjects.LoginPage;
import org.skillbrain.utilities.TestContextSetup;

public class LoginStepDefinition {

    private TestContextSetup testContextSetup;
    private LoginPage loginPage;

    public LoginStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        loginPage = testContextSetup.getPageObjectManager().getLoginPage();
    }

    @Given("I login with {string} credentials")
    public void iLoginWithValidCredentials(String credentials) {
        loginPage.navigateToUrl();
    }

    @When("I go to checkout page")
    public void i_go_to_checkout_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
