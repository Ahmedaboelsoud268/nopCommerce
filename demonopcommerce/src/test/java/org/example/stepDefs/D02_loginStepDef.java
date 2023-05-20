package org.example.stepDefs;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login=new P02_login();
    @Given("user go to login page")//user go to login page
    public void login_page()
    {
    login.loginlink().click();
    }
    @When("user enter valid email")//user enter valid emai
    public void validemail()
    {
        login.email().sendKeys("test@examble.com");
    }
    @And("user enter valid password")//user enter valid password
    public void validpassword()
    {
        login.password().sendKeys("P@ssw0rd");
    }
    @And("user press on login button")//user press on login button
    public void loginbutton()
    {
        login.buton().click();
    }
    @And("user open my account")//user open my account
    public void myaccount()
    {
        login.myaccountlink().click();

    }

    ///assertion /////

    @Then("user login to the system successfully and display my account")//assert login to the system successfully and display my account
    public void successfully()
    {
        SoftAssert ass=new SoftAssert();
        ass.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"),"first assertion id failed");
        ass.assertTrue(login.myaccounttap().isDisplayed(),"second assertion is display");
        ass.assertAll();
    }
    //invalid scenario
    @Given("user go to login page again")//user go to login page again
    public void loginpage()
    {
        login.loginlink().click();
    }
    @When("user enter invalid email")//user enter invalid email
    public void invalidemail()
    {
        login.email().sendKeys("wrong@example.com");
    }
    @And("user enter valid password again")//user enter valid password again
    public void password()
    {
        login.password().sendKeys("P@ssw0rd");
    }
    @And("user click on login button")//user click on login button
    public void click()
    {
        login.buton().click();
    }

    ////assertion/////

    @Then("user could not login to the system")//assert user could not login to the system
    public void errormessage()
    {
        SoftAssert ass=new SoftAssert();
        ass.assertTrue(login.failed_login().getText().contains("Login was unsuccessful."),"first assertion is failed");
        String actualcolor=login.failed_login().getCssValue("color");//assert on the green color
        actualcolor = Color.fromString(actualcolor).asHex(); //converted Into HexFormat
        System.out.println(actualcolor);
        String expectedcolor="#e4434b";
        ass.assertEquals(actualcolor,expectedcolor);
        ass.assertAll();
    }
}
