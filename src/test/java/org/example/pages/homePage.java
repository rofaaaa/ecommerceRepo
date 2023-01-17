package org.example.pages;

import org.example.stepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class homePage {
    public WebElement euro(){
        return (hooks.driver.findElement(By.name("customerCurrency")));
    }
    public WebElement serchboxbtn(){
        return (hooks.driver.findElement(By.className("button-1")));
    }
    public List<WebElement> featuress(){
        List<WebElement> listOfElements = hooks.driver.findElements(By.className("prices"));
        return listOfElements;
    }
    public WebElement searchfield(){
        return (hooks.driver.findElement(By.id("small-searchterms")));
    }
  //  List<WebElement> listOfElements = driver.findElements(By.xpath("//div"));

    public WebElement productLink(){//("//a[@href=\"" + url + "\"]")
        return (hooks.driver.findElement(By.cssSelector("img[alt=\"Picture of HTC One M8 Android L 5.0 Lollipop\"]")));
    }
    public WebElement wishbtn(){
        return (hooks.driver.findElement(By.id("add-to-wishlist-button-18")));
    }
    public WebElement wishlabel(){
        return (hooks.driver.findElement(By.className("wishlist-label")));
    }
    public WebElement QTY(){
        return (hooks.driver.findElement(By.name("itemquantity11231")));
    }
    public WebElement facebookIcon(){
        return (hooks.driver.findElement(By.className("facebook")));
    }
    public WebElement teitterIcon(){
        return (hooks.driver.findElement(By.className("twitter")));
    }
    public WebElement rss(){
        return (hooks.driver.findElement(By.className("rss")));
    }
    public WebElement youtube(){
        return (hooks.driver.findElement(By.className("youtube")));
    }

    public WebElement nokiaSlider(){
        return (hooks.driver.findElement(By.xpath("(//a[href=\"https://demo.nopcommerce.com/\"])[\"1\"]")));
    }
    public WebElement iphoneSlider(){
        return (hooks.driver.findElement(By.xpath("(//a[href=\"https://demo.nopcommerce.com/\"])[\"2\"]")));
    }
    public WebElement mainMenu(){
        return (hooks.driver.findElement(By.cssSelector("a[href=\"/computers\"]")));
    }
    public WebElement subMenu(){
        return (hooks.driver.findElement(By.cssSelector("a[href=\"/desktops\"]")));
    }



}
