package com.flyvictor.stepdefinitions;

import com.flyvictor.pages.LoginPage;
import com.flyvictor.testbase.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStep{
    TestBase testBase;
    private LoginPage loginPage;

    public LoginStep(TestBase TestBase) {
        this.testBase = TestBase;
        this.loginPage = new LoginPage(testBase.getChromeDriver());
    }

    @Given("^a browser is at victor homepage$")
    public void a_browser_is_at_victor_homepage() throws Throwable {
        testBase.Initialized();
        testBase.openBrowser("browser");
        testBase.navigate("url");
    }

    @When("^a user click on login link$")
    public void a_user_click_on_login_link() throws Throwable {
        loginPage.clickOnLogin();
    }

    @When("^a user enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void a_user_enter_and(String Username, String Password) throws Throwable
    {
        loginPage.enterSigninCredentials(Username, Password);
    }

    @Then("^a user click on sign in button$")
    public void a_user_navigates_to_his_personal_homepage() throws Throwable {
        loginPage.clickLoginSubmit();
    }
}

