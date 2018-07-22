package com.flyvictor.testbase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ChromeBrowser extends ChromeDriver {
    public static WebDriver buildChromeBrowser() throws Throwable {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/java/com/flyvictor/drivers/chromedriver");
        ChromeBrowser browser = new ChromeBrowser();
        return browser;
    }

    private ChromeBrowser() {
        super();
    }
}