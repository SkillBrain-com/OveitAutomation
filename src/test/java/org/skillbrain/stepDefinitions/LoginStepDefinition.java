package org.skillbrain.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.skillbrain.pageObjects.LoginPage;
import org.skillbrain.utilities.TestContextSetup;
import org.skillbrain.utilities.Utils;

import java.io.IOException;

public class LoginStepDefinition {

    private TestContextSetup testContextSetup;
    private LoginPage loginPage;
    private Utils utils;

    public LoginStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        loginPage = testContextSetup.getPageObjectManager().getLoginPage();
        utils = testContextSetup.getUtils();
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

    @When("I fill in email field with {string}")
    public void iFillInEmailFieldWith(String input) {
        loginPage.fillInEmail(input);
    }

    @And("I fill in password with {string}")
    public void iFillInPasswordWith(String input) {
        loginPage.fillInPassword(input);
    }

    @And("I click on login button")
    public void iClickOnLoginButton() {
        loginPage.clickOnLogin();
    }

    @Then("I verify the following email error message is displayed: {string}")
    public void iVerifyTheFollowingErrorMessageIsDisplayed(String errorMessage) {
        loginPage.checkEmailErrorMessage(errorMessage);
    }

    @And("I verify the following password error message is displayed: {string}")
    public void iVerifyTheFollowingPasswordErrorMessageIsDisplayed(String errorMessage) {
        loginPage.checkPasswordErrorMessage(errorMessage);
    }
}
