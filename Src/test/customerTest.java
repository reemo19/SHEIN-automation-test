package Test;

import org.testng.annotations.Test;
import page.Homepage;
import page.like;
import page.customer;
import page.login;

public class customerTest extends TestBase{
    customer customer;
    Homepage homepage;
    Homepage homepagelog;
    @Test
    public void TestCustomerpage() throws InterruptedException {

        homepage=new Homepage(driver);
        homepage.OpencustomerPage();

        customer=new customer(driver);
        customer.setEntermsg("my order is too late");



    }
}
