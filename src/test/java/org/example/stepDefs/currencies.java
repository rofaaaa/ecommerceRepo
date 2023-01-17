package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class currencies {
    homePage h=new homePage();
    @Given("user select Euro Symbol")
    public void selectEuro(){
        Select drp = new Select(h.euro());
        drp.selectByVisibleText("Euro");
    }
    @When("verify Euro Symbol")
    public void features(){

        List<WebElement> listOfElements=h.featuress();
        for(int i=0;i<listOfElements.size();i++){
            String act=(listOfElements.get(i).getText());
            Assert.assertTrue(act.contains("€"));
        }
    }
}
