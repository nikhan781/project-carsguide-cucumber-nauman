package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarSearchPage;
import au.com.carsguide.pages.ResultPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BuySteps {
    public static WebDriver driver;

    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on buy\\+sell tab$")
    public void iMouseHoverOnBuySellTab() throws InterruptedException {
        Thread.sleep(1500);
        new HomePage().hoveringMouseOverBuySellLink();
    }

    @And("^I click \"([^\"]*)\" link$")
    public void iClickLink(String searchText) throws InterruptedException {
        new HomePage().clickOnSearchLink();
        Thread.sleep(1500);
    }

    @And("^I navigate to new and used car search page$")
    public void iNavigateToNewAndUsedCarSearchPage() throws InterruptedException {
        Assert.assertEquals("New & Used Car Search - carsguide", new NewAndUsedCarSearchPage().getPageTitle());
    }

    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String make) {
        new NewAndUsedCarSearchPage().selectCarMake(make);

    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String model) {
        new NewAndUsedCarSearchPage().selectModel(model);

    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String location) {
        new NewAndUsedCarSearchPage().selectLocation(location);
    }

    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price) {
        new NewAndUsedCarSearchPage().selectPrice(price);

    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCarButton();
    }

    @Then("^I should see the make \"([^\"]*)\" in results$")
    public void iShouldSeeTheMakeInResults(String text) throws InterruptedException {
        Assert.assertTrue(new ResultPage().getResultPageText().contains(text));
    }

    @And("^I click Used link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedLink();
    }

    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
        Assert.assertEquals("Used Cars For Sale", new NewAndUsedCarSearchPage().getPageTitle());
    }
}
