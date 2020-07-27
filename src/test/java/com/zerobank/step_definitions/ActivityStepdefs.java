package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.pages.AccountSummary;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class ActivityStepdefs {
    @When("navigate to {string}")
    public void navigate_to(String tab) {
        AccountActivity accountActivity=new AccountActivity();
        accountActivity.navigateToTab(tab);
        BrowserUtils.waitFor(3);
    }

    @When("the	Account	drop	down	default	option	should	be	{string}")
    public void the_Account_drop_down_default_option_should_be(String defaultOption) {
        AccountActivity accountActivity=new AccountActivity();
        String firstSelection=accountActivity.getAccount().getFirstSelectedOption().getText();
        Assert.assertEquals(defaultOption,firstSelection);
    }

    @Then("drop down should have	the following options")
    public void drop_down_should_have_the_following_options(List<String> expecteddropDown) {
        AccountActivity accountActivity=new AccountActivity();
        List<String> actualDropDownlist= BrowserUtils.getElementsText(accountActivity.getAccount().getOptions());
        Assert.assertEquals(expecteddropDown,actualDropDownlist);
    }

    @Then("Transactions	table	should	have following")
    public void transactions_table_should_have_following(List<String> dropDownTable) {
        AccountActivity accountActivity=new AccountActivity();
        List<String> actualDpDList=BrowserUtils.getElementsText(accountActivity.transactionsTable);
        Assert.assertEquals(dropDownTable,actualDpDList);
    }

    @When("the user clicks on {string} link on the Account Summary page")
    public void the_user_clicks_on_link_on_the_Account_Summary_page(String linkName) {
        AccountSummary accountSummary=new AccountSummary();
        accountSummary.link(linkName).click();
    }

}
