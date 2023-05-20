package org.example.pages;

import io.cucumber.messages.types.Hook;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {
    public WebElement registerlink() //locate the register link
    {
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.header div.header-upper div.header-links-wrapper div.header-links ul:nth-child(1) li:nth-child(1) > a.ico-register"));
    }
    public WebElement gendertype() //locate the gender type filed
    {
        return Hooks.driver.findElement(By.cssSelector("#gender-male"));
    }
    public WebElement firstname()//locate the first name filed
    {
        return Hooks.driver.findElement(By.cssSelector("#FirstName"));
    }
    public WebElement lastname()//locate the lastname filed
    {
        return Hooks.driver.findElement(By.cssSelector("#LastName"));
    }
    public WebElement day()//locate the day filed
    {
        return Hooks.driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]"));
    }
    public WebElement month()//locate the month filed
    {
        return Hooks.driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]"));
    }
    public WebElement year()//locate the year filed
    {
        return Hooks.driver.findElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]"));
    }
    public WebElement email()//locate the email filed
    {
        return Hooks.driver.findElement(By.cssSelector("#Email"));
    }
    public WebElement password()//locate the password filed
    {
        return Hooks.driver.findElement(By.cssSelector("#Password"));
    }
    public WebElement confirmpassword()//locate the confirm password filed
    {
        return Hooks.driver.findElement(By.cssSelector("#ConfirmPassword"));
    }
    public WebElement buton()//locate the register button
    {
        return Hooks.driver.findElement(By.cssSelector("#register-button"));
    }

    //////*******///////
    //assert register message successfully
    //////*******///////
    public WebElement displaymessage()//locate the message registeration successfully
    {
        return Hooks.driver.findElement(By.cssSelector("div.master-wrapper-page:nth-child(7) div.master-wrapper-content div.master-column-wrapper div.center-1 div.page.registration-result-page div.page-body > div.result"));
    }
}