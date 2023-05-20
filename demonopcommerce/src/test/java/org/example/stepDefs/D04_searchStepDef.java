package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pages.P03_homepage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D04_searchStepDef {
P03_homepage search=new P03_homepage();
 @Given("user in home page")
 public void user_in_home_page()
 {
     search.field_search().click();
 }
@When("user enter {string} for search")

    public void user_enter_product_for_search(String product)
{

search.field_search().sendKeys(product);
}
@And("user click on search button")
    public void user_click_on_search_button()
    {
        search.button_search().click();
    }


@Then("search results for {string} are displayed")
public void search_results_for_product_are_displayed(String product)
{
    String getcurrentURL=Hooks.driver.getCurrentUrl();
    SoftAssert soft=new SoftAssert();
    soft.assertTrue(getcurrentURL.contains("https://demo.nopcommerce.com/search?q="));
    int result=search.search_result().size();
    for (int i=0;i<result;i++)
    {
        soft.assertTrue(search.search_result().get(i).getText().toLowerCase().contains(product));
    }
    soft.assertAll();
}
@When("user enter {string} for search2")
    public void user_enter_sku_for_search2(String sku)
{
    search.field_search().sendKeys(sku);
}
    @And("user click on search button2")
    public void user_click_on_search_button2()
    {
        search.button_search().click();
    }
@Then("search results for {string} are displayed using sku")
    public void search_results_for_sku_are_displayed_using_sku()
{
search.picture().click();
    Assert.assertTrue(search.sku().getText().contains("SKU"));
}
}