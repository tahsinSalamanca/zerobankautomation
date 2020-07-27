package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class FindTransactions {
    AccountActivity accountActivity=new AccountActivity();

    @Then("the user accesses the Find Transactions tab")
    public void the_user_accesses_the_Find_Transactions_tab() {

        accountActivity.FindTransactions.click();
        BrowserUtils.waitFor(3);
    }

    @When("the user enters date range from {string} to {string}")
    public void the_user_enters_date_range_from_to(String date1, String date2) {

        accountActivity.fromDate.sendKeys(date1);
        accountActivity.toDate.sendKeys(date2);
    }

    @When("clicks search")
    public void clicks_search() {
        accountActivity.find.click();
        BrowserUtils.waitFor(3);
    }

    @Then("results table should only show transactions dates between {string} to {string}")
    public void results_table_should_only_show_transactions_dates_between_to(String date1, String date2) {

        List<String> resultDate= BrowserUtils.getElementsText(accountActivity.resultDateList);
        Assert.assertEquals(date1,resultDate.get(resultDate.size()-1));
        Assert.assertEquals(date2,resultDate.get(0));
    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() throws ParseException {
        List<String> resultDate=BrowserUtils.getElementsText(accountActivity.resultDateList);

    }

    @Then("the results table should only not contain transactions dated {string}")
    public void the_results_table_should_only_not_contain_transactions_dated(String date) {
        List<String> resultDate=BrowserUtils.getElementsText(accountActivity.resultDateList);
        Assert.assertFalse(resultDate.contains(date));
    }

    @Then("the user enters description {string}")
    public void the_user_enters_description(String string) {
        accountActivity.description.sendKeys(string);

    }

    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String string) {
        List<String> resulDescriptiontDate=BrowserUtils.getElementsText(accountActivity.resultDescriptionList);
        String desc=resulDescriptiontDate.get(0);

        Assert.assertTrue(desc.contains(string));
    }



    @Then("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String string) {
        List<String> resulDescriptiontDate=BrowserUtils.getElementsText(accountActivity.resultDescriptionList);
        String desc=resulDescriptiontDate.get(0);
        Assert.assertTrue(desc.contains(string));
    }

    @Then("clean description")
    public void clean_description() {
        accountActivity.description.clear();
        BrowserUtils.waitFor(2);
    }


    @Then("the result is displayed {string}")
    public void theResultIsDisplayed(String rsltMessage) {
        String result=accountActivity.resultMessage.getText();
        Assert.assertEquals(rsltMessage,result);

    }
    @Then("results table should show at least one result under Deposit")
    public void results_table_should_show_at_least_one_result_under_Deposit() {
        List<String> resultDepositDate=BrowserUtils.getElementsText(accountActivity.resultDepositList);
        int sum=0;
        for (String s : resultDepositDate) {
            if(s.isEmpty()){
            }else {
                sum++;
            }
        }
        Assert.assertEquals(2,sum);
    }

    @Then("results table should show at least one result under Withdrawal")
    public void results_table_should_show_at_least_one_result_under_Withdrawal() {
        List<String> resultWithdrawDate=BrowserUtils.getElementsText(accountActivity.resultWithdrawalList);
        int sum=0;
        for (String s : resultWithdrawDate) {
            if(s.isEmpty()){
              }else {
                sum++;
            }
        }
        Assert.assertEquals(1,sum);
    }

    @When("user selects type {string}")
    public void user_selects_type(String deposit) {
        accountActivity.getType().selectByVisibleText(deposit);
    }

    @Then("results table should show no result under Withdrawal")
    public void results_table_should_show_no_result_under_Withdrawal() {
        List<String> resultWithdrawDate=BrowserUtils.getElementsText(accountActivity.resultWithdrawalList);
        Assert.assertFalse(resultWithdrawDate.isEmpty());
    }

    @Then("results table should show no result under Deposit")
    public void results_table_should_show_no_result_under_Deposit() {
        List<String> resultDepositDate=BrowserUtils.getElementsText(accountActivity.resultDepositList);
        Assert.assertFalse(resultDepositDate.isEmpty());
    }

}
