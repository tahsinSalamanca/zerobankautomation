package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement username;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement userpassword;

    @FindBy(xpath = "//input[@name='submit']")
    public WebElement login;

    @FindBy(css = "div.alert.alert-error")
    public WebElement errorMessage;

    public void login(String user, String password){
        username.sendKeys(user);
        userpassword.sendKeys(password);
        login.click();

    }
}
