package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class D03_currenciesStepDef {
    P03_homepage currencies =new P03_homepage();
    @Given("user select Euro")//user select Euro
    public void select_Euro()
    {
        Select sel=new Select(currencies.select_currencies());
        sel.selectByIndex(1);
    }
    //*assert about displaying euro symbol*//


    @Then("chick Euro is display in products")//chick Euro is display in products for every products
    public void as()
    {
         //currencies.four_products();
        for (int i=0 ; i<currencies.four_products().size();i++ )
        {
            Assert.assertTrue(currencies.four_products().get(i).getText().contains("€"));
            System.out.println(currencies.four_products().get(i).getText());
        }
    }
}
