package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummary extends BasePage{

    @FindBy(xpath = "//div/h2")
    public List<WebElement> accountTypes;

    @FindBy(xpath = "//div[3]//div[1]//table[1]//thead[1]//tr[1]//th")
    public List<WebElement> creditTypes;

    public WebElement link(String link){
        String xpath="//a[contains(text(),'"+link+"')]";
        return Driver.get().findElement(By.xpath(xpath));
    }

}
