package pageObjects.users;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGeneratorManager;
import pageUIs.users.UserSideBarUI;

public class UserSideBarPO extends BasePage {

    WebDriver driver;

    public UserSideBarPO(WebDriver driver) {
        this.driver = driver;
    }

    public UserAddressPO openAddressPage() {
        waitForElementClickable(driver, UserSideBarUI.ADDRESS_LINK);
        clickToElement(driver, UserSideBarUI.ADDRESS_LINK);
        return PageGeneratorManager.getUserAddressPage(driver);
    }

    public UserRewardPointPO openRewardPointPage() {
        waitForElementClickable(driver, UserSideBarUI.REWARD_POINT_LINK);
        clickToElement(driver, UserSideBarUI.REWARD_POINT_LINK);
        return PageGeneratorManager.getUserRewardPointPage(driver);
    }

    public UserCustomerInfoPO openCustomerInfoPage() {
        waitForElementClickable(driver, UserSideBarUI.CUSTOMER_INFO_LINK);
        clickToElement(driver, UserSideBarUI.CUSTOMER_INFO_LINK);
        return PageGeneratorManager.getUserCustomerInfoPage(driver);
    }


    public UserOrderPO openOrderPage() {
        waitForElementClickable(driver, UserSideBarUI.ORDER_LINK);
        clickToElement(driver, UserSideBarUI.ORDER_LINK);
        return PageGeneratorManager.getUserOrderPage(driver);
    }

    public UserSideBarPO openSideBarPageByName(String pageName) {
        waitForElementClickable(driver, UserSideBarUI.DYNAMIC_PAGE_LINK_BY_NAME, pageName);
        clickToElement(driver, UserSideBarUI.DYNAMIC_PAGE_LINK_BY_NAME, pageName);

        switch (pageName) {
            case "addresses":
                return PageGeneratorManager.getUserAddressPage(driver);
            case "order":
                return PageGeneratorManager.getUserOrderPage(driver);
            case "info":
                return PageGeneratorManager.getUserCustomerInfoPage(driver);
            case "rewardpoints":
                return PageGeneratorManager.getUserRewardPointPage(driver);
            default:
                return null;
        }
    }

    public void openSideBarPageByNames(String pageName) {
        waitForElementClickable(driver, UserSideBarUI.DYNAMIC_PAGE_LINK_BY_NAME, pageName);
        clickToElement(driver, UserSideBarUI.DYNAMIC_PAGE_LINK_BY_NAME, pageName);
    }
}
