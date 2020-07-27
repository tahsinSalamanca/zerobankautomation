package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivity extends BasePage{

    @FindBy(xpath = "//select[@name='accountId']")
    public WebElement AccountDropDown;

    @FindBy(xpath = "//div[@id='all_transactions_for_account']//th")
    public List<WebElement> transactionsTable;

    @FindBy(xpath = "//a[contains(text(),'Find Transactions')]")
    public WebElement FindTransactions;

    @FindBy(xpath = "//input[@id='aa_fromDate']")
    public WebElement fromDate;

    @FindBy(name = "toDate")
    public WebElement toDate;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement find;

    @FindBy(xpath = "(//table)[2]/tbody/tr/td[1]")
    public List<WebElement> resultDateList;

    @FindBy(xpath = "//input[@id='aa_description']")
    public WebElement description;

    @FindBy(xpath = "(//table)[2]/tbody/tr/td[2]")
    public List<WebElement> resultDescriptionList;

    @FindBy(id = "filtered_transactions_for_account")
    public WebElement resultMessage;

    @FindBy(xpath = "(//table)[2]/tbody/tr/td[3]")
    public List<WebElement> resultDepositList;

    @FindBy(xpath = "(//table)[2]/tbody/tr/td[4]")
    public List<WebElement> resultWithdrawalList;

    public Select getType(){
        Select type=new Select(Driver.get().findElement(By.id("aa_type")));
        return type;
    }

    public Select getAccount(){

        return new Select(AccountDropDown);
    }

}
