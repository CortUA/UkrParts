package TestNG;

import PageObjects.UkrPartsPageHelper;
import PageObjects.UkrPartsUserPageHelper;
import holders.TestInit;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class TestUkrPartsMyProfile extends TestInit {
    @Test
    public void ukrPratsMyProfile() throws InterruptedException {
        UkrPartsPageHelper ukrPartsPageHelper = new UkrPartsPageHelper(driver);
        ukrPartsPageHelper.goToHomePage();
        ukrPartsPageHelper.logIn("dima.opanasiuk@gmail.com", "VseDlyaLancer9");
        UkrPartsUserPageHelper ukrPartsUserPageHelper = new UkrPartsUserPageHelper(driver);
        sleep(100);
        ukrPartsUserPageHelper.selectMyProfile();
    }
}
