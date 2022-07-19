package PageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import sun.font.CreatedFontTracker;

public class UkrPartsSearchResultPageElements extends DriverHolder {
    public UkrPartsSearchResultPageElements(WebDriver driver){
        super(driver);
    }

    private String firstSearchResult = "//div[@class='part_img']";
    public WebElement getFirstSearchResult(){
        return getElementsByXpath(firstSearchResult).get(1);
    }


}
