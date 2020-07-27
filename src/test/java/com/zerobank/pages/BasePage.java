package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {







    public void navigateToTab(String tab){
        String xpath="//a[contains(text(),'"+tab+"')]";
        Driver.get().findElement(By.xpath(xpath)).click();
    }

    public BasePage(){PageFactory.initElements(Driver.get(),this); }
}
