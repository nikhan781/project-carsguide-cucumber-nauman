package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarSearchPage extends Utility {

    public NewAndUsedCarSearchPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='heading main-heading item-ad-wrapper ']//h1")
    WebElement pageText;

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement carMake;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement anyModel;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement anyLocation;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement price;

    @CacheLookup
    @FindBy(css = "#search-submit")
    WebElement findMyNextCarButton;

    public String getPageTitle()  {
        return getTextFromElement(pageText);
    }


    public void selectCarMake(String make) {
        selectByVisibleTextFromDropDown(carMake, make);
    }

    public void selectModel(String model) {
        selectByVisibleTextFromDropDown(anyModel, model);
    }

    public void selectLocation(String location) {
        selectByVisibleTextFromDropDown(anyLocation, location);
    }

    public void selectPrice(String price1) {
        selectByVisibleTextFromDropDown(price, price1);
    }

    public void clickOnFindMyNextCarButton() {
        clickOnElement(findMyNextCarButton);
    }
}
