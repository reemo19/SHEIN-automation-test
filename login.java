
package page;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class login extends PageBase{

    public login(WebDriver driver) {
        super(driver);
    }


    @FindBy ( xpath= "/html/body/div/header/div[3]/div[1]/div/div[2]/div[3]/div[1]/a")
    public WebElement logimage;
    @FindBy(xpath="/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/div/input")
    public WebElement email;
    @FindBy (xpath="/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/div[3]/div/button")
    public WebElement ContinueButton;
    @FindBy(xpath="/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div[4]/div[2]/div/div/input")
    public WebElement pass;
    @FindBy(xpath="/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div[4]/div[4]/div/div/label[1]")
    public WebElement womenButton;

    @FindBy(xpath ="  /html/body/div[1]/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div[4]/div[5]/div[1]/p/label/span[1]")
    public WebElement confirmButton;

    @FindBy(xpath ="/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div[4]/div[8]/div/button" )
    public WebElement RegButton ;
    //fun2
    @FindBy(xpath = " /html/body/div[1]/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div[4]/div[2]/div/div/input")
    public WebElement passlogin ;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div[4]/div[8]/div/button")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"j-member-sidebar-ssr\"]/div/div[8]/h4")
    public WebElement logout;

    public void writeemail(String Email)  throws InterruptedException {
        Thread.sleep(200000);
        setTextElemnt(email,Email);
    }
    public void conButton() throws InterruptedException {
        Thread.sleep(100000);

        clickButton(ContinueButton);
    }
    public void setpasslogin(String password) throws InterruptedException {
        Thread.sleep(100000);

        passlogin.sendKeys(password);
    }

    public void writepassReg(String password) throws InterruptedException {
        Thread.sleep(90000);
        pass.sendKeys(password);
    }
    public void WomenButton() throws InterruptedException {
        Thread.sleep(90000);

        clickButton( womenButton);
    }
    public void setConfirmButton() throws InterruptedException {
        Thread.sleep(90000);
        clickButton( confirmButton);
    }
    public void RegButton() throws InterruptedException {
        Thread.sleep(100000);
        clickButton( RegButton);
    }

    public void loginButton() throws InterruptedException {
        Thread.sleep(100000);
        clickButton( loginButton);
       // Thread.sleep(100000);
    }
    public void logout()throws InterruptedException{
        Thread.sleep(200000);
        clickButton( logout);
    }
}



/*

package page;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
    WebDriver driver;
     @BeforeTest
    public void OpenGoogle(){
        driver = new ChromeDriver();
        driver.get("https://us.shein.com/");
    }

    @Test
    public void login_screen() throws InterruptedException {
        Thread.sleep(60000);
        driver.navigate().to("https://us.shein.com/user/auth/login?direction=nav");

        Thread.sleep(10000);
        WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/div/input"));
        email.sendKeys(" fevoyim827@godsigma.com");

        Thread.sleep(10000);
        WebElement ContinueButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/div[3]/div/button"));
        ContinueButton.click();

        Thread.sleep(10000);
        WebElement pass = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div[4]/div[2]/div/div/input"));
        pass.sendKeys("WEAREJUSTAGIRL5");

        Thread.sleep(10000);
        WebElement womenButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div[4]/div[4]/div/div/label[1]"));
        womenButton.click();

        Thread.sleep(10000);
        WebElement confirmButton = driver.findElement(By.xpath("  /html/body/div[1]/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div[4]/div[5]/div[1]/p/label/span[1]"));
        confirmButton.click();
        //register
        Thread.sleep(10000);
        WebElement RegButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div[4]/div[8]/div/button"));
        RegButton.click();
        driver.navigate().refresh();

    }

    @Test
    public void sigup_screen() throws InterruptedException {
        Thread.sleep(60000);
        driver.navigate().to("https://us.shein.com/user/auth/login?direction=nav");

        Thread.sleep(10000);
        WebElement emaillogin=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/div[2]/div/div[2]/div/div/input"));
        emaillogin.sendKeys(" Studentteam2023@gmail.com");

        Thread.sleep(10000);
        WebElement ContinueButtonlogin =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/div[3]/div/button"));
        ContinueButtonlogin.click();

        //login
        Thread.sleep(10000);
        WebElement pass =driver.findElement(By.xpath("  /html/body/div[1]/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div[4]/div[2]/div/div/input"));
        pass.sendKeys("WEAREJUSTAGIRL5");

         //sign in
        Thread.sleep(10000);
          WebElement RegButton =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div[4]/div[8]/div/button"));
          RegButton.click();
                // driver.navigate().back();
             // driver.navigate().forward();

        //Verification code send successfully
    }
}

*/