package Test;

import org.testng.annotations.Test;
import page.*;

public class likeTest extends TestBase{
    page.cart cart;
    like like;
    like likeB;
    page.login login;
    page.search search;

    Homepage homepage;

    @Test
    public void TestLikepage() throws InterruptedException {
    //   like=new like(driver);
    //    like.ButtonShowItem();

        cart=new cart(driver);
        cart.Buttoncartitem();

        likeB=new like(driver);
        likeB.ButtonfavItem();

        homepage=new Homepage(driver);
        homepage.OpenLikePage();

    }
}
