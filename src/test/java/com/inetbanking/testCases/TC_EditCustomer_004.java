package com.inetbanking.testCases;
/*
1. Open URL
2. Enter valid UserID
3. Enter valid Password
4. Click on Login
5. Click on Edit Customer Link
6. Provide Existing Customer ID
7. Click on Submit
8. Edit details of customer (Only Editable fields)

Expected result: Customer details should be edited.

 */
import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.EditCustomerPage;
import com.inetbanking.pageObjects.LoginPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_EditCustomer_004 extends BaseClass{

    @Test
    public void editCustomer() throws InterruptedException, IOException {
        LoginPage lp=new LoginPage(driver);
        lp.setUserName(username);
        logger.info("User name is provided");
        lp.setPassword(password);
        logger.info("Password is provided");
        lp.clickSubmit();

        Thread.sleep(3000);

        EditCustomerPage editcust=new EditCustomerPage(driver);

        editcust.clickEditCustomer(); //23184

        editcust.custID("23184");

        editcust.editsubmit();

        Thread.sleep(2000);






        logger.info("Providing customer details......");



        editcust.editaddress("USA");
        editcust.editcity("Tampa");
        editcust.editstate("FL");
        editcust.editpinno("500074");
        editcust.edittelephoneno("9878902091");

        String email=randomstring()+"@gmail.com";
        editcust.editemailid(email);
        editcust.editpassword("abcdef");
        editcust.editsub();

        Thread.sleep(6000);

        boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");

        if(res==true)
        {
            Assert.assertTrue(true);
            logger.info("test case passed....");

        }
        else
        {
            logger.info("test case failed....");
            captureScreen(driver,"addNewCustomer");
            Assert.assertTrue(false);
        }
    }


}
