package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected String pageURL = "";

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,5);
    }

    public void load(){
        driver.get(pageURL);
    }
}
