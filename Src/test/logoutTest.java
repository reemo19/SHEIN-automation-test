package Test;

import org.testng.annotations.Test;
import page.Homepage;
import page.cart;
import page.login;

public class logoutTest extends TestBase {
    login logout;
    Homepage homepage;
    Homepage homepage2;

    @Test
    public void TestLoginPage() throws InterruptedException {

        homepage = new Homepage(driver);
        homepage.OpenLoginPage();

        logout = new login(driver);
        logout.logout();

    }
}
/*

 <class name="Test.loginTest"></class>
            <class name="Test.regTest"></class>
            <class name="Test.customerTest"></class>
            <class name="Test.cartTest"></class>
            <class name="Test.likeTest"></class>
            <class name="Test.searchTest"></class>
            <class name="Test.logoutTest"></class>
 */