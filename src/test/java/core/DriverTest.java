package core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverTest {
    private static WebDriver webDriver;
    public DriverTest() {
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    public static WebDriver getWebDriver() {
        if(webDriver == null){
            new DriverTest();
        }
        return webDriver;
    }

    public static void quitDriver(){
     if (webDriver != null){
         webDriver.quit();
         webDriver = null;
     }
    }
}
