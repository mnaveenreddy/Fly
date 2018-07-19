package com.flyvictor.pages;

import com.flyvictor.testbase.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class LoginPage extends TestBase {
    public LoginPage()
    {
        PageFactory.initElements(driver,this);
    }



    @FindBy(xpath="//*[@ng-click='vm.login()']")  public WebElement loginLink;
    @FindBy(id="signin-email") public WebElement username;
    @FindBy(id="signup-pass")  public WebElement password;

    @FindBy(xpath="//*[@type='submit']") private WebElement submitLogin;


    public void clickOnLogin(){ loginLink.click();}
    public void enterSigninCredentials(String Username, String Password) throws IOException {

      username.sendKeys(Username);
      password.sendKeys(Password);

    }
    public void clickLoginSubmit(){
        submitLogin.click();
    }
}
