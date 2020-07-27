package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PayBills extends BasePage{
    @FindBy(css = "div#alert_content")
    public WebElement paymemntMessage;

    @FindBy(xpath = "//input[@id='sp_amount']")
    public WebElement amountInput;

    @FindBy(xpath = "//input[@id='sp_date']")
    public WebElement date;

    @FindBy(xpath = "//input[@id='sp_description']")
    public WebElement description;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submit;

    @FindBy(xpath = "//input[@id='sp_amount']")
    public WebElement amount;

    @FindBy(xpath = "//a[@href='#ui-tabs-2']")
    public WebElement AddNewPayee;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement PayeeName;

    @FindBy(css = "#np_new_payee_address")
    public WebElement PayeeAddress;

    @FindBy(css = "#np_new_payee_account")
    public WebElement PayeeAccount;

    @FindBy(css = "#np_new_payee_details")
    public WebElement PayeeDetails;

    @FindBy(css = "#add_new_payee")
    public WebElement Add;

    @FindBy(css = "div#alert_content")
    public  WebElement TheMessage;

    @FindBy(xpath = "//a[@href='#ui-tabs-3']")
    public WebElement PurchaseForeignCurrency;

    @FindBy(id = "pc_currency")
    public List<WebElement> currency;

    @FindBy(id = "pc_calculate_costs")
    public WebElement calculateCost;


    public Select getCurrencyList(){
        Select currency=new Select(Driver.get().findElement(By.id("pc_currency")));
        return currency;
    }
}
