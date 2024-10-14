package pageObjects.nopCommerce.users;

import org.openqa.selenium.WebDriver;
import pageUIs.nopCommerce.users.UserCustomerInfoPageUI;

public class UserCustomerInfoPO extends UserSideBarPO {
    WebDriver driver;

    public UserCustomerInfoPO(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public boolean isGenderMaleRadioButtonSelected() {
        waitForElementTobeSelected(driver, UserCustomerInfoPageUI.GENDER_MALE_RADIO);
        return isElementSelected(driver, UserCustomerInfoPageUI.GENDER_MALE_RADIO);
    }

    public String getFirstNameTextBoxValue() {
        waitForElementVisible(driver, UserCustomerInfoPageUI.FIRST_NAME_TEXTBOX);
        return getElementAttribute(driver, UserCustomerInfoPageUI.FIRST_NAME_TEXTBOX, "value");
    }

    public String getLastNameTextBoxValue() {
        waitForElementVisible(driver, UserCustomerInfoPageUI.LAST_NAME_TEXTBOX);
        return getElementAttribute(driver, UserCustomerInfoPageUI.LAST_NAME_TEXTBOX, "value");
    }

    public String getSelectedTextInDayDropdown() {
        waitForElementVisible(driver, UserCustomerInfoPageUI.DAY_DROPDOWN);
        return getSelectedItemInDropDown(driver, UserCustomerInfoPageUI.DAY_DROPDOWN);
    }

    public String getSelectedTextInMonthDropdown() {
        waitForElementVisible(driver, UserCustomerInfoPageUI.MONTH_DROPDOWN);
        return getSelectedItemInDropDown(driver, UserCustomerInfoPageUI.MONTH_DROPDOWN);
    }

    public String getSelectedTextInYearDropdown() {
        waitForElementVisible(driver, UserCustomerInfoPageUI.YEAR_DROPDOWN);
        return getSelectedItemInDropDown(driver, UserCustomerInfoPageUI.YEAR_DROPDOWN);
    }

    public String getEmailTextBoxValue() {
        waitForElementVisible(driver, UserCustomerInfoPageUI.EMAIL_TEXTBOX);
        return getElementAttribute(driver, UserCustomerInfoPageUI.EMAIL_TEXTBOX, "value");
    }

    public String getCompanyTextBoxValue() {
        waitForElementVisible(driver, UserCustomerInfoPageUI.COMPANY_TEXTBOX);
        return getElementAttribute(driver, UserCustomerInfoPageUI.COMPANY_TEXTBOX, "value");
    }


}
