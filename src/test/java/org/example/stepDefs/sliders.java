package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.homePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class sliders {
    homePage s=new homePage();
    @Given("user click on first slider")
    public void FSlider() throws InterruptedException {
        WebElement el=s.nokiaSlider();
        Thread.sleep(1000);
        el.click();
    }
    @Given("user click on second slider")
    public void SSlider() throws InterruptedException {
        WebElement el=s.iphoneSlider();
        Thread.sleep(1000);
        el.click();
    }
    @Then("sys open nokia page")
    public void nokia() throws InterruptedException {
        Thread.sleep(1000);
        String expurl="https://demo.nopcommerce.com/nokia-lumia-1020";
        String act=hooks.driver.getCurrentUrl();
        System.out.println(act);
        Assert.assertEquals(act,expurl);

    }
    @Then("sys open iphone6 page")
    public void iphone() throws InterruptedException {
        Thread.sleep(1000);
        String expurl="https://demo.nopcommerce.com/iphone-6";
        String act=hooks.driver.getCurrentUrl();
        System.out.println(act);
        Assert.assertEquals(act,expurl);
    }
}
