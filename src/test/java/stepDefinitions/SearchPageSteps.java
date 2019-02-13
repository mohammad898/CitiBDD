package stepDefinitions;

import base.ApplicationPageBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objects.HomePage;
import objects.LoginPage;
import objects.SearchPage;
import org.openqa.selenium.support.PageFactory;

public class SearchPageSteps extends ApplicationPageBase {

    SearchPage S = PageFactory.initElements(driver, SearchPage.class);
   HomePage homePage = PageFactory.initElements(driver, HomePage.class);


    @Given("^Customer in a LoginPage$")
    public void customer_in_a_LoginPage( ) {

    }

    @When("^Enter Customer name \"([^\"]*)\"   in search box$")
    public void enter_Customer_name_in_search_box(String a)  {
       // S.searchpage(a);
        //S.se(a);
    }

    @When("^Click  on Search Button$")
    public void click_on_Search_Button()  {
        System.out.println("Click on button");

    }

    @Then("^Customer details appear$")
    public void customer_details_appear()  {
        System.out.println("Show the Customer Details");

    }

}
