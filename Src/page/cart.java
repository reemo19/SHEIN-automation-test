package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class cart extends PageBase{

    public cart(WebDriver driver) {
        super(driver);
       // wait=new WebDriverWait(driver, Duration.ofSeconds(30));
    }
     @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[3]/div[1]/div[1]/div/div/div/div/div/div[2]/div/div/div[2]/button")
     public WebElement shopnowButton;
  //  @FindBy(xpath = "//*[@id=\"7e319f2e-e485-4f92-a987-ff27c619245e\"]/a")
  @FindBy(xpath = "/html/body/div[17]/div[2]/div/div[2]/div/div[2]/div[3]/div[2]/span[1]/div")
  public WebElement sizeButton ;



    @FindBy(xpath = " //*[@id=\"7e319f2e-e485-4f92-a987-ff27c619245e\"]/a")
    //@FindBy(css = "a.j-hotZone.block[data-v-443fef66]")
    public WebElement elemntwomen;
    @FindBy(xpath="//*[@id=\"product-list-v2\"]/div/div[2]/div[2]/section/div[1]/section[1]/div[2]/div[3]/button")
    public WebElement cartButton;
    //            //*[@id="product-list-v2"]/div/div[2]/div[2]/section/div[1]/section[1]/div[2]/div[3]/button
    //           //*[@id="product-list-v2"]/div/div[2]/div[2]/section/div[1]/section[2]/div[1]/a

    @FindBy(css = "button.goods-btn__add.goods-btn__horizontal")
    public WebElement addButton ;

    /////////////////////////////////////////////////////////

    public void Buttonshopnow() throws InterruptedException {
        Thread.sleep(50000);
        clickButton(shopnowButton);
    }
     //small in every item
    public void Buttoncartitem() throws InterruptedException {
        Thread.sleep(50000);
        clickButton(elemntwomen);

        Thread.sleep(50000);
        clickButton(cartButton);
    }

    public void Buttonadditem() throws InterruptedException {
        Thread.sleep(50000);
        clickButton(addButton);
       // Thread.sleep(90000);
    }

    public void Buttonsizeitem()
    {
        clickButton(sizeButton);
    }
    ///////////////////////////////////////////////////////////////

    @FindBy(xpath ="/html/body/div[1]/div[1]/div/div[3]/div[1]/div/div[1]/div[2]/div/div/div[3]/div[3]/ul/li[2]/div[3]/div/div/div[2]/span[3]" )
    public  WebElement deletButton;
    @FindBy(xpath = "//*[@id=\"sui-to-body-container\"]/div/div/div/div/button[2]")
    public WebElement yesButton ;

    public void Buttondeletitem()
    {
        clickButton(deletButton);
    }
    public void Buttonyesdelet()
    {
        clickButton(yesButton);
    }

}





















/*


package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class cart {
    WebDriver driver;
    @BeforeTest
    public void OpenGoogle(){
        driver = new ChromeDriver();
        driver.get("https://us.shein.com/");
    }

    @Test(priority=-1)
    public void cartpage() throws InterruptedException {
        Thread.sleep(100000);
        driver.navigate().to("https://us.shein.com/cart");

        Thread.sleep(100000);
        WebElement shopallButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[3]/div[1]/div[1]/div/div/div/div/div/div[2]/div/div/div[2]/button"));
        shopallButton.click();
    }

    @Test
    public void additem() throws InterruptedException {
        Thread.sleep(100000);
        WebElement cartButton = driver.findElement(By.xpath("//*[@id=\"product-list-v2\"]/div/div[2]/div[2]/section/div[1]/section[2]/div[2]/div[3]/button"));
        cartButton.click();

        //size
        Thread.sleep(100000);
        WebElement sizeButton = driver.findElement(By.xpath("/html/body/div[17]/div[2]/div/div[2]/div/div[2]/div[3]/div[2]/span[1]/div"));
        sizeButton.click();

        Thread.sleep(100000);
        WebElement addButton = driver.findElement(By.xpath("/html/body/div[18]/div[2]/div/div[2]/div/div[2]/div[7]/div[1]/div[2]/div[1]/button[2]"));
         addButton.click();
         }

@Test
    public void deletitem() throws InterruptedException {
    Thread.sleep(5000);
    driver.navigate().to("https://us.shein.com/cart");

    Thread.sleep(5000);
    WebElement deletButton = driver.findElement(By.xpath("  /html/body/div[1]/div[1]/div/div[3]/div[1]/div/div[1]/div[2]/div/div/div[3]/div[3]/ul/li[2]/div[3]/div/div/div[2]/span[3]"));
    deletButton.click();
    Thread.sleep(5000);
    WebElement yesButton = driver.findElement(By.xpath("//*[@id=\"sui-to-body-container\"]/div/div/div/div/button[2]"));
    yesButton.click();
}


 }

 */
