package org.skillbrain.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.skillbrain.pageObjects.BundlePage;
import org.skillbrain.utilities.TestContextSetup;

public class BundleStepDefinition {

    private TestContextSetup testContextSetup;
    private BundlePage bundlePage;

    public BundleStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        bundlePage = testContextSetup.getPageObjectManager().getBundlePage();
    }

    @Given("I click on the create events button")
    public void iClickOnTheCreateEventsButton() {
        bundlePage.navigateToUrl();
    }

    @When("I complete the Overview page")
    public void iCompleteTheOverviewPage() {
    }

    @And("I create a new ticket")
    public void iCreateANewTicket(){
    }

    @When("I click on New Bundle button")
    public void iClickOnNewBundleButton() {
    }

    @And("I fill the required fields")
    public void iFillTheRequiredFields() {
    }

    @And("I click on Save button")
    public void iClickOnSaveButton() {
    }

}
