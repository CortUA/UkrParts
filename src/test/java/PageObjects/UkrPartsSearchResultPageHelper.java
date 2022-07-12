package PageObjects;

import org.openqa.selenium.WebDriver;

public class UkrPartsSearchResultPageHelper extends UkrPartsSearchResultPageElements {
    public UkrPartsSearchResultPageHelper(WebDriver driver){
        super(driver);
    }
    public void selectFirstElement(){
        getFirstSearchResult().click();
    }



}
