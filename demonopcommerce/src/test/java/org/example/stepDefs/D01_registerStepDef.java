package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.example.pages.P01_register;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_register register=new P01_register();
    @Given("user go to register page")//user go to register
    public void goRegisterPage()
    {
        register.registerlink().click();
    }
    @When("user select gender type")//user select gender type
    public void user_select_gender_ype()
    {
        register.gendertype().click();
    }
    @And("user enter firstname \"automation\"")//user enter firstname "automation\
    public void user_enter_firstname()
    {
        register.firstname().sendKeys("automation");
    }
    @And("user enter lastname \"tester\"")//user enter lastname "tester\
    public void user_enter_lastname()
    {
        register.lastname().sendKeys("tester");
    }
    @And("user enter date of birth day")//user enter date of birth day
    public void day()
    {
        Select sel =new Select(register.day());
        sel.selectByIndex(25);
    }
    @And("user enter date of birth month")//user enter date of birth month
    public void month()
    {
        Select sel =new Select(register.month());
        sel.selectByIndex(7);
    }
    @And("user enter date of birth year")//user enter date of birth year
    public void year()
    {
        Select sel =new Select(register.year());
        sel.selectByIndex(86);
    }
    @When("user enter email \"test@examble.com\" field")//user enter email "test@examble.com" field
    public void email()
    {
        register.email().sendKeys("test@examble.com");
    }
    @And("user fills password fileds \"P@ssw0rd\"")//user fills password fileds "P@ssw0rd"
    public void password()
    {
     register.password().sendKeys("P@ssw0rd");
    }
    @And("user fills confirm password fileds \"P@ssw0rd\"")//user fills confirm password fileds "P@ssw0rd"
    public void confirmpassword()
    {
        register.confirmpassword().sendKeys("P@ssw0rd");
    }
    @And("user click on register button")//user click on register button
    public void clickbutton()
    {
        register.buton().click();
    }

    //////*******///////
    //assert register message successfully
    //////*******///////

    @Then("success message is displayed with color")//success message will display
    public void message()
    {
        SoftAssert ass=new SoftAssert();
        ass.assertTrue(register.displaymessage().isDisplayed(),"first assertion is failled");
        String actualcolor=register.displaymessage().getCssValue("color");//assert on the green color
        System.out.println(actualcolor);
        String expectedcolor="rgba(76, 177, 124, 1)";
        ass.assertEquals(actualcolor,expectedcolor);
        ass.assertAll();
    }

}
