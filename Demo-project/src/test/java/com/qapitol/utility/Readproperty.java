package com.qapitol.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Readproperty {
    public static void getProperties() throws IOException {
        Properties p=new Properties();
        System.getProperty("user.dir");
        InputStream ip=new FileInputStream("C:\\Users\\Qapitol QA\\Git-ops\\Demo-project\\src\\test\\java\\config\\config.properties");
    p.load(ip);
    String Url=p.getProperty("url");
    }
}
