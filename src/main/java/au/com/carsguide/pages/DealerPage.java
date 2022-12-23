package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class DealerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Next')]")
    WebElement nextButton;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Find a Car Dealership Near You')]")
    WebElement dealerPageText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='dealerListing--name']")
    List<WebElement> dealersList;

    public String getDealerPageText() {
        return getTextFromElement(dealerPageText);
    }

    public List getListOfDealers(String d) {
        List<WebElement> list = dealersList;
        ArrayList dealers = new ArrayList<>();
        for (WebElement l : list)
            dealers.add(l.getText());
        return dealers;
    }
    public void clickOnNextButton() {
       // log.info(("click on next button" + nextButton.getText()));
        clickOnElement(nextButton);
    }


}