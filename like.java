package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class like extends PageBase{

    public like(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = " //*[@id=\"7e319f2e-e485-4f92-a987-ff27c619245e\"]/a")
    public WebElement elemntwomen;
    //   MEK  xpath                //*[@id="7e319f2e-e485-4f92-a987-ff27c619245e"]/a
    //   WOM  xpath                //*[@id="25e039b2-2456-43d1-b956-d16462b7c03a"]/a
    // MEK X                      //*[@id="7e319f2e-e485-4f92-a987-ff27c619245e"]/a
    // mek css         @FindBy(css = "#7e319f2e-e485-4f92-a987-ff27c619245e")
    @FindBy (xpath = "//*[@id=\"product-list-v2\"]/div/div[2]/div[2]/section/div[1]/section[1]/div[2]/div[3]/button")
    public WebElement showitem;
     //  on          //*[@id="product-list-v2"]/div/div[2]/div[2]/section/div[1]/section[1]/div[1]/a
    //   on small          //*[@id="product-list-v2"]/div/div[2]/div[2]/section/div[1]/section[1]/div[2]/div[3]/button
     @FindBy(css = "div.goods-btn__like.goods-btn__horizontal[aria-label='SAVE']")
    public WebElement heartButton;

     public void ButtonShowItem()throws InterruptedException {
        Thread.sleep(100000);
        clickButton(elemntwomen);
        Thread.sleep(90000);
        clickButton(showitem);
    }
    public void ButtonfavItem()throws InterruptedException {
        Thread.sleep(90000);
        clickButton(heartButton);
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

public class like {
    WebDriver driver;

    @BeforeTest
    public void OpenGoogle(){
        driver = new ChromeDriver();
        driver.get("https://us.shein.com/");

    }
    @Test
    public void wishlistpage() throws InterruptedException {
        Thread.sleep(60000);
        driver.navigate().to("https://us.shein.com/user/wishlist?pf=topbar&activeTab=1");

        Thread.sleep(60000);
        WebElement showButton = driver.findElement(By.xpath("  /html/body/div[1]/div[1]/div/div[2]/div/div[3]/div/div/div/section[1]/div[2]/div[1]/a"));
       showButton.click();

        Thread.sleep(60000);
        WebElement heartButton = driver.findElement(By.xpath("//*[@id=\"ProductDetailAddBtnForFloorPrice\"]/div[1]/div/div[2]"));
        heartButton.click();

    }
}

 */
//<class name="Test.likeTest"></class>