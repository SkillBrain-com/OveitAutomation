package org.skillbrain.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    // injected
    private WebDriver driver;
    private static final String HOME_URL = "https://web02.stg.oveit.com/seller/login";


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }


    public void navigateToUrl() {
        driver.get(HOME_URL);
    }

}
