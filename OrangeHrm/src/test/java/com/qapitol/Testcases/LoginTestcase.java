package com.qapitol.Testcases;

import com.qapitol.elementrepo.Baseclass;
import com.qapitol.pages.Loginpage;
import org.testng.annotations.Test;

public class LoginTestcase extends Baseclass {
    @Test
    public void login()
    {
        openBrowser();
        Loginpage lp=new Loginpage(driver);
        lp.usn.sendKeys("Admin");
        lp.pwd.sendKeys("admin123");
        lp.lgnbtn.click();
    }
}
