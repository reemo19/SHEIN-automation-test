package Test;

import org.testng.annotations.Test;
import page.*;

public class searchTest extends TestBase{

  cart cart;
  like like;
  login login;
  search search;
  search clicksearch;

  Homepage homepage;
  @Test
  public void Testsearchpage(){
    search=new search(driver);
    search.searchpage("Dress");
    //--------------------------------------
    clicksearch=new search((driver));
    clicksearch.clicksearch();//page
  }
}
