package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.homePage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class follow {
    homePage fol=new homePage();
    //hooks.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    @Given("user navigate to facebook page")
    public void clickFacebook(){
        fol.facebookIcon().click();
        String mainWindowHandle = hooks.driver.getWindowHandle();
        Set<String> allWindowHandles = hooks.driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        System.out.println("window handel");
        System.out.println(allWindowHandles);
        System.out.println("iterator");

        System.out.println(iterator);


    }
    @Given("user navigate to twitter page")
    public void clicktwitter(){
      fol.teitterIcon().click();
    }
    @Given("user navigate to rss page")
    public void clickrss(){
        fol.rss().click();
    }
    @Given("user navigate to youtube page")
    public void clickyoutube(){
        fol.youtube().click();

    }
    @Then("user open facebook link in new tab")
    public void facebookTab() throws InterruptedException {
        Thread.sleep(3000);

        String url=hooks.driver.getCurrentUrl();
        System.out.println(url);

    }
    @Then("user open twitter link in new tab")
    public void twitterTab() throws InterruptedException {
        Thread.sleep(3000);

        String url=hooks.driver.getCurrentUrl();
        System.out.println(url);

    }
    @Then("user open rss link in new tab")
    public void rssTab() throws InterruptedException {
        Thread.sleep(3000);

        String url=hooks.driver.getCurrentUrl();
        System.out.println(url);

    }
    @Then("user open youtube link in new tab")
    public void youtubeTab() throws InterruptedException {
        Thread.sleep(3000);
        String url=hooks.driver.getCurrentUrl();
        System.out.println(url);

    }
}
