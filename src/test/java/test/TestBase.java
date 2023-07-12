package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
    public static WebDriver driver;

    @BeforeSuite
    public void startDriver()
    {
        System.setProperty("webdriver.chrome.driver", "drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://codenboxautomationlab.com/registration-form/");
    }

    @AfterSuite(enabled = false)
    public void stopDriver()
    {
        driver.quit();
    }
}
