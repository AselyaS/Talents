package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class invalidLoginPage extends BasePage{

    private String email = "jozifop@amail.club";
    private String password = "qwerty12";

    private By logField = By.name("email");
    private By passField = By.name("password");
    private By logButton = By.id("login");

    public invalidLoginPage(WebDriver driver) {

        super(driver);
    }
    public void Login() {
        wait.until(ExpectedConditions.presenceOfElementLocated(logField));
        driver.findElement(logField).sendKeys(email);
        driver.findElement(passField).sendKeys(password);

        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(logButton));
        loginBtn.click();

        System.out.println("Invalid Email or Password.");


    }

}
