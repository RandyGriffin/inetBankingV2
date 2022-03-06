package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddAccountPage {
    WebDriver ldriver;

    public AddAccountPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath="//a[normalize-space()='New Account']")
    @CacheLookup
    WebElement lnkAddNewAccount;

    @FindBy(xpath="//input[@name='cusid']")
    @CacheLookup
    WebElement cusid;

    @FindBy(xpath="//select[@name='selaccount']")
    @CacheLookup
    WebElement savings;

   /// @FindBy(xpath="//input[@name='inideposit']")
   // @CacheLookup
   // WebElement inideposit;

    @FindBy(xpath="/html[1]/body[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[2]/input[1]")
    @CacheLookup
    WebElement inideposit;

    @FindBy(xpath="//input[@name='button2']")
    @CacheLookup
    WebElement button2;



    public void clickAddNewAccount() {
        lnkAddNewAccount.click();

    }

    public void custID(String cID) {
        cusid.sendKeys(cID);

    }

    public void accountType(String cType)
    {
        savings.click();
    }



    public void custAmount(String cAmount)
    {
        inideposit.sendKeys(cAmount);
    }

    public void custSubmit()
    {
        button2.click();
    }
}
