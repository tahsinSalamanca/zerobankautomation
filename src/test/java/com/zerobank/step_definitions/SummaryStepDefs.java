package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummary;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SummaryStepDefs {
    @When("page should have the title {string}")
    public void page_should_have_the_title(String title) {
        String actualTitle= Driver.get().getTitle();

        Assert.assertEquals(title,actualTitle);
    }

    @When("the page should have to following account types")
    public void the_page_should_have_to_following_account_types(List<String> accountTypes) {
        AccountSummary accountSummary=new AccountSummary();
        List<String> actualAccountTypes= BrowserUtils.getElementsText(accountSummary.accountTypes);

        System.out.println("actualAccountTypes = " + actualAccountTypes);
        Assert.assertEquals(accountTypes,actualAccountTypes);
    }

    @Then("Credit	Accounts table must	have following")
    public void credit_Accounts_table_must_have_following(List<String> creditTable) {

        AccountSummary accountSummary=new AccountSummary();

        List<String> actualCreditTypes=BrowserUtils.getElementsText(accountSummary.creditTypes);

        Assert.assertEquals(creditTable,actualCreditTypes);
    }


}
