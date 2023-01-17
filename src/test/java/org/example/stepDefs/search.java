package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.example.pages.homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class search {
    homePage H=new homePage();
    @Given("user click on search field")
    public void serch(){
        H.searchfield().click();
    }
    @When("user enter product name in search")
    public void productName() throws InterruptedException {
        H.searchfield().sendKeys("book");
        Thread.sleep(3000);
    }
    @When("user enter product using sk")
    public void productsku() throws InterruptedException {
        H.searchfield().sendKeys("SCI_FAITH");
        Thread.sleep(3000);
    }
    @Then("sys response with product page")
    public void skupage() throws InterruptedException {
        Thread.sleep(3000);
        hooks.driver.findElement(By.className("picture")).click();
        String res=hooks.driver.findElement(By.id("sku-36")).getText();
        System.out.println(res+"  res");
        Assert.assertTrue(res.contains("SCI_FAITH"));
    }
    @And("user click on search btn")
    public void searchBox(){
     H.serchboxbtn().click();
    }
    @Then("sys response with product list")
    public void productPage() throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert soft=new SoftAssert();
        System.out.println(hooks.driver.getCurrentUrl());
        soft.assertEquals(hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/search?q=book");
        List<WebElement> listOfElements = hooks.driver.findElements(By.className("product-title"));
        for(int i=0;i<listOfElements.size();i++){
            System.out.println(listOfElements.get(i).getText());
            String act=(listOfElements.get(i).getText()).toLowerCase();
            soft.assertTrue(act.contains("book"));
        }
        soft.assertAll();

    }

}
