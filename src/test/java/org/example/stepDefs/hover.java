package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class hover {
    homePage e=new homePage();
    Actions action=new Actions(hooks.driver);
    @Given("user hover on computers")
    public void mainMenuu(){
        action.moveToElement(e.mainMenu()).perform();
    }
    @When("user hover on desktop and click on it")
    public void submenuItem() throws InterruptedException {
        e.subMenu().click();
        Thread.sleep(3000);
    }
    @Then("sys open desktop page")
    public void hoverAssertion(){
        String title=hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]")).getText().toLowerCase();
        System.out.println(title);
        Assert.assertEquals(title,"desktops");
    }


}
