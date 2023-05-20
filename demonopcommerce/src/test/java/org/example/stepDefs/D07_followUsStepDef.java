package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.testng.Assert;

import java.util.Set;

public class D07_followUsStepDef {
    P03_homepage follow_us=new P03_homepage();

    // facebook
    @When("user click on facebook link") //facebook link
    public void user_opens_facebook_link() throws InterruptedException {
follow_us.facebook_link().click();
Thread.sleep(2000);

    }
    @Then("the driver navigate to facebook page") //assert on facebook page
    public void the_driver_navigate_to_facebook_page()
    {
        //multiple tabs method that allow to transport between all tabs
        Set<String> all_tabs=Hooks.driver.getWindowHandles();
        String tab1=(String) all_tabs.toArray()[0];
        String tab2=(String) all_tabs.toArray()[1];
        Hooks.driver.switchTo().window(tab2);
        System.out.println(Hooks.driver.getCurrentUrl());
       Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("facebook"));

    }

    //twitter
    @When("user click on twitter link") //twitter link
    public void user_open_twitter_link() throws InterruptedException {
        follow_us.twitter_link().click();
        Thread.sleep(4000);

    }
    @Then("the driver navigate to twitter page") //assert on twitter page
    public void the_driver_navigate_to_twitter_page()
    {
        //multiple tabs method that allow to transport between all tabs
        Set<String> all_tabs=Hooks.driver.getWindowHandles();
        String tab1=(String) all_tabs.toArray()[0];
        String tab2=(String) all_tabs.toArray()[1];
        Hooks.driver.switchTo().window(tab2);
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("twitter"));
    }

    //rss
    @When("user click on rss link") //rss link
    public void user_click_on_rss_link() throws InterruptedException {
        follow_us.rss_link().click();
        Thread.sleep(4000);

    }
    @Then("the driver navigate to rss page") //assert on rss link
    public void the_driver_navigate_to_rss_page()
    {
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("new-online-store-is-open"));
    }

    //youtube
    @When("user click on youtube link") // youtube link
    public void user_click_on_youtube_link() throws InterruptedException {
        follow_us.youtube_link().click();
        Thread.sleep(4000);
}
    @Then("the driver navigate to youtube page") //assert on youtube page
    public void the_driver_navigate_to_youtube_page()
    {
        //multiple tabs method that allow to transport between all tabs
        Set<String> all_tabs=Hooks.driver.getWindowHandles();
        String tab1=(String) all_tabs.toArray()[0];
        String tab2=(String) all_tabs.toArray()[1];
        Hooks.driver.switchTo().window(tab2);
        System.out.println(Hooks.driver.getCurrentUrl());
        Assert.assertTrue(Hooks.driver.getCurrentUrl().contains("youtube"));
    }
}
