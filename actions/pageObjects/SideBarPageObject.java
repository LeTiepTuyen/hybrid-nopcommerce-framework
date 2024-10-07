package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.sidebar.AddressPageObject;
import pageObjects.sidebar.CustomerInfoPageObject;
import pageObjects.sidebar.OrderPageObject;
import pageObjects.sidebar.RewardPointPageObject;
import pageUIs.SideBarUI;

public class SideBarPageObject extends BasePage {

    WebDriver driver;

    public SideBarPageObject(WebDriver driver) {
        this.driver = driver;
    }

    public AddressPageObject openAddressPage() {
        waitForElementClickable(driver, SideBarUI.ADDRESS_LINK);
        clickToElement(driver, SideBarUI.ADDRESS_LINK);
        return PageGeneratorManager.getAddressPage(driver);
    }

    public RewardPointPageObject openRewardPointPage() {
        waitForElementClickable(driver, SideBarUI.REWARD_POINT_LINK);
        clickToElement(driver, SideBarUI.REWARD_POINT_LINK);
        return PageGeneratorManager.getRewardPointPage(driver);
    }

    public CustomerInfoPageObject openCustomerInfoPage() {
        waitForElementClickable(driver, SideBarUI.CUSTOMER_INFO_LINK);
        clickToElement(driver, SideBarUI.CUSTOMER_INFO_LINK);
        return PageGeneratorManager.getCustomerInfoPage(driver);
    }


    public OrderPageObject openOrderPage() {
        waitForElementClickable(driver, SideBarUI.ORDER_LINK);
        clickToElement(driver, SideBarUI.ORDER_LINK);
        return PageGeneratorManager.getOrderPage(driver);
    }
}
