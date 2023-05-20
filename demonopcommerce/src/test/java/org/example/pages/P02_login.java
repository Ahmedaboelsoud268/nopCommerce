package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement loginlink() //locate login link
    {
        return Hooks.driver.findElement(By.xpath("//a[contains(text(),'Log in')]"));
    }
    public WebElement email()//locate email filed
    {
        return Hooks.driver.findElement(By.cssSelector("#Email"));
    }
    public WebElement password()//locate password filed
    {
        return Hooks.driver.findElement(By.cssSelector("#Password"));
    }
    public WebElement buton()//locate the login filed
    {
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.login-page div.page-body div.customer-blocks div.returning-wrapper.fieldset form:nth-child(1) div.buttons:nth-child(3) > button.button-1.login-button"));
    }
    public WebElement myaccountlink()//locate my account icon
    {
      return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header div.header-upper div.header-links-wrapper div.header-links ul:nth-child(1) li:nth-child(1) > a.ico-account"));
    }

    //////*******///////
    //assert login
    //////*******///////

    public WebElement myaccounttap() //locate my account tap
    {
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-2 div.page.account-page.customer-info-page div.page-title > h1:nth-child(1)"));
    }
    public WebElement failed_login()//locate error message
    {
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.login-page div.page-body div.customer-blocks div.returning-wrapper.fieldset form:nth-child(1) > div.message-error.validation-summary-errors:nth-child(1)"));
    }
}
