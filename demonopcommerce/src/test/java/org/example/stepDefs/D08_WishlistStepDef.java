package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class D08_WishlistStepDef {
P03_homepage wish=new P03_homepage();
@When("user click on the heart emoji") //user click on the heart emoji to add the product to the wishlist
    public void user_click_on_the_heart_emoji()
{
    wish.wishlist().click();
    System.out.println(wish.success_message().getText());
}
@Then("success message is displayed with green color")//assert on it that the success message is displayed with green color
    public void success_message_is_displayed_with_green_color()
{
    SoftAssert ass=new SoftAssert();
    String expectedresult=wish.success_message().getText();
    String actualresult="The product has been added to your wishlist";
    ass.assertEquals(expectedresult,actualresult);//assert on the success message
    String actualcolor=wish.color_message().getCssValue("background-color");//assert on the green color
    System.out.println(actualcolor);
     actualcolor = Color.fromString(actualcolor).asHex(); //converted Into HexFormat
    String expectedcolor="#000000";
    ass.assertEquals(actualcolor,expectedcolor);
    ass.assertAll();

}
@And("user click on the wishlist until success message invisible")//after success message is disappear
    public void user_click_on_the_wishlist_until_disapear()
{
    WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofMillis(4000));//explicit wait till the success message is disappear
    wait.until(ExpectedConditions.invisibilityOf(wish.success_message()));
    wish.wishlisticon().click();
}
@Then("chick the Qty in wishlistis greater than 0")//assert that the quantity is greater than 0
    public void chick_the_Qty_in_wishlistis_greater_than_0()
{
    String qty=(wish.Qnt().getAttribute("value"));//get the value of the quantity
    int value=Integer.parseInt(qty);//convert the value of quantity to integer
    System.out.println("the quantity is "+value);
    Assert.assertTrue(value>0);
}
}
