package TestNG;

import PageObjects.UkrPartsPageHelper;
import holders.TestInit;
import org.testng.annotations.Test;

public class TestUkrPartsAirMenuHomePage extends TestInit {

    @Test
    public void testAir(){
        UkrPartsPageHelper ukrPartsPageHelper = new UkrPartsPageHelper(driver);
        ukrPartsPageHelper.goToHomePage();
        ukrPartsPageHelper.moveToAirMenu();


    }

}
