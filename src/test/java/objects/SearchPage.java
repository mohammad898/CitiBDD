package objects;

import base.ApplicationPageBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage extends ApplicationPageBase {
    private WebDriver driver ;


    @FindBy(how = How.ID, id = "//input[@class='search_query form-control ac_input']")
    private WebElement search;
    @FindBy(how = How.ID, id = "//button[@name='submit_search']")
    private WebElement searchBtn;

    public SearchPage  searchpage(String userName){

        sendKeys(search, "search", userName);

        click(searchBtn,"searchBtn");

        return new SearchPage();

    }


    public void  se(){

        System.out.println("search page start");
        //search.click();
        //search.sendKeys("Man");
        //searchBtn.click();


        //return new SearchPage();

    }

}
