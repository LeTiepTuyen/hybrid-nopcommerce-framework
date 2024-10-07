package com.nopcommerce.users;

import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageObjects.CustomerInfoPageObject;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.RegisterPageObject;

public class Level_04_Multiple_Browsers extends BaseTest {

    private WebDriver driver;

    private HomePageObject homePage;
    private LoginPageObject loginPage;
    private CustomerInfoPageObject customerInfoPage;
    private RegisterPageObject registerPage;
    private String firstName, lastName, emailAddress, companyName, password, day, month, year;

    @Parameters("browser")
    @BeforeClass
    public void beforeClass(String browserName) {


        driver = getBrowserDriver(browserName);

        homePage = new HomePageObject(driver);
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
        homePage.openRegisterPage();
        registerPage = new RegisterPageObject(driver);

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

        registerPage.clickToLogoutLink();


    }

    @Test
    public void User_02_Login() {
        homePage = new HomePageObject(driver);
        homePage.openHomePage();

        loginPage = new LoginPageObject(driver);
        loginPage.enterToEmailTextBox(emailAddress);
        loginPage.enterToPasswordTextBox(password);
        loginPage.openLoginPage();

        homePage = new HomePageObject(driver);
        Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
        homePage.openCustomerInfoPage();


    }

    @Test
    public void User_03_MyAccount() {
        customerInfoPage = new CustomerInfoPageObject(driver);
        Assert.assertTrue(customerInfoPage.isGenderMaleRadioButtonSelected());
        Assert.assertEquals(customerInfoPage.getFirstNameTextBoxValue(), firstName);
        Assert.assertEquals(customerInfoPage.getLastNameTextBoxValue(), lastName);
        Assert.assertEquals(customerInfoPage.getSelectedTextInDayDropdown(), day);
        Assert.assertEquals(customerInfoPage.getSelectedTextInMonthDropdown(), month);
        Assert.assertEquals(customerInfoPage.getSelectedTextInYearDropdown(), year);
        Assert.assertEquals(customerInfoPage.getEmailTextBoxValue(), emailAddress);
        Assert.assertEquals(customerInfoPage.getCompanyTextBoxValue(), companyName);


    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
