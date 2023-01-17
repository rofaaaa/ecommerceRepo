package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.loginElements;

import java.io.IOException;

public class login {
  loginElements l=new loginElements();
  @Given("user navigate to login page")
    public void loginPage() throws InterruptedException {

    l.login().click();
    Thread.sleep(3000);
  }
  @When("user enter valid name and pass")
    public void login() throws IOException, InterruptedException {
      String m=configurationReader.get("email");
       l.mail().sendKeys(m);
       l.password().sendKeys("rofa@@##");
      Thread.sleep(3000);

  }
    @When("user enter invalid name and pass")
    public void invalidLogin(){
        l.mail().sendKeys("mraida21@yahoo.com");
        l.password().sendKeys("rofa@@##");
    }
  @And("click login btn")
    public void clickLogin() throws InterruptedException {
         Thread.sleep(3000);
         l.password().click();
      Thread.sleep(3000);
  }
  @Then("user should login successfully")
    public void loginSuccessfully() throws InterruptedException {
      Thread.sleep(3000);
  }
    @Then("user cant login")
    public void loginFail() throws InterruptedException {
        Thread.sleep(3000);
    }
}
