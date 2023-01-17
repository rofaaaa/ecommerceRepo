package org.example.stepDefs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class configurationReader {
    public void setEmail(String key,String mail) throws IOException {
        Properties prop=new Properties();
        FileInputStream file=new FileInputStream("config.properties");
        prop.load(file);
        prop.setProperty(key, mail);
        file.close();
        FileOutputStream f=new FileOutputStream("config.properties");
        prop.store(f,"");
    }
    public static String get(String key) throws IOException {
        Properties prop=new Properties();
        FileInputStream file=new FileInputStream("config.properties");
        prop.load(file);
        String val= prop.getProperty(key);
        file.close();
        return val;

    }
}
