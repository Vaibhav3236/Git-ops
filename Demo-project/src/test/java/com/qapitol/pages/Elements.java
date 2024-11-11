package com.qapitol.pages;

import com.qapitol.base.Baseclass;

import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.swing.*;
import javax.swing.text.View;
import java.time.Duration;

public class Elements extends Baseclass
{
    Actions act=new Actions(driver);
    WebDriverWait wait;
    public void radioButton()
    {
        Actions act=new Actions(driver);

        wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement button=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[.='Yes']")));

       // js.executeScript("windows.scrollBy(0,250);");
        button.click();
    }

    public void form()
    {

      WebElement usn=driver.findElement(By.xpath("//input[@id='userName']"));
        usn.sendKeys("Vaios");
        WebElement email1=driver.findElement(By.xpath("//input[@id='userEmail']"));
        email1.sendKeys("Vaibs@gmail.com");
    }

    public void link() throws InterruptedException {
        /*JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("windows.scrollBy(0,250);");*/
        Actions act=new Actions(driver);
        act.scrollByAmount(0,250).perform();
        driver.findElement(By.xpath("//a[.='Home']")).click();
        Thread.sleep(3000);
    }

    public void fileUpload() throws InterruptedException {
       // driver.get("https://demoqa.com/upload-download");
       act.scrollByAmount(0,250).perform();
        WebElement file= driver.findElement(By.xpath("//input[@id='uploadFile']"));
    file.sendKeys("C:\\Users\\Qapitol QA\\Downloads\\IMG20241107164813.jpg");
    Thread.sleep(3000);
    }

    public void forms()
    {
        driver.get("https://demoqa.com/automation-practice-form");
        WebElement fn=driver.findElement(By.xpath("//input[@id='firstName']"));
        fn.sendKeys("Vaib");
        WebElement ln=driver.findElement(By.xpath("//input[@id='lastName']"));
        ln.sendKeys("K");
        WebElement mail=driver.findElement(By.xpath("//input[@id='userEmail']"));
        mail.sendKeys("vaibs12@gmail.com");
        driver.findElement(By.xpath("//label[.='Male']")).click();
        WebElement no=driver.findElement(By.xpath("//input[@id='userNumber']"));
        no.sendKeys("9876543210");
    }

}
