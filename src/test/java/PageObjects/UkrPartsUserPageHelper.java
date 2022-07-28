package PageObjects;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class UkrPartsUserPageHelper extends UkrPartsUserPageElements{
    public UkrPartsUserPageHelper (WebDriver driver){
        super(driver);
    }
    public void selectMyOrders() throws InterruptedException {
        do{
            sleep(300);
        }
        while (!(getMyOrdersButton().isDisplayed()));
        getMyOrdersButton().click();
    }
    public void selectMyProfile() throws InterruptedException {

        do{
            sleep(1000);
        }
        while (!(getMyProfileButton().isDisplayed()));
        getMyProfileButton().click();
    }


}
