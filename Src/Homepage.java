package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class Homepage extends PageBase{
    public Homepage(WebDriver driver) {
        super(driver);
    }
    @FindBy ( xpath= "/html/body/div[1]/header/div[3]/div[1]/div/div[2]/div[3]/div[1]/a")
    public WebElement logimage;

    @FindBy (xpath = "/html/body/div[1]/header/div[3]/div[1]/div/div[2]/div[3]/div[2]/div/a")
    public WebElement Cartpage;

    @FindBy(xpath = "/html/body/div[1]/header/div[3]/div[1]/div/div[2]/div[3]/div[3]/a")
    public WebElement likepage;
    @FindBy(xpath = "/html/body/div[1]/header/div[3]/div[1]/div/div[2]/div[3]/div[4]/div/a")
    public WebElement customerpage;

        public void OpenLoginPage() throws InterruptedException
    {
        Thread.sleep(100000);
       logimage.click();

    }
    public void OpenCartPge()throws InterruptedException
    {
        Thread.sleep(100000);
        Cartpage.click();
        Thread.sleep(90000);
    }
    public void OpenLikePage() throws InterruptedException {
        Thread.sleep(100000);
        likepage.click();
        Thread.sleep(90000);
    }
    public void OpencustomerPage() throws InterruptedException {
          Thread.sleep(100000);
        customerpage.click();
        Thread.sleep(90000);
        // driver.navigate().to("https://us.shein.com/user/wishlist?pf=topbar&activeTab=1");
    }


}
