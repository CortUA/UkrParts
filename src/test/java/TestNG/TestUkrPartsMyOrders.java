package TestNG;

import PageObjects.UkrPartsPageHelper;
import PageObjects.UkrPartsUserPageElements;
import PageObjects.UkrPartsUserPageHelper;
import holders.TestInit;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestUkrPartsMyOrders extends TestInit {

    @Test
            public void ukrPartsMyOrders() throws InterruptedException {
        UkrPartsPageHelper ukrPartsPageHelper = new UkrPartsPageHelper(driver);
        ukrPartsPageHelper.goToHomePage();
        ukrPartsPageHelper.logIn("dima.opanasiuk@gmail.com", "VseDlyaLancer9");
        UkrPartsUserPageHelper ukrPartsUserPageHelper = new UkrPartsUserPageHelper(driver);
      
        ukrPartsUserPageHelper.selectMyOrders();

    }
}
