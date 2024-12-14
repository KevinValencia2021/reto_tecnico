package step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginStep {
    WebDriver webDriver;
    LoginPage loginPage = new LoginPage();
    public LoginStep(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void loginApp(String username, String password) {

        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement usernameInput = webDriver.findElement(loginPage.input_username);
        usernameInput.sendKeys(username);
        WebElement passwordInput = webDriver.findElement(loginPage.input_password);
        passwordInput.sendKeys(password);
        passwordInput.submit();
    }
}
