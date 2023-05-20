package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homepage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D06_homeSlidersStepDef {
    P03_homepage slider=new P03_homepage();
    @Given("user click on the first slider")//user click on the first slider
    public void user_click_on_the_first_slider()
    {
        slider.firstslider().click();

    }
    @Then("the webpage reload to the home page")//assert the bug is displayed on the first slider
    public void the_webpage_reload_to_the_home_page()
    {
        System.out.println(Hooks.driver.getCurrentUrl());
        WebDriverWait wait=new WebDriverWait(Hooks.driver, Duration.ofMillis(2000));//explicit wait till the home page load
        wait.until(ExpectedConditions.visibilityOf(slider.homepage()));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("iphone14"));
    }

    @Given("user click on the second slider")//user click on the second slider
    public void user_click_on_the_second_slider()
    {
        slider.next().click();
//        WebDriverWait wait=new WebDriverWait(Hooks.driver,Duration.ofMillis(4000));//explicit wait till the home page load
//        wait.until(ExpectedConditions.visibilityOf(slider.secondslider()));
        slider.secondslider().click();
    }
    @Then("the webpage reload to the same home page")//assert the bug is displayed on the second slider
    public void the_webpage_reload_to_the_same_home_page()
    {
        System.out.println(Hooks.driver.getCurrentUrl());
        WebDriverWait wait=new WebDriverWait(Hooks.driver,Duration.ofMillis(2000));//explicit wait till the home page load
        wait.until(ExpectedConditions.visibilityOf(slider.homepage()));
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("samsung s22 ultra"));
    }
}
