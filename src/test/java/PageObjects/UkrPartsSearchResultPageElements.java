package PageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sun.font.CreatedFontTracker;

public class UkrPartsSearchResultPageElements extends DriverHolder {
    public UkrPartsSearchResultPageElements(WebDriver driver){
        super(driver);
    }

    private String firstSearchResult = "//a[@href='/category/zapchasti-dlya-to/c-8/car/17752/']";
    public WebElement getFirstSearchResult(){
        return getElementByXpath(firstSearchResult);
    }


}
