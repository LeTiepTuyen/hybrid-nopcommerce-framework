package pageObjects.sidebar;

import org.openqa.selenium.WebDriver;
import pageObjects.SideBarPageObject;

public class OrderPageObject extends SideBarPageObject {
    WebDriver driver;

    public OrderPageObject(WebDriver driver) {
        super(driver);
        this.driver = driver;

    }


}
