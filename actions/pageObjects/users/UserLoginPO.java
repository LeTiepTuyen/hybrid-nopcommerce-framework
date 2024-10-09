package pageObjects.users;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.PageGeneratorManager;
import pageUIs.users.UserLoginPageUI;

public class UserLoginPO extends BasePage {

    WebDriver driver;

    public UserLoginPO(WebDriver driver) {
        this.driver = driver;
    }

    public void enterToEmailTextBox(String emailAddress) {
        waitForElementVisible(driver, UserLoginPageUI.EMAIL_TEXTBOX);
        sendKeyToElement(driver, UserLoginPageUI.EMAIL_TEXTBOX, emailAddress);
    }

    public void enterToPasswordTextBox(String password) {
        waitForElementVisible(driver, UserLoginPageUI.PASSWORD_TEXTBOX);
        sendKeyToElement(driver, UserLoginPageUI.PASSWORD_TEXTBOX, password);
    }

    public void openLoginPage() {
        waitForElementClickable(driver, UserLoginPageUI.LOGIN_BUTTON);
        clickToElement(driver, UserLoginPageUI.LOGIN_BUTTON);
    }

    public UserHomePO loginToSystem(String emailAddress, String password) {
        enterToEmailTextBox(emailAddress);
        enterToPasswordTextBox(password);
        openLoginPage();
        return PageGeneratorManager.getUserHomePage(driver);
    }
}
