package basetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected String Url = "https://www.staging.becorps.net/login";

    @BeforeClass
    public void openBrowsers() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-geolocation");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get(Url);
    }


    //@AfterClass
    public void closeBrowsers() {
        driver.quit();
    }
}
