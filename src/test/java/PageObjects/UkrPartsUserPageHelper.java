package PageObjects;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class UkrPartsUserPageHelper extends UkrPartsUserPageElements{
    public UkrPartsUserPageHelper (WebDriver driver){
        super(driver);
    }
    public void selectMyOrders(){
        getMyOrdersButton().click();
    }
    public void selectMyProfile(){


        getMyProfileButton().click();
    }


}
