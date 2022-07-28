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
    private String catalogButton = "//a[@href='/category/']"; // всього три кнопки каталога на домашній сторінці
    private String emailField = "//input[@placeholder='E-Mail']";
    private String passwordField = "//input[@placeholder='Пароль']";
    private String loginButton = "//button[@class='btn btn-sm btn-success authTop']";
    private String airMenuField = "//*[@href='/category/korobka-peredach/c-4/']"; // Одно из множества полей

    public WebElement getSearchField(){
        return getElementByXpath(searchField);
    }
    public WebElement getSearchButton(){
        return getElementsByXpath(searchButton).get(0);
    }
    public WebElement getCatalogButton(){
        return getElementsByXpath(catalogButton).get(1);
    }

    public WebElement getEmailField(){
        return getElementByXpath(emailField);
    }
    public WebElement getPasswordField(){
        return getElementByXpath(passwordField);
    }
    public WebElement getLogInButton(){
        return getElementByXpath(loginButton);
    }
    public WebElement getAirMenuField(){
        return getElementByXpath(airMenuField);
    }



}
