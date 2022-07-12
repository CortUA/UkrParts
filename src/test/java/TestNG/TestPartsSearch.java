package TestNG;

import PageObjects.UkrPartsPageHelper;
import PageObjects.UkrPartsSearchResultPageHelper;
import holders.TestInit;
import org.testng.annotations.Test;

public class TestPartsSearch extends TestInit {


    @Test
    public void ukrParts(){
        UkrPartsPageHelper ukrPartsPageHelper = new UkrPartsPageHelper(driver);
        ukrPartsPageHelper.goToHomePage();
        ukrPartsPageHelper.searchItem("Шины");
        UkrPartsSearchResultPageHelper ukrPartsSearchResultPageHelper = new UkrPartsSearchResultPageHelper(driver);
        ukrPartsSearchResultPageHelper.selectFirstElement();



    }
}