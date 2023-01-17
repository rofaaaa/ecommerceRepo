package org.example.stepDefs;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WishList {
    homePage p=new homePage();
    @Given("user navigate to HTC One M8 Android L 5.0 Lollipop")
    public void selectProduct() throws InterruptedException {
      p.productLink().click();
        Thread.sleep(3000);

    }
    @When("user enter wish list btn")
    public void wishBtn(){
        p.wishbtn().click();
    }
    @Then("product added to wish list successfully")
    public void chek () throws InterruptedException {
        Thread.sleep(3000);
        SoftAssert soft =new SoftAssert();
        String exp="The product has been added to your wishlist";
        String res=hooks.driver.findElement(By.className("content")).getText();
        System.out.println("resss   "+res);
        soft.assertEquals(exp,res);
        String s = hooks.driver.findElement(By.className("bar-notification")).getCssValue("color");
        String c = Color.fromString(s).asHex();
        soft.assertEquals("#ffffff",c);
        System.out.println("cccc  "+c);
        soft.assertAll();
    }
@When("user enter wishlist label")
    public void Clickwishlabel() throws InterruptedException {
    //WebDriverWait wait = new WebDriverWait(hooks.driver,30);
    WebElement foo = new WebDriverWait(hooks.driver, Duration.ofSeconds(3))
            .until(driver -> driver.findElement(By.className("wishlist-label")));
    p.wishlabel().click();
        Thread.sleep(3000);
}
@Then("show wishlist")
    public void checkList(){
     String qty=p.QTY().getCssValue("value");
     System.out.println(qty+"dddddddddddddddddddd");
}
}
