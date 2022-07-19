package TestNG;

import PageObjects.UkrPartsPageHelper;
import holders.TestInit;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class TestUkrPartsLogIn extends TestInit {

    @Test
    public void ukrPartsLogIn() throws InterruptedException {
        UkrPartsPageHelper ukrPartsPageHelper = new UkrPartsPageHelper(driver);
        ukrPartsPageHelper.goToHomePage();
        ukrPartsPageHelper.logIn("dima.opanasiuk@gmail.com","VseDlyaLancer9");

        sleep(500);

        String expectedUrl = "https://ukrparts.com.ua/category/car/17752/";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl);
    }



}
