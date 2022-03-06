package com.inetbanking.testCases;
/*
1. Open URL
2. Enter valid UserID
3. Enter valid Password
4. Click on Login
5. Click on New Account Link
6. complete new account form
7. Click on Submit

Expected result: New Customer account should be created
 */
import com.inetbanking.pageObjects.AddAccountPage;
import com.inetbanking.pageObjects.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_AddAccountTest_006 extends BaseClass{
    @Test
    public void addAccount() throws InterruptedException, IOException {
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        logger.info("User name is provided");
        lp.setPassword(password);
        logger.info("Passsword is provided");
        lp.clickSubmit();

        Thread.sleep(1000);

        AddAccountPage addAcc = new AddAccountPage(driver);

        addAcc.clickAddNewAccount();
        logger.info("Creating customer account....");

        addAcc.custID("23184");

        addAcc.accountType("Savings");


        addAcc.custAmount("1000");

        addAcc.custSubmit();

        Thread.sleep(3000);

        logger.info("validation started....");

        boolean res=driver.getPageSource().contains("Account Generated Successfully!!!");

        if(res==true)
        {
            Assert.assertTrue(true);
            logger.info("test case passed....");

        }
        else
        {
            logger.info("test case failed....");
            captureScreen(driver,"addNewAccount");
            Assert.assertTrue(false);
        }
    }
}
