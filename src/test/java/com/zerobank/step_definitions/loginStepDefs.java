package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginStepDefs {
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {


        Driver.get().get(ConfigurationReader.get("url"));

    }

    @When("user logs {string} {string}")
    public void user_logs(String user, String password) {
        LoginPage loginPage=new LoginPage();
        loginPage.login(user, password);
    }

    @Then("the user should be on {string}")
    public void the_user_should_be_on(String string) {
        String expectedurl="http://zero.webappsecurity.com/bank/account-summary.html";
        String actualurl=Driver.get().getCurrentUrl();

        String title=Driver.get().getTitle();
        System.out.println("title = " + title);
        Assert.assertEquals(expectedurl,actualurl);
    }

    @Then("user should see {string}")
    public void user_should_see(String errorMessage) {
        String actualErrorMessage=new LoginPage().errorMessage.getText();

        Assert.assertEquals(errorMessage,actualErrorMessage);
    }

}
