package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class customer extends PageBase{

    public customer(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[3]/textarea")
   //@FindBy(css = "textarea.robot-search__textarea.footer-textarea")
   public WebElement entermsg;
   //  @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[1]/div/div/ul/li[13]/div/div[2]/div/div[1]")
     //@FindBy(css = "li.footer-trigger__item[data-v-98f10e08]")
     @FindBy(css = "li.footer-trigger__item[data-v-98f10e08=''] span[data-v-98f10e08='']")
     public WebElement alrmsg;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div/div[2]/div/div/div[1]/footer/div[3]/button")
    public WebElement enterbutton;
//must reg first
    public void setEntermsg(String MSG)  throws InterruptedException {
     //   Thread.sleep(90000);
      //  clickButton(alrmsg);
        Thread.sleep(90000);
        setTextElemnt(entermsg,MSG);
        Thread.sleep(50000);
        clickButton(enterbutton);

    }
//must have login

}
