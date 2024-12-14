package stepDefinitions;

import core.DriverTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import step.DashboardStep;
import step.LoginStep;

public class OrangeHRM {

    DriverTest driverTest;
    WebDriver webDriver =  driverTest.getWebDriver();
    LoginStep loginStep = new LoginStep(webDriver);
    DashboardStep dashboardStep = new DashboardStep(webDriver);

    @Given("Login into page with credentials for Login {string} and {string}")
    public void credentialsForLoginAnd(String username, String password) {
      loginStep.loginApp(username, password);
    }

    @When("Select section PIM")
    public void selectSection() {
        dashboardStep.SelectSection();

    }

    @And("Create employee")
    public void createEmployee() {
        System.out.println("and 2");

    }

    @Then("Validate new employee")
    public void validateNewEmployee() {
        System.out.println("then");

    }
}
