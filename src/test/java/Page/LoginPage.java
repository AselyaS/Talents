package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    private String email = "jane777son@gmail.com";
    private String password = "qwerty123";

    private By logField = By.name("email");
    private By passField = By.name("password");
    private By logButton = By.id("login");

    public LoginPage(WebDriver driver) {

        super(driver);
    }
    public void Login() {
        wait.until(ExpectedConditions.presenceOfElementLocated(logField));
        driver.findElement(logField).sendKeys(email);
        driver.findElement(passField).sendKeys(password);

        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(logButton));
        loginBtn.click();

    }

}
