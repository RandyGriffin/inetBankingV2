package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeleteCustomerPage {

    WebDriver ldriver;

    public DeleteCustomerPage(WebDriver rdriver) {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath="//a[normalize-space()='Delete Customer']")
    @CacheLookup
    WebElement lnkDeleteCustomer;

    @FindBy(how = How.NAME, using = "cusid")
    @CacheLookup
    WebElement txtCustomerID;

    @FindBy(how = How.NAME, using = "AccSubmit")
    @CacheLookup
    WebElement btnSubmit;



    public void clickDeleteCustomer() {
        lnkDeleteCustomer.click();

    }

    public void custID(String eID)
    {
        txtCustomerID.sendKeys(eID);
    }

    public void deletesubmit()
    {
        btnSubmit.click();
    }



}
