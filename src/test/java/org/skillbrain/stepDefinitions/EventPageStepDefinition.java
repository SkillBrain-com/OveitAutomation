package org.skillbrain.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.skillbrain.pageObjects.EventsPage;
import org.skillbrain.utilities.TestContextSetup;

public class EventPageStepDefinition {

    private TestContextSetup testContextSetup;
    private EventsPage eventsPage;


    public EventPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.eventsPage = testContextSetup.getPageObjectManager().getEventsPage();
    }

    @When("I click on the create events button")
    public void iClickOnTheCreateEventsButton() {
        eventsPage.clickOnCreateEventButton();
    }

    @Then("I check user is logged in")
    public void iCheckUserIsLoggedIn() {
        eventsPage.checkUserIsLoggedIn();
    }
}
