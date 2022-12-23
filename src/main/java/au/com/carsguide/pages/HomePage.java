package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement buySell;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement search;
    @CacheLookup
    @FindBy(xpath = "(//a[contains(text(),'Used')])[1]")
    WebElement used;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Find a Dealer')]")
    WebElement dealer;


    public void hoveringMouseOverBuySellLink() {
        mouseHoverToElement(buySell);
    }


    public void clickOnSearchLink() {
        clickOnElement(search);
    }

    public void clickOnUsedLink() {
        clickOnElement(used);
    }
    public void clickOnDealerLink() {
        clickOnElement(dealer);
    }
}
