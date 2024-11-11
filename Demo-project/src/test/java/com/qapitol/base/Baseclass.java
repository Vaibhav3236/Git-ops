package com.qapitol.base;

import com.qapitol.pages.Elements;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Baseclass {
    public static WebDriver driver;
@BeforeMethod
    public static void initialise()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://demoqa.com/");

       // driver.manage().deleteAllCookies();
    }
@Test
public void test() throws InterruptedException {
    //Thread.sleep(2000);
   // js.executeScript("windows.scrollBy(0,250);");
    Elements elements=new Elements();
    elements.forms();
}

    @AfterMethod
    public static void quit()
    {
        driver.quit();
    }
}
