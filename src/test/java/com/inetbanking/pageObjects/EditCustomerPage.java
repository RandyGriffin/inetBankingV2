package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EditCustomerPage {
    WebDriver ldriver;

    public EditCustomerPage(WebDriver rdriver)
    {
        ldriver=rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(how = How.XPATH, using = "//a[normalize-space()='Edit Customer']")
    @CacheLookup
    WebElement lnkEditCustomer;

    @FindBy(how = How.NAME, using = "cusid")
    @CacheLookup
    WebElement txtCustomerID;

    @FindBy(how = How.NAME, using = "AccSubmit")
    @CacheLookup
    WebElement btnSubmit;



    @CacheLookup
    @FindBy(how = How.NAME, using = "addr")
    WebElement txtaddress;

    @CacheLookup
    @FindBy(how = How.NAME, using = "city")
    WebElement txtcity;

    @CacheLookup
    @FindBy(how = How.NAME, using = "state")
    WebElement txtstate;

    @CacheLookup
    @FindBy(how = How.NAME, using = "pinno")
    WebElement txtpinno;

    @CacheLookup
    @FindBy(how = How.NAME, using = "telephoneno")
    WebElement txttelephoneno;

    @CacheLookup
    @FindBy(how = How.NAME, using = "emailid")
    WebElement txtemailid;

    @CacheLookup
    @FindBy(how = How.NAME, using = "password")
    WebElement txtpassword;

    @CacheLookup
    @FindBy(how = How.NAME, using = "sub")
    WebElement btnnSubmit;

    public void clickEditCustomer()
    {
        lnkEditCustomer.click();
    }

    public void custID(String eID)
    {
        txtCustomerID.sendKeys(eID);
    }

    public void editsubmit()
    {
        btnSubmit.click();
    }

    public void editaddress(String caddress) {
        txtaddress.sendKeys(caddress);
    }

    public void editcity(String ccity) {
        txtcity.sendKeys(ccity);
    }

    public void editstate(String cstate) {
        txtstate.sendKeys(cstate);
    }

    public void editpinno(String cpinno) {
        txtpinno.sendKeys(String.valueOf(cpinno));
    }

    public void edittelephoneno(String ctelephoneno) {
        txttelephoneno.sendKeys(ctelephoneno);
    }

    public void editemailid(String cemailid) {
        txtemailid.sendKeys(cemailid);
    }

    public void editpassword(String cpassword) {
        txtpassword.sendKeys(cpassword);
    }

    public void editsub() {
        btnnSubmit.click();
    }

}
