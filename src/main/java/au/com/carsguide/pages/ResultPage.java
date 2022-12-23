package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='listing-col listing-col-title col-sm-16 col-md-12 col-lg-13 col location-set']//h1")
    WebElement resultText;

    public String getResultPageText() throws InterruptedException {
        return getTextFromElement(resultText);
    }
}
