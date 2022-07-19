package PageObjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

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


}