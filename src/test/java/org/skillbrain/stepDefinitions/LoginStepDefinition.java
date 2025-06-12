package org.skillbrain.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.skillbrain.pageObjects.LoginPage;
import org.skillbrain.utilities.TestContextSetup;

import java.io.IOException;

public class LoginStepDefinition {

    private TestContextSetup testContextSetup;
    private LoginPage loginPage;

    public LoginStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        loginPage = testContextSetup.getPageObjectManager().getLoginPage();
    }

    @Given("I login with {string} credentials")
    public void iLoginWithValidCredentials(String credentials) throws IOException {
        loginPage.loginWithCredentials(credentials);
    }

    @Given("I navigate to Oveit link")
    public void iNavigateToOveitLink() {
        loginPage.navigateToUrl();
    }

    @Then("The login error message is displayed")
    public void theLoginErrorMessageIsDisplayed() {
        loginPage.checkErrorMessage();
    }
}
