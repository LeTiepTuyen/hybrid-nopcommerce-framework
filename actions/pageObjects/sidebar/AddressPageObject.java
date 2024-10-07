package pageObjects.sidebar;

import org.openqa.selenium.WebDriver;
import pageObjects.SideBarPageObject;

public class AddressPageObject extends SideBarPageObject {

    WebDriver driver;

    public AddressPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }


}
