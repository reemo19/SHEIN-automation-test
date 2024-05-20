package Test;

import org.testng.annotations.Test;
import page.*;

public class loginTest extends TestBase{
    cart cart;
    like like;
    login cont;
    login email;
    login pass;
    login women;
    login confirm;
    login loginbut;
    search search;

    Homepage homepage;

    @Test
    public void TestLoginPage()throws InterruptedException {
       // homepage=new Homepage(driver);
        //Thread.sleep(60000);
        //homepage.OpenLoginPage();
        homepage=new Homepage(driver);
        homepage.OpenLoginPage();

        email =new login(driver);
        email.writeemail("fevoyim827@godsigma.com");
        cont=new login(driver);
        cont.conButton();
        pass=new login(driver);
        pass.writepassReg("WEAREJUSTAGIRL5");
        women=new login(driver);
        women.WomenButton();
        confirm=new login(driver);
        confirm.setConfirmButton();
        loginbut=new login(driver);
        loginbut.RegButton();
    }

}
