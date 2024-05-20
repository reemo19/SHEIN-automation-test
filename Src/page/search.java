package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class search extends PageBase{

    public search(WebDriver driver)
    {
        super(driver);
    }

   @FindBy (xpath="/html/body/div[1]/header/div[3]/div[1]/div/div[2]/div[2]/form/div[1]")
   public WebElement searchinput;

   @FindBy (xpath="/html/body/div[1]/header/div[3]/div[1]/div/div[2]/div[2]/form/div[2]")
   public WebElement searchButton;

   public void searchpage(String productName)
   {
       setTextElemnt(searchinput,productName);
   }
   public void clicksearch()
   {
       clickButton(searchButton);
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

public class search {

    WebDriver driver;

    @BeforeTest
    public void OpenGoogle(){
        driver = new ChromeDriver();
        driver.get("https://us.shein.com/");

    }

    @Test
    public void searchpage() throws InterruptedException {
        Thread.sleep(60000);
        WebElement searchinput = driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div[1]/div/div[2]/div[2]/form/div[1]"));
        searchinput.sendKeys("Skirt");
        Thread.sleep(60000);
        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div[1]/div/div[2]/div[2]/form/div[2]"));
        searchButton.click();
    }





}

 */
