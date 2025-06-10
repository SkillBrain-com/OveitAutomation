package org.skillbrain.utilities;

import org.openqa.selenium.WebDriver;
import org.skillbrain.pageObjects.PageObjectManager;

public class TestContextSetup {

    public WebDriver driver;
    public WebdriverConfiguration webdriverConfiguration;
    public PageObjectManager pageObjectManager;
    public Utils utils;

    public TestContextSetup() {
        webdriverConfiguration = new WebdriverConfiguration();
        driver = webdriverConfiguration.getWebdriver();
        pageObjectManager = new PageObjectManager(driver);
        utils = new Utils(driver);
    }


    public WebdriverConfiguration getWebdriverConfiguration() {
        return webdriverConfiguration;
    }

    public PageObjectManager getPageObjectManager() {
        return pageObjectManager;
    }
}
