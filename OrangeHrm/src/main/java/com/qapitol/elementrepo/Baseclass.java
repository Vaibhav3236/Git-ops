package com.qapitol.elementrepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Baseclass {
   public WebDriver driver;
   public void openBrowser()
   {
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   }

   public void closeBrowser()
   {
       driver.quit();
   }
}
