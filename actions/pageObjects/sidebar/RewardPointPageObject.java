package pageObjects.sidebar;

import org.openqa.selenium.WebDriver;
import pageObjects.SideBarPageObject;

public class RewardPointPageObject extends SideBarPageObject {
    WebDriver driver;

    public RewardPointPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;

    }


}
