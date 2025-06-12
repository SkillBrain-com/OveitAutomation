package org.skillbrain.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class EventsPage {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//span[normalize-space()='Create event'] //parent::button")
    private WebElement createEventButton;

    public EventsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void clickOnCreateEventButton() {
        createEventButton.click();
    }

    public void checkUserIsLoggedIn() {
        wait.until(ExpectedConditions.titleIs("My events - Oveit"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://web02.stg.oveit.com/seller/events");
    }
}
