package TestNG;

import PageObjects.UkrPartsPageHelper;
import holders.TestInit;
import org.testng.annotations.Test;

public class TestPartsCatalog extends TestInit {

    @Test
    public void ukrPartsCatalog(){
        UkrPartsPageHelper ukrPartsPageHelper = new UkrPartsPageHelper(driver);
        ukrPartsPageHelper.goToHomePage();
        ukrPartsPageHelper.getCatalogButton();
    }
}
