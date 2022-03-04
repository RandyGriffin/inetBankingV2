package com.inetbanking.testCases;
/*
1. Open URL
2. Enter valid UserID
3. Enter valid Password
4. Click on Login
5. Click on delete Customer Link
6. Provide Existing Customer ID
7. Click on Delete

Expected result: Customer should be deleted.

 */
import com.inetbanking.pageObjects.DeleteCustomerPage;
import com.inetbanking.pageObjects.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class TC_DeleteCustomerTest_005 extends BaseClass {
    @Test
    public void deleteCustomer() throws InterruptedException, IOException {
        LoginPage lp = new LoginPage(driver);
        lp.setUserName(username);
        logger.info("User name is provided");
        lp.setPassword(password);
        logger.info("Password is provided");
        lp.clickSubmit();

        Thread.sleep(3000);

        DeleteCustomerPage deletecust = new DeleteCustomerPage(driver);

        deletecust.clickDeleteCustomer(); //36363

        deletecust.custID("36363");

        deletecust.deletesubmit();

        Thread.sleep(2000);

    }
}
