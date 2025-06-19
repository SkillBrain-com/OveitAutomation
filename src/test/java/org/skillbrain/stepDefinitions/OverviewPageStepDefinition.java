package org.skillbrain.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.skillbrain.pageObjects.OverviewPage;
import org.skillbrain.utilities.TestContextSetup;

public class OverviewPageStepDefinition {
    private TestContextSetup testContextSetup;
    private OverviewPage overviewPage;

    public OverviewPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        overviewPage = testContextSetup.getPageObjectManager().getOverviewPage();
    }

    @And("I enter the name of this event.")
    public void iEnterTheNameOfThisEvent() {
        overviewPage.enterEventName();
    }

    @And("I enter a {string} start date of this event.")
    public void iEneterATheStartDateOfThisEvent(String credentials) {
        overviewPage.enterStartDate(credentials);
    }

    @And("I enter a {string} start time of this event.")
    public void iEnterATheStartTimeOfThisEvent(String credentials) {
        overviewPage.enterStartTime(credentials);
    }

    @And("I enter a {string} end date of this event.")
    public void iEnterATheEndDateOfThisEvent(String credentials) {
        overviewPage.enterEndDate(credentials);
    }

    @And("I enter a {string} end time of this event.")
    public void iEnterATheEndTimeOfThisEvent(String credentials) {
        overviewPage.enterEndTime(credentials);
    }

    @And("I enter a {string} location of this event.")
    public void iEnterALocationOfThisEvent(String credentials) {
        overviewPage.enterLocation(credentials);
    }

    @Then("I click on the Next button")
    public void iClickOnTheNextButton() {
        overviewPage.clickNextButton();
    }

    @Then("I check user land on Tickets page")
    public void iCheckUserLandOnTicketsPage() {
        overviewPage.checkUserLandOnTicketsPage();
    }
}
