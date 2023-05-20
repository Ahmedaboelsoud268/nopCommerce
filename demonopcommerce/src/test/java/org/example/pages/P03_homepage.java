package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class P03_homepage {
   public WebElement select_currencies()
   {
       return Hooks.driver.findElement(By.cssSelector("#customerCurrency"));
   }


    ///**D03_currenciesStepDef**///

    public List<WebElement> four_products()//locate price of all products
    {
        List<WebElement> elements =Hooks.driver.findElements(By.className("prices"));
        return elements ;
    }

    ///***search feature***///

    public WebElement field_search(){
       return Hooks.driver.findElement(By.cssSelector("#small-searchterms"));
    }
    public WebElement button_search(){
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header div.header-lower div.search-box.store-search-box form:nth-child(1) > button.button-1.search-box-button"));
    }
    public List<WebElement> search_result()//locate prices of all search result
    {
        List<WebElement> elements =Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
        return elements ;
    }
    public WebElement picture()
    {
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-2 div.page.search-page div.page-body div.search-results div.products-container div.products-wrapper div.product-grid div.item-grid div.item-box div.product-item > div.picture"));
    }
    public WebElement sku()
    {
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.product-details-page div.page-body div.product-essential div.overview div.additional-details div.sku > span.label"));
    }

      ///***hover feature***///

    public ArrayList<WebElement> main_categoties()// locate main categories
    {
        ArrayList<WebElement> category=new ArrayList<>();
        WebElement computer=Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        WebElement electronic=Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        WebElement apparel=Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[3]/a[1]"));
       category.add(computer);
       category.add(electronic);
       category.add(apparel);
       return category;
    }

    public  List<WebElement> subcategorylist()//locate list of sub_category
    {
        List<WebElement> subcatelist=Hooks.driver.findElements(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(2) > ul.sublist.first-level:nth-child(3)"));
return subcatelist;
    }
    public ArrayList<WebElement> ccomputercategories()// locate sub_categories of computers
    {
        ArrayList<WebElement> computer_sub_categories=new ArrayList<>();
        WebElement desktops=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(1) ul.sublist.first-level:nth-child(3) li:nth-child(1) > a:nth-child(1)"));
        WebElement netbooks=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(1) ul.sublist.first-level:nth-child(3) li:nth-child(2) > a:nth-child(1)"));
        WebElement software=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(1) ul.sublist.first-level:nth-child(3) li:nth-child(3) > a:nth-child(1)"));
        computer_sub_categories.add(desktops);
        computer_sub_categories.add(netbooks);
        computer_sub_categories.add(software);
        return computer_sub_categories;
    }
    public ArrayList<WebElement> electroniccategories()// locate sub_categories of computers
    {
        ArrayList<WebElement> electronic_sub_categories=new ArrayList<>();
        WebElement cameraphoto=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(2) ul.sublist.first-level:nth-child(3) li:nth-child(1) > a:nth-child(1)"));
        WebElement cellphone=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(2) ul.sublist.first-level:nth-child(3) li:nth-child(2) > a:nth-child(1)"));
        WebElement others=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(2) ul.sublist.first-level:nth-child(3) li:nth-child(3) > a:nth-child(1)"));
        electronic_sub_categories.add(cameraphoto);
        electronic_sub_categories.add(cellphone);
        electronic_sub_categories.add(others);
        return electronic_sub_categories;
    }
    public ArrayList<WebElement> apparelcategories()// locate sub_categories of computers
    {
        ArrayList<WebElement> apparel_sub_categories=new ArrayList<>();
        WebElement shoes=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(3) ul.sublist.first-level:nth-child(3) li:nth-child(1) > a:nth-child(1)"));
        WebElement clothing=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(3) ul.sublist.first-level:nth-child(3) li:nth-child(2) > a:nth-child(1)"));
        WebElement accessories=Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header-menu ul.top-menu.notmobile:nth-child(1) li:nth-child(3) ul.sublist.first-level:nth-child(3) li:nth-child(3) > a:nth-child(1)"));
        apparel_sub_categories.add(shoes);
        apparel_sub_categories.add(clothing);
        apparel_sub_categories.add(accessories);
        return apparel_sub_categories;
    }


    ///**D06_homeSlidersStepDef**///

    public WebElement firstslider() //locate first slider
    {
        return Hooks.driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]"));
    }
    public WebElement secondslider() //locate the second slider
    {
        return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[2]"));
    }
    public WebElement homepage() //locate the home page
    {
        return Hooks.driver.findElement(By.xpath("//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]"));
    }
    public WebElement next() //locate the home page
    {
        return Hooks.driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/a[2]"));
    }

    ///**D07_followUsStepDef**///

    public WebElement facebook_link()//locate facebook link
    {
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.footer div.footer-upper div.footer-block.follow-us:nth-child(4) div.social ul.networks li.facebook > a:nth-child(1)"));
    }

    public WebElement twitter_link()//locate twitter link
    {
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.footer div.footer-upper div.footer-block.follow-us:nth-child(4) div.social ul.networks li.twitter > a:nth-child(1)"));
    }

    public WebElement rss_link()//locate rss link
    {
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.footer div.footer-upper div.footer-block.follow-us:nth-child(4) div.social ul.networks li.rss > a:nth-child(1)"));
    }

    public WebElement youtube_link()//locate youtube link
    {
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.footer div.footer-upper div.footer-block.follow-us:nth-child(4) div.social ul.networks li.youtube > a:nth-child(1)"));
    }

    ///**D08_WishlistStepDef**///
    public WebElement wishlist() //locate heart emoji
    {
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.home-page div.page-body div.product-grid.home-page-product-grid div.item-grid div.item-box:nth-child(3) div.product-item div.details div.add-info div.buttons > button.button-2.add-to-wishlist-button:nth-child(3)"));
    }
    public WebElement success_message() //locate success message
    {
        return Hooks.driver.findElement(By.cssSelector("body:nth-child(2) div.bar-notification-container:nth-child(6) div.bar-notification.success > p.content"));
    }
    public WebElement color_message() //locate the color message
    {
        return Hooks.driver.findElement(By.cssSelector("body:nth-child(2) div.bar-notification-container:nth-child(6) div.bar-notification.success > p.content"));
    }
    public WebElement wishlisticon()//locate wishlist tap
    {
        return Hooks.driver.findElement(By.xpath("/html[1]/body[1]/div[6]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]/span[1]"));
    }
    public WebElement Qnt()//locate the quantity of added product
    {
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.wishlist-page div.page-body div.wishlist-content div.table-wrapper:nth-child(1) table.cart tbody:nth-child(3) tr:nth-child(1) td.quantity > input.qty-input"));
    }

}
