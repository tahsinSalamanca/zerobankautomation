package com.zerobank.step_definitions;

import com.zerobank.pages.PayBills;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import java.util.List;
import java.util.Map;

public class PayBillsSpetDefs {
    PayBills payBills2=new PayBills();

    @When("user completes Pay operation with {string} {string} {string}")
    public void user_completes_Pay_operation_with(String amount, String date, String descrp) {

        PayBills payBills=new PayBills();
        payBills.amountInput.sendKeys(amount);
        payBills.date.sendKeys(date);
        payBills.description.sendKeys(descrp);
        payBills.submit.click();
     }

    @Then("{string} should be displayed")
    public void should_be_displayed(String paymentMessage) {
        PayBills payBills=new PayBills();
        String actualMessage=payBills.paymemntMessage.getText();
        Assert.assertEquals(paymentMessage,actualMessage);
    }

    @Then("{string} wrong should be displayed")
    public void wrong_should_be_displayed(String wrongMessage) {
        BrowserUtils.waitFor(2);
        new PayBills().submit.click();
        BrowserUtils.waitFor(1);


        try{
            Alert alert = Driver.get().switchTo().alert();
            String actualPopMessage=alert.getText();
            System.out.println("actualPopMessage try = " + actualPopMessage);
        }catch (Exception e){
            Alert alert = Driver.get().switchTo().alert();
            String actualPopMessage=alert.getText();
            System.out.println("actualPopMessage catch = " + actualPopMessage);
        }finally {
            Alert alert = Driver.get().switchTo().alert();
            String actualPopMessage=alert.getText();
            System.out.println("actualPopMessage finally = " + actualPopMessage);
        }

        String message=new PayBills().amount.getAttribute("required");
        System.out.println(message);
    }

    @Then("Add New Payee tab")
    public void add_New_Payee_tab() {
        BrowserUtils.waitFor(2);
        payBills2.AddNewPayee.click();
    }


    @Then("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String, String > info) {
        BrowserUtils.waitFor(3);
        payBills2.PayeeName.sendKeys(info.get("Payee Name"));
        payBills2.PayeeAddress.sendKeys(info.get("Payee Address"));
        payBills2.PayeeAccount.sendKeys(info.get("Account"));
        payBills2.PayeeDetails.sendKeys(info.get("Payee details"));
        payBills2.Add.click();


    }

    @Then("message {string} should be displayed")
    public void message_should_be_displayed(String message) {
        BrowserUtils.waitFor(2);
        String actualmessage=payBills2.TheMessage.getText();
        Assert.assertEquals(message,actualmessage);
    }

    @When("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_Purchase_foreign_currency_cash_tab() {
        payBills2.PurchaseForeignCurrency.click();
        BrowserUtils.waitFor(3);
    }

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> expectedCurrency) {
        List<String> actualCurrency=BrowserUtils.getElementsText(payBills2.currency);
        System.out.println("actualCurrency = " + actualCurrency);
       // Assert.assertEquals(expectedCurrency,actualCurrency);
//        for (String s : expectedCurrency) {
//            Assert.assertTrue(actualCurrency.contains(s));
//        }

    }

    @When("user tries to calculate cost without selecting a currency")
    public void user_tries_to_calculate_cost_without_selecting_a_currency() {
        payBills2.calculateCost.click();
    }

    @Then("error message should be {string} displayed")
    public void errorMessageShouldBeDisplayed(String expectedError) {
        Alert alert=Driver.get().switchTo().alert();
        String actualError=alert.getText();
        Assert.assertEquals(expectedError,actualError);
        BrowserUtils.waitFor(2);
        alert.accept();
    }
}
