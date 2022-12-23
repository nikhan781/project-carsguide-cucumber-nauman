package au.com.carsguide.steps;

import au.com.carsguide.pages.DealerPage;
import au.com.carsguide.pages.HomePage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.util.List;

public class FindDealerSteps {
    @And("^I click Find a Dealer$")
    public void iClickFindADealer() {
        new HomePage().clickOnDealerLink();
    }

    @Then("^I navigate to car-dealers page$")
    public void iNavigateToCarDealersPage() {
        Assert.assertEquals("Find a Car Dealership Near You", new DealerPage().getDealerPageText());
    }

    @And("^I should see the dealer names <dealersName> are display on page$")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage(DataTable table) {
        List<String> expectedList = table.asList(String.class);
        for (String data : expectedList) {
            while (new DealerPage().getListOfDealers(data) == null) {
                new DealerPage().clickOnNextButton();
            }
            org.junit.Assert.assertEquals(table, new DealerPage().getListOfDealers(data));
        }

    }
}
