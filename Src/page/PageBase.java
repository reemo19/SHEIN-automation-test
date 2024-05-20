package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;

public class PageBase {

    public WebDriver driver;
    public Select select;
    public Action action;
    //WebDriverWait wait;
    public PageBase(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    protected static void clickButton(WebElement button)
    {
        button.click();
    }

    protected static void setTextElemnt(WebElement textElemnt ,String value)
    {
        textElemnt.sendKeys(value);
    }


}


/*
            <class name="Test.regTest"></class>
            <class name="Test.cartTest"></class>
            <class name="Test.likeTest"></class>
            <class name="Test.searchTest"></class>
            <class name="Test.deletCartTest"></class>
            <class name="Test.logoutTest"></class>
 */
