package Test;

import org.testng.annotations.Test;
import page.*;

public class cartTest extends TestBase{
    cart cartshop;
    cart cartimage;
    cart cartsize;
    cart cartadd;
    cart cartdelet;
    cart cartyes;
    like item;
    Homepage homepage;
    Homepage homepage2;
    @Test
    public void Testcartpage() throws InterruptedException{

        cartimage=new cart(driver);
        cartimage.Buttoncartitem();

        cartadd = new cart(driver);
        cartadd.Buttonadditem();

    }
}
