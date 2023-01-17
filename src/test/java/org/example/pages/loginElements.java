package org.example.pages;

import org.example.stepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginElements {
    public WebElement login(){
        WebElement ele= hooks.driver.findElement(By.className("ico-login"));
        return ele;
    }
    public WebElement mail(){
        WebElement ele= hooks.driver.findElement(By.id("Email"));
        return ele;
    }
    public WebElement password(){
        WebElement ele= hooks.driver.findElement(By.id("Password"));
        return ele;
    }
}
