package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.RewardPointPageUI;

public class RewardPointPageObject extends SideBarPageObject {
    WebDriver driver;

    public RewardPointPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;

    }


}
