package org.example.pages;

import org.example.stepDefs.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterElements {

    public WebElement register(){
        WebElement ele= hooks.driver.findElement(By.className("ico-register"));
        return ele;
    }

        public WebElement FemaleGender(){
            By gender=By.id("gender-female"); //allocator
            WebElement fem=hooks.driver.findElement(gender);
            return fem;
        }

        public WebElement firstname(){
            By firstname=By.id("FirstName"); //allocator
            WebElement ele=hooks.driver.findElement(firstname);
            return ele;
        }
        public WebElement lastname(){
            By lastname=By.id("LastName"); //allocator
            WebElement u=hooks.driver.findElement(lastname);
            return u;
        }
        public WebElement day(){
            By day=By.name("DateOfBirthDay");
            WebElement ele=hooks.driver.findElement(day);
            return ele;
        }
        public WebElement month(){
            By day=By.name("DateOfBirthMonth");
            WebElement ele=hooks.driver.findElement(day);
            return ele;
        }
        public WebElement year(){
            By day=By.name("DateOfBirthYear");
            WebElement ele=hooks.driver.findElement(day);
            return ele;
        }

        public WebElement mail(){
            By mail=By.id("Email");
            WebElement ele=hooks.driver.findElement(mail);
            return ele;
        }
        public WebElement company(){
            By Company=By.id("Company");
            WebElement ele=hooks.driver.findElement(Company);
            return ele;
        }
        public WebElement pass(){
            By pas=By.id("Password");
            WebElement pass=hooks.driver.findElement(pas);
            return pass;
        }
        public WebElement ConfirmPassword(){
            By pas=By.id("ConfirmPassword");
            WebElement pass=hooks.driver.findElement(pas);
            return pass;
        }
    public WebElement registerBtn(){
        By RB=By.id("register-button");
        WebElement rBtn=hooks.driver.findElement(RB);
        return rBtn;
    }
    }



