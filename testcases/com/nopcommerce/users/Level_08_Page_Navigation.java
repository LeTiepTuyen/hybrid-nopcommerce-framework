package com.nopcommerce.users;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.nopCommerce.PageGeneratorManager;
import pageObjects.nopCommerce.users.UserAddressPO;
import pageObjects.nopCommerce.users.UserCustomerInfoPO;
import pageObjects.nopCommerce.users.UserOrderPO;
import pageObjects.nopCommerce.users.UserRewardPointPO;
import pageObjects.nopCommerce.users.UserHomePO;
import pageObjects.nopCommerce.users.UserLoginPO;
import pageObjects.nopCommerce.users.UserRegisterPO;

public class Level_08_Page_Navigation extends BaseTest {

    private WebDriver driver;

    private UserHomePO homePage;
    private UserLoginPO loginPage;
    private UserCustomerInfoPO customerInfoPage;
    private UserRegisterPO registerPage;
    private UserAddressPO addressPage;
    private UserRewardPointPO rewardPointPage;
    private UserOrderPO orderPage;
    private String firstName, lastName, emailAddress, companyName, password, day, month, year;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName) {


        driver = getBrowserDriver(browserName);

        homePage = PageGeneratorManager.getUserHomePage(driver);
        firstName = "John";
        lastName = "Wick";
        emailAddress = "johnwick" + generatedRandomNumber() + "@gmail.com";
        companyName = "John Wick Company";
        password = "123456789";
        day = "31";
        month = "January";
        year = "2002";


    }


    @Test
    public void User_01_Register() {

        registerPage = homePage.openRegisterPage();

        registerPage.clickToMaleRadio();
        registerPage.enterToFirstNameTextBox(firstName);
        registerPage.enterToLastNameTextBox(lastName);
        registerPage.selectDayDropdown(day);
        registerPage.selectMonthDropdown(month);
        registerPage.selectYearDropdown(year);
        registerPage.enterToEmailTextBox(emailAddress);
        registerPage.enterToCompanyTextBox(companyName);
        registerPage.enterToPasswordTextBox(password);
        registerPage.enterToConfirmPasswordTextBox(password);
        registerPage.clickToRegisterButton();
        Assert.assertEquals(registerPage.getRegisterSuccessMessage(), "Your registration completed");

    }

    @Test
    public void User_02_Login() {
        homePage = registerPage.clickToLogoutLink();
        loginPage = homePage.openHomePage();


        homePage = loginPage.loginToSystem(emailAddress, password);
        Assert.assertTrue(homePage.isMyAccountLinkDisplayed());


    }

    @Test
    public void User_03_MyAccount() {
        customerInfoPage = homePage.openCustomerInfoPage();
        Assert.assertTrue(customerInfoPage.isGenderMaleRadioButtonSelected());
        Assert.assertEquals(customerInfoPage.getFirstNameTextBoxValue(), firstName);
        Assert.assertEquals(customerInfoPage.getLastNameTextBoxValue(), lastName);
        Assert.assertEquals(customerInfoPage.getSelectedTextInDayDropdown(), day);
        Assert.assertEquals(customerInfoPage.getSelectedTextInMonthDropdown(), month);
        Assert.assertEquals(customerInfoPage.getSelectedTextInYearDropdown(), year);
        Assert.assertEquals(customerInfoPage.getEmailTextBoxValue(), emailAddress);
        Assert.assertEquals(customerInfoPage.getCompanyTextBoxValue(), companyName);


    }

    @Test
    public void User_04_Swich_Page() {
        // Customer Info -> Address
        addressPage = customerInfoPage.openAddressPage();
        // Address -> Reward Points
        rewardPointPage = addressPage.openRewardPointPage();
        // Reward Points -> Orders
        orderPage = rewardPointPage.openOrderPage();
        // Orders -> Address
        addressPage = orderPage.openAddressPage();
        // Address -> Customer Info
        customerInfoPage = addressPage.openCustomerInfoPage();


    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
