package holders;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DriverHolder {

    protected WebDriver driver;
    public DriverHolder(WebDriver driver){
        this.driver = driver;
    }
    public DriverHolder goToHomePage() {
        driver.get("https://ukrparts.com.ua");
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
        new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>)
                wd -> ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
        return null;
    }
   /* protected void waitForIt(String xpath){
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }*/


}