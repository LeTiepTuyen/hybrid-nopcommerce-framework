package pageObjects;

import commons.BasePage;
import org.openqa.selenium.WebDriver;
import pageUIs.CustomerInfoPageUI;

public class CustomerInfoObject extends BasePage {
    WebDriver driver;

    public CustomerInfoObject(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isGenderMaleRadioButtonSelected() {
        return waitForElementTobeSelected(driver, CustomerInfoPageUI.GENDER_MALE_RADIO);
//        return isElementSelected(driver, CustomerInfoPageUI.GENDER_MALE_RADIO);
    }

    public String getFirstNameTextBoxValue() {
        waitForElementVisible(driver, CustomerInfoPageUI.FIRST_NAME_TEXTBOX);
        return getElementAttribute(driver, CustomerInfoPageUI.FIRST_NAME_TEXTBOX, "value");
    }

    public String getLastNameTextBoxValue() {
        waitForElementVisible(driver, CustomerInfoPageUI.LAST_NAME_TEXTBOX);
        return getElementAttribute(driver, CustomerInfoPageUI.LAST_NAME_TEXTBOX, "value");
    }

    public String getSelectedTextInDayDropdown() {
        waitForElementVisible(driver, CustomerInfoPageUI.DAY_DROPDOWN);
        return getSelectedItemInDropDown(driver, CustomerInfoPageUI.DAY_DROPDOWN);
    }

    public String getSelectedTextInMonthDropdown() {
        waitForElementVisible(driver, CustomerInfoPageUI.MONTH_DROPDOWN);
        return getSelectedItemInDropDown(driver, CustomerInfoPageUI.MONTH_DROPDOWN);
    }

    public String getSelectedTextInYearDropdown() {
        waitForElementVisible(driver, CustomerInfoPageUI.YEAR_DROPDOWN);
        return getSelectedItemInDropDown(driver, CustomerInfoPageUI.YEAR_DROPDOWN);
    }

    public String getEmailTextBoxValue() {
        waitForElementVisible(driver, CustomerInfoPageUI.EMAIL_TEXTBOX);
        return getElementAttribute(driver, CustomerInfoPageUI.EMAIL_TEXTBOX, "value");
    }

    public String getCompanyTextBoxValue() {
        waitForElementVisible(driver, CustomerInfoPageUI.COMPANY_TEXTBOX);
        return getElementAttribute(driver, CustomerInfoPageUI.COMPANY_TEXTBOX, "value");
    }
}
