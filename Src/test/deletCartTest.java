package Test;
import org.testng.annotations.Test;
import page.Homepage;
import page.cart;
import page.like;

public class deletCartTest extends TestBase{

    cart cartdelet;
    cart cartyes;
    like item;
    Homepage homepage;
    @Test
    public void Teatdeletcart()throws InterruptedException{

        homepage = new Homepage(driver);
        homepage.OpenCartPge();

    cartdelet=new cart(driver);
    cartdelet.Buttondeletitem();

    cartyes=new cart(driver);
    cartyes.Buttonyesdelet();
    }
}
