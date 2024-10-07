package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.AddressPageUI;
import pageUIs.RewardPointPageUI;

public class AddressPageObject extends SideBarPageObject {

    WebDriver driver;

    public AddressPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


}
