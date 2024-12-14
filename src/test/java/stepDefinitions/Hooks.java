package stepDefinitions;

import core.DriverTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks {
    DriverTest driverTest;
    WebDriver webDriver;

    @Before
    public void setUp(){
        webDriver = driverTest.getWebDriver();
        webDriver.manage().window().maximize();
        webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @After
    public void quitDriver(){
        driverTest.quitDriver();
    }
}
