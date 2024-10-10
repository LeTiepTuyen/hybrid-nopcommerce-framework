package commons;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.Random;

public class BaseTest {
    private WebDriver driver;

    protected WebDriver getBrowserDriver(String browserName) {
        BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());
        switch (browserList) {
            case FIREFOX -> {
//              System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
//                driver = WebDriverManager.firefoxdriver().create();
                driver = new FirefoxDriver();

            }
            case CHROME -> {
//                System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
//                driver = WebDriverManager.chromedriver().create();
                driver = new ChromeDriver();

            }
            case EDGE -> {
//                System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
//                driver = WebDriverManager.edgedriver().create();
                driver = new EdgeDriver();

            }
            case SAFARI -> driver = new SafariDriver();
            default -> throw new IllegalArgumentException("Browser name is not valid: " + browserName);
        }


        driver.get("http://demo.nopcommerce/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }

    protected WebDriver getBrowserDriver(String browserName, String url) {
        BrowserList browserList = BrowserList.valueOf(browserName.toUpperCase());
        switch (browserList) {
            case FIREFOX -> {
//              System.setProperty("webdriver.gecko.driver", projectPath + "\\browserDrivers\\geckodriver.exe");
//                driver = WebDriverManager.firefoxdriver().create();
                driver = new FirefoxDriver();

            }
            case CHROME -> {
//                System.setProperty("webdriver.chrome.driver", projectPath + "\\browserDrivers\\chromedriver.exe");
//                driver = WebDriverManager.chromedriver().create();
                driver = new ChromeDriver();

            }
            case EDGE -> {
//                System.setProperty("webdriver.edge.driver", projectPath + "\\browserDrivers\\msedgedriver.exe");
//                driver = WebDriverManager.edgedriver().create();
                driver = new EdgeDriver();

            }
            case SAFARI -> driver = new SafariDriver();
            default -> throw new IllegalArgumentException("Browser name is not valid: " + browserName);
        }


        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return driver;
    }

    protected String generatedRandomNumber() {
        return new Random().nextInt(999999) + "";
    }

}
