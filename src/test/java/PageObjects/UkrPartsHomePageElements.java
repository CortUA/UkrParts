package PageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UkrPartsHomePageElements extends DriverHolder {

    public UkrPartsHomePageElements(WebDriver driver) {
        super(driver);
    }
    private String searchField = "//input[@id='artnum']";
    private String searchButton = "//button[@class='btn btn-sm btn-success searchButton']";



    public WebElement getSearchField(){
        return getElementByXpath(searchField);
    }
    public WebElement getSearchButton(){
        return getElementsByXpath(searchButton).get(0);
    }

}
