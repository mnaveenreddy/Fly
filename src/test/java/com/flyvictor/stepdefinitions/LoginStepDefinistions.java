package com.flyvictor.stepdefinitions;

import com.flyvictor.pages.LoginPage;
import com.flyvictor.testbase.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStepDefinistions{
    TestBase t= new TestBase();
    LoginPage loginPageObject;



    @Given("^a browser is at victor homepage$")
    public void a_browser_is_at_victor_homepage() throws Throwable {
        t.Initialized();
        t.openBrowser("browser");
        t.navigate("url");
        this.loginPageObject =new LoginPage();
    }

    @When("^a user click on login link$")
    public void a_user_click_on_login_link() throws Throwable {

        loginPageObject.clickOnLogin();
    }

    @When("^a user enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void a_user_enter_and(String Username, String Password) throws Throwable
    {
        loginPageObject.enterSigninCredentials(Username, Password);
    }

    @Then("^a user click on sign in button$")
    public void a_user_navigates_to_his_personal_homepage() throws Throwable {
       loginPageObject.clickLoginSubmit();
    }
}

