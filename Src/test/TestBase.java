package Test;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.util.TimeUtils;

import java.io.File;
import java.io.IOException;
public class TestBase {
    public static WebDriver driver;
    public WebDriverWait wait;
    JavascriptExecutor executor;
    @BeforeTest
    public void openURL()throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("https://us.shein.com/");
        Thread.sleep(90000);
    }

    @AfterMethod
    public void take_screenShot(ITestResult result) throws  IOException {
        if(ITestResult.FAILURE == result.getStatus()) {
        System.out.println("Failed!");
        System.out.println("Taking screenshot...");

        TakesScreenshot sc=(TakesScreenshot) driver;
        File photo=sc.getScreenshotAs(OutputType.FILE.FILE);
        FileUtils.copyFile(photo,new File("./screenshots/"+result.getName()+".png"));
        }
    }
  //  @AfterClass
    //public void closeURL(){
      //  driver.quit();
    //}
}
/*
 <class name="Test.loginTest"></class>
            <class name="Test.regTest"></class>
            <class name="Test.customerTest"></class>
            <class name="Test.cartTest"></class>
            <class name="Test.likeTest"></class>
            <class name="Test.searchTest"></class>
            <class name="Test.deletCartTest"></class>
            <class name="Test.logoutTest"></class>
 */