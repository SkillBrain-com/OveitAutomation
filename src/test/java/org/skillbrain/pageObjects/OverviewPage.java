package org.skillbrain.pageObjects;

import net.bytebuddy.utility.RandomString;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.skillbrain.utilities.TestContextSetup;
import org.skillbrain.utilities.WebdriverConfiguration;
import org.testng.Assert;

import java.time.Duration;
import java.time.LocalDate;
import java.util.Random;

public class OverviewPage {
    private WebDriver driver;
    private static final String OVERVIEW_URL = "https://web02.stg.oveit.com/seller/events_new/edit?id=8500";
    private WebDriverWait wait;


    @FindBy(xpath = "//label[contains(.,\"Event name\")] //following-sibling::input")
    private WebElement eventNameTextBox;
    @FindBy(xpath = "//input[@name=\"start_date\"]")
    private WebElement startDatePicker;
    @FindBy(xpath = "//input[@name=\"start_time\"]")
    private WebElement startTimePicker;
    @FindBy(xpath = "//input[@name=\"end_time\"]")
    private WebElement endTimePicker;
    @FindBy(xpath = "//input[@name=\"end_date\"]")
    private WebElement endDatePicker;
    @FindBy(xpath = "//div[@class=\"optional-section well\"][1]")
    private WebElement locationButton;
    @FindBy(xpath = "//input[@name=\"location\"]")
    private WebElement locationTextBox;
    @FindBy(xpath = "//span[contains(.,'Next')]")
    private WebElement nextButton;
    @FindBy(xpath = "//a[contains(.,\"Tickets\")]")
    private WebElement ticketsLink;

    public OverviewPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void enterEventName(){
        eventNameTextBox.clear();
        eventNameTextBox.sendKeys(RandomStringUtils.randomAlphabetic(10));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public String enterStartDate(String credentials) {
        if (credentials.equalsIgnoreCase("valid")) {
            // TODO  - implement
        } else {
//            Random r = new Random();
//            int low = 1916;
//            int high = 2025;
//            int year = r.nextInt(high-low) + low;
//            int month = r.nextInt(1,12);
//            int day = r.nextInt(1,31);
//            String format = String.valueOf(year) + "-" + String.valueOf(month) + "-" + String.valueOf(day);
//            startDatePicker.clear();
//            startDatePicker.sendKeys(format);
//            return format;
              startDatePicker.clear();
              startDatePicker.sendKeys("1916-05-28");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    public void enterEndDate(String credentials) {
        if (credentials.equalsIgnoreCase("valid")) {
            // TODO  - implement
        } else {
            // TODO  - implement
            endDatePicker.clear();
            endDatePicker.sendKeys("1916-05-29");
            endDatePicker.clear();
            endDatePicker.sendKeys("1916-05-29");
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void enterStartTime(String credentials) {
        if (credentials.equalsIgnoreCase("valid")) {
//            startTimePicker.clear();
//            int r = new Random().nextInt(9);
//            startTimePicker.sendKeys(r + r + ":" + r + r);
              startTimePicker.clear();
              startTimePicker.sendKeys("00:00");
        } else {
            // TODO  - implement
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void enterEndTime(String credentials) {
        if (credentials.equalsIgnoreCase("valid")) {
            startTimePicker.clear();
            startTimePicker.sendKeys("01:00");
            startTimePicker.clear();
            startTimePicker.sendKeys("01:00");
        } else {
            // TODO  - implement
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void enterLocation(String credentials) {
        if (credentials.equalsIgnoreCase("valid")) {
            locationButton.click();
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            locationTextBox.clear();
            locationTextBox.sendKeys(RandomStringUtils.randomAlphabetic(10));
        } else {
            // TODO  - implement
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void clickNextButton() {
        Actions action = new Actions(driver);
        action.moveToElement(nextButton).click().build().perform();
    }
    public void checkUserLandOnTicketsPage() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        wait.until(ExpectedConditions.titleIs("Tickets - Oveit"));
        Assert.assertEquals(driver.getCurrentUrl(), ticketsLink.getAttribute("href"));
    }
}
