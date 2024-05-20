package Test;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import page.*;

public class regTest extends TestBase{
    login cont;
    login email;
    login pass;
    login loginbut;
    login iamge;
    Homepage homepage;
    @Test
    public void TestLoginPage() throws InterruptedException {
        homepage=new Homepage(driver);
        homepage.OpenLoginPage();

        email=new login(driver);
        email.writeemail("Studentteam2023@gmail.com");

        cont=new login(driver);
        cont.conButton();

        pass=new login(driver);
        pass.setpasslogin("WEAREJUSTAGIRL5");

        loginbut=new login(driver);
        loginbut.loginButton();
    }

}
