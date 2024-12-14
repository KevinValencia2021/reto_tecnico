package step;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import page.DashboardPage;

public class DashboardStep {
    WebDriver webDriver;
    DashboardPage dashboardPage = new DashboardPage();
    public DashboardStep(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void SelectSection() {
        WebElement sectionDasboard = webDriver.findElement(dashboardPage.li_section);
        sectionDasboard.click();
    }
}
