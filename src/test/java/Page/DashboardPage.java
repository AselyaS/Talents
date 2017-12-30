package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends BasePage{

    private By titlePage = By.xpath("//title[text() = 'ProMytheUs - Talents']");

    public DashboardPage(WebDriver driver) {
        super(driver);

    }

    public String getPageTitle() {

        return wait.until(ExpectedConditions.presenceOfElementLocated(titlePage)).getAttribute("innerText");
    }

}
