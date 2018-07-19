package com.flyvictor.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(xpath="//*[@ng-click='vm.login()']")
    public WebElement loginLink;
    @FindBy(id="signin-email")
    public WebElement username;
    @FindBy(id="signup-pass")
    public WebElement password;
    @FindBy(xpath="//*[@type='submit']")
    private WebElement submitLogin;

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    public void clickOnLogin() {
        loginLink.click();
    }
    public void enterSigninCredentials(String Username, String Password) {

      username.sendKeys(Username);
      password.sendKeys(Password);
    }

    public void clickLoginSubmit(){
        submitLogin.click();
    }
}
