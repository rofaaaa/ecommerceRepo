package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class hooks {
public static WebDriver driver;

    @Before
    public void openBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\mrofa\\Desktop\\github\\selenim\\src\\browsers\\chromedriver.exe");
        driver=new ChromeDriver();

        driver.manage().window().maximize();
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://demo.nopcommerce.com/");

        Thread.sleep(3000);
    }
    @After
    public void quitDriver(){
  driver.quit();
    }
}
