package com.nopcommerce.users;

import commons.BasePage;
import commons.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObjects.CustomerInfoObject;
import pageObjects.HomePageObject;
import pageObjects.LoginPageObject;
import pageObjects.RegisterPageObject;

import java.time.Duration;
import java.util.Random;

public class Level_03_Page_Object_Pattern extends BaseTest {

    WebDriver driver;

    private HomePageObject homePage;
    private LoginPageObject loginPage;
    private CustomerInfoObject customerInfoPage;
    private RegisterPageObject registerPage;
    private String firstName, lastName, emailAddress, companyName, password, day, month, year;

    @BeforeClass
    public void beforeClass() {
        driver = new FirefoxDriver();

        driver.get("http://demo.nopcommerce/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
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
        homePage.clickToRegisterLink();
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
//        waitForElementClickable(driver, "//a[@class='ico-register']");
//        clickToElement(driver, "//a[@class='ico-register']");
//
//        waitForElementClickable(driver, "//input[@id='gender-male']");
//        clickToElement(driver, "//input[@id='gender-male']");
//
//        sendKeyToElement(driver, "//input[@id='FirstName']", firstName);
//        sendKeyToElement(driver, "//input[@id='LastName']", lastName);
//
//        selectItemInDropDown(driver, "//select[@name='DateOfBirthDay']", day);
//        selectItemInDropDown(driver, "//select[@name='DateOfBirthMonth']", month);
//        selectItemInDropDown(driver, "//select[@name='DateOfBirthYear']", year);
//
//
//        sendKeyToElement(driver, "//input[@id='Email']", emailAddress);
//        sendKeyToElement(driver, "//input[@id='Company']", companyName);
//        sendKeyToElement(driver, "//input[@id='Password']", password);
//        sendKeyToElement(driver, "//input[@id='ConfirmPassword']", password);
//
//        waitForElementClickable(driver, "//button[@id='register-button']");
//        clickToElement(driver, "//button[@id='register-button']");
//
//
//        Assert.assertEquals(getTextElement(driver, "//div[@class='result']"), "Your registration completed");


    }

    @Test
    public void User_02_Login() {
        homePage = new HomePageObject(driver);
        homePage.clickToLoginLink();

        loginPage = new LoginPageObject(driver);
        loginPage.enterToEmailTextBox(emailAddress);
        loginPage.enterToPasswordTextBox(password);
        loginPage.clickToLoginButton();

        homePage = new HomePageObject(driver);
        Assert.assertTrue(homePage.isMyAccountLinkDisplayed());
        homePage.clickToMyAccountLink();


//        waitForElementClickable(driver, "//a[@class='ico-logout']");
//        clickToElement(driver, "//a[@class='ico-logout']");
//
//        waitForElementClickable(driver, "//a[@class='ico-login']");
//        clickToElement(driver, "//a[@class='ico-login']");
//
//        sendKeyToElement(driver, "//input[@id='Email']", emailAddress);
//        sendKeyToElement(driver, "//input[@id='Password']", password);
//
//        waitForElementClickable(driver, "//button[contains(@class,'login-button')]");
//        clickToElement(driver, "//button[contains(@class,'login-button')]");
//
//        Assert.assertTrue(isElementDisplayed(driver, "//a[@class='ico-account']"));

    }

    @Test
    public void User_03_MyAccount() {
        customerInfoPage = new CustomerInfoObject(driver);
        Assert.assertTrue(customerInfoPage.isGenderMaleRadioButtonSelected());
        Assert.assertEquals(customerInfoPage.getFirstNameTextBoxValue(), firstName);
        Assert.assertEquals(customerInfoPage.getLastNameTextBoxValue(), lastName);
        Assert.assertEquals(customerInfoPage.getSelectedTextInDayDropdown(), day);
        Assert.assertEquals(customerInfoPage.getSelectedTextInMonthDropdown(), month);
        Assert.assertEquals(customerInfoPage.getSelectedTextInYearDropdown(), year);
        Assert.assertEquals(customerInfoPage.getEmailTextBoxValue(), emailAddress);
        Assert.assertEquals(customerInfoPage.getCompanyTextBoxValue(), companyName);


//        waitForElementClickable(driver, "//a[@class='ico-account']");
//        clickToElement(driver, "//a[@class='ico-account']");
//
//        Assert.assertTrue(isElementSelected(driver, "//input[@id='gender-male']"));
//        Assert.assertEquals(getElementAttribute(driver, "//input[@id='FirstName']", "value"), firstName);
//        Assert.assertEquals(getElementAttribute(driver, "//input[@id='LastName']", "value"), lastName);
//        Assert.assertEquals(getSelectedItemInDropDown(driver, "//select[@name='DateOfBirthDay']"), day);
//        Assert.assertEquals(getSelectedItemInDropDown(driver, "//select[@name='DateOfBirthMonth']"), month);
//        Assert.assertEquals(getSelectedItemInDropDown(driver, "//select[@name='DateOfBirthYear']"), year);
//        Assert.assertEquals(getElementAttribute(driver, "//input[@id='Email']", "value"), emailAddress);
//        Assert.assertEquals(getElementAttribute(driver, "//input[@id='Company']", "value"), companyName);


    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }
}
