package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected String pageURL = "http://ec2-52-8-189-183.us-west-1.compute.amazonaws.com/sign-in.html";

    public BasePage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,5);
    }

    public void load(){
        driver.get(pageURL);
    }
}
