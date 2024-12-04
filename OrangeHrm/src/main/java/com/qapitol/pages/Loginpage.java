package com.qapitol.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    public Loginpage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@name='username']")
    public WebElement usn;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement pwd;

    @FindBy(xpath = "//button[.=' Login ']")
    public WebElement lgnbtn;

}
