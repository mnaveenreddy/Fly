package com.flyvictor.stepdefinitions;

import com.flyvictor.pages.LoginPage;
import com.flyvictor.testbase.SharedDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class LoginStepDefinistions{
    LoginPage loginPageObject;

    public LoginStepDefinistions(SharedDriver driver, LoginPage loginPage) throws Exception {
        this.loginPageObject = loginPage;
        // you can now accees the driver object here directly if you need to. Pico container will make it available in all your stepdef
    }

    @Given("^a browser is at victor homepage$")
    public void a_browser_is_at_victor_homepage() throws Throwable {
        loginPageObject.load();
    }

    @When("^a user click on login link$")
    public void a_user_click_on_login_link() throws Throwable {
        loginPageObject.clickOnLogin();
    }

    @When("^a user enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void a_user_enter_and(String Username, String Password) throws Throwable {
        loginPageObject.enterSigninCredentials(Username, Password);
    }

    @Then("^a user click on sign in button$")
    public void a_user_navigates_to_his_personal_homepage() throws Throwable {
       loginPageObject.clickLoginSubmit();
    }
}

