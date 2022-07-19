package PageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UkrPartsUserPageElements extends DriverHolder {

    public UkrPartsUserPageElements(WebDriver driver) {
        super(driver);
    }

    private String myOrdersButton = "//a[@href='/orders/']";
    private String myProfileButton = "//a[@href='/profile/']";


    public WebElement getMyOrdersButton() {
        return getElementByXpath(myOrdersButton);
    }
    public WebElement getMyProfileButton(){
        return getElementByXpath(myProfileButton);
    }
}
