package PageObjects;

import org.openqa.selenium.WebDriver;

public class UkrPartsPageHelper extends UkrPartsHomePageElements {
    public UkrPartsPageHelper(WebDriver driver){
        super(driver);
    }
    public void searchItem(String item){
        getSearchField().clear();
        getSearchField().sendKeys(item);
        getSearchButton().click();
    }

}