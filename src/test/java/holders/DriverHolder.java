package holders;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class DriverHolder {

    protected WebDriver driver;
    public DriverHolder(WebDriver driver){
        this.driver = driver;
    }
    public DriverHolder goToHomePage() {
        driver.get("https://ukrparts.com.ua/category/car/17752/");
        return new DriverHolder(driver);
    }

    protected WebElement getElementByXpath(String xpath){
        int timeToWait = 15;
        return (new WebDriverWait(driver, timeToWait)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    protected List<WebElement> getElementsByXpath(String xpath){
        int timeToWait = 15;
        return (new WebDriverWait(driver, timeToWait)).until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
    }
    protected DriverHolder waitForPageLoad(){
        new WebDriverWait(driver, 30).until((ExpectedConditions<Boolean>)
                wd -> ((JavascriptExecutor) wd).executeScript("return document, readyState").equals("complete"));
        return null;
    }


}