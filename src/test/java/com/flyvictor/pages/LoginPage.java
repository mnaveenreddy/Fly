package com.flyvictor.pages;

import com.flyvictor.testbase.SharedDriver;
import com.flyvictor.testbase.TestBase;
import cucumber.api.java.gl.E;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage {


    @FindBy(xpath="//*[@ng-click='vm.login()']")
    public WebElement loginLink;
    @FindBy(id="signin-email") public WebElement username;
    @FindBy(id="signup-pass")  public WebElement password;
    @FindBy(xpath="//*[@type='submit']") private WebElement submitLogin;
    private WebDriver driver;

    public LoginPage(WebDriver driver) throws Exception
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void load(){
        driver.get("https://flyvictor.com/");
    }
    public void clickOnLogin(){
        loginLink.click();}
    public void enterSigninCredentials(String Username, String Password) throws IOException {

      username.sendKeys(Username);
      password.sendKeys(Password);

    }
    public void clickLoginSubmit(){
        submitLogin.click();
    }
}
