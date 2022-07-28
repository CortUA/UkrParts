package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import javax.swing.*;

public class UkrPartsPageHelper extends UkrPartsHomePageElements {
    public UkrPartsPageHelper(WebDriver driver){
        super(driver);
    }
    public void searchItem(String item){
        getSearchField().clear();
        getSearchField().sendKeys(item);
        getSearchButton().click();
    }

    public void logIn(String email, String password){
        getEmailField().clear();
        getEmailField().sendKeys(email);

        getPasswordField().clear();
        getPasswordField().sendKeys(password);

        getLogInButton().click();
    }

    public void moveToAirMenu(){
        Actions act = new Actions(driver);
        act.moveToElement(getAirMenuField()).perform();



    }


}