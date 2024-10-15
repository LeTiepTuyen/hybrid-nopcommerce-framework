package pageObjects.nopCommerce.users;


import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageObjects.nopCommerce.PageGeneratorManager;
import pageUIs.nopCommerce.users.UserRegisterPageUI;


public class UserRegisterPO extends BasePage {
    WebDriver driver;

    public UserRegisterPO(WebDriver driver) {
        this.driver = driver;
    }

    public void clickToMaleRadio() {
        waitForElementClickable(driver, UserRegisterPageUI.GENDER_MALE_RADIO);
        checkToTheCheckBoxOrRadio(driver, UserRegisterPageUI.GENDER_MALE_RADIO);
    }

    public void enterToFirstNameTextBox(String firstName) {
        waitForElementVisible(driver, UserRegisterPageUI.FIRST_NAME_TEXTBOX);
        sendKeyToElement(driver, UserRegisterPageUI.FIRST_NAME_TEXTBOX, firstName);
    }

    public void enterToLastNameTextBox(String lastName) {
        waitForElementVisible(driver, UserRegisterPageUI.LAST_NAME_TEXTBOX);
        sendKeyToElement(driver, UserRegisterPageUI.LAST_NAME_TEXTBOX, lastName);
    }

    public void selectDayDropdown(String day) {
        waitForElementClickable(driver, UserRegisterPageUI.DAY_DROPDOWN);
        selectItemInDropDown(driver, UserRegisterPageUI.DAY_DROPDOWN, day);
    }

    public void selectMonthDropdown(String month) {
        waitForElementClickable(driver, UserRegisterPageUI.MONTH_DROPDOWN);
        selectItemInDropDown(driver, UserRegisterPageUI.MONTH_DROPDOWN, month);
    }

    public void selectYearDropdown(String year) {
        waitForElementClickable(driver, UserRegisterPageUI.YEAR_DROPDOWN);
        selectItemInDropDown(driver, UserRegisterPageUI.YEAR_DROPDOWN, year);
    }

    public void enterToEmailTextBox(String emailAddress) {
        waitForElementVisible(driver, UserRegisterPageUI.EMAIL_TEXTBOX);
        sendKeyToElement(driver, UserRegisterPageUI.EMAIL_TEXTBOX, emailAddress);
    }

    public void enterToCompanyTextBox(String companyName) {
        waitForElementVisible(driver, UserRegisterPageUI.COMPANY_TEXTBOX);
        sendKeyToElement(driver, UserRegisterPageUI.COMPANY_TEXTBOX, companyName);
    }

    public void enterToPasswordTextBox(String password) {
        waitForElementVisible(driver, UserRegisterPageUI.PASSWORD_TEXTBOX);
        sendKeyToElement(driver, UserRegisterPageUI.PASSWORD_TEXTBOX, password);
    }

    public void enterToConfirmPasswordTextBox(String password) {
        waitForElementVisible(driver, UserRegisterPageUI.CONFIRM_PASSWORD_TEXTBOX);
        sendKeyToElement(driver, UserRegisterPageUI.CONFIRM_PASSWORD_TEXTBOX, password);
    }

    public UserHomePO clickToRegisterButton() {
        waitForElementClickable(driver, UserRegisterPageUI.REGISTER_BUTTON);
        clickToElement(driver, UserRegisterPageUI.REGISTER_BUTTON);
        return PageGeneratorManager.getUserHomePage(driver);
    }

    public UserHomePO clickToLogoutLink() {
        waitForElementClickable(driver, UserRegisterPageUI.LOGOUT_LINK);
        clickToElement(driver, UserRegisterPageUI.LOGOUT_LINK);
        return PageGeneratorManager.getUserHomePage(driver);
    }

    public String getRegisterSuccessMessage() {
        waitForElementVisible(driver, UserRegisterPageUI.REGISTER_SUCCESS_MESSAGE);
        return getTextElement(driver, UserRegisterPageUI.REGISTER_SUCCESS_MESSAGE);
    }

    public String getRegisterPageTitle() {
        waitForElementVisible(driver, UserRegisterPageUI.REGISTER_PAGE_TITLE);
        return getTextElement(driver, UserRegisterPageUI.REGISTER_PAGE_TITLE);
    }
}
