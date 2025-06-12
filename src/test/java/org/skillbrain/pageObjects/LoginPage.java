package org.skillbrain.pageObjects;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.Properties;

public class LoginPage {

    // injected
    private WebDriver driver;
    private static final String HOME_URL = "https://web02.stg.oveit.com/seller/login";
    private WebDriverWait wait;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailTextbox;
    @FindBy(xpath = "//input[@id='password']")
    private WebElement passwordTextbox;
    @FindBy(xpath = "//span[contains(.,'Login')] //parent::button")
    private WebElement loginButton;
    @FindBy(css = ".toastify.on.danger.toastify-right.toastify-bottom")
    private WebElement errorPopup;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    public void loginWithCredentials(String credentials) throws IOException {
        fillinUserDetails(credentials);
        loginButton.click();
    }

    public void checkErrorMessage() {
        wait.until(ExpectedConditions.visibilityOf(errorPopup));
        Assert.assertTrue(errorPopup.isDisplayed());
    }


    private void fillinUserDetails(String credentials) throws IOException {
        Properties properties = new Properties();
        properties.load(Files.newInputStream(Paths.get(System.getProperty("user.dir") + "/src/test/resources/credentials.properties")));
        String email = properties.getProperty("useremail");
        String password = properties.getProperty("password");

        if (credentials.equalsIgnoreCase("valid")) {
            // TODO  - implement
            emailTextbox.sendKeys(email);
            passwordTextbox.sendKeys(password);
        } else {
            String randomEmail = RandomStringUtils.randomAlphanumeric(10) + "@yahoo.com";
            emailTextbox.sendKeys(randomEmail);
            passwordTextbox.sendKeys(RandomStringUtils.randomAlphanumeric(10));
        }
    }

    public void navigateToUrl() {
        driver.get(HOME_URL);
        wait.until(ExpectedConditions.titleIs("Organizer login - Oveit"));
        Assert.assertEquals(driver.getCurrentUrl(), HOME_URL);
    }

}
