package org.skillbrain.pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

    private WebDriver driver;
    private LoginPage loginPage;
    private EventsPage eventsPage;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        loginPage = new LoginPage(driver);
        return loginPage;
    }

    public EventsPage getEventsPage() {
        eventsPage = new EventsPage(driver);
        return eventsPage;
    }
}
