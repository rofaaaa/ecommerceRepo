package org.example.stepDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.RegisterElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.io.IOException;
import java.util.Random;

public class register {
    RegisterElements R=new RegisterElements();
    @Given("user go to register page")
    public void registered() throws InterruptedException {
        R.register().click();
        Thread.sleep(3000);
    }

    @When("user select gender")
    public void gender() {
        R.FemaleGender().click();
    }


    @And("user enter first name")
    public void Fname() {
        R.firstname().sendKeys("rofa");
    }
    @And("user enter last name")
    public void Lname() {
        R.lastname().sendKeys("mohamed");
    }
    @And("user enter date of birth")
    public void DOB() throws InterruptedException {
        R.day().sendKeys("5");
        R.month().sendKeys("11");
        R.year().sendKeys("1995");
        Thread.sleep(3000);
    }
    @And("user enter valid email")
    public void email() throws IOException, InterruptedException {
        Faker fake=new Faker();
        String mail =fake.internet().safeEmailAddress();
        configurationReader e=new configurationReader();
        e.setEmail("email",mail);
        R.mail().sendKeys(mail);
        Thread.sleep(3000);

    }
    @And("user enter company name")
    public void compName() {

        R.company().sendKeys("vodafone");
    }
    @And("user enter password")
    public void Password() {
        R.pass().sendKeys("rofa@@##");
    }
    @And("user confirm password")
    public void confirm() throws InterruptedException {
        R.ConfirmPassword().sendKeys("rofa@@##");
        Thread.sleep(3000);

    }
    @Then("user click on register btn")
    public void clickRBtn() throws InterruptedException {
        R.registerBtn().click();
        Thread.sleep(3000);
    }

    String expected ="Your registration completed";
    //String actual=driver.findElement(By.className("result")).getText();



}
