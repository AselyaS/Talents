package Page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationPage extends BasePage{



    public RegistrationPage(WebDriver driver) {

        super(driver);
    }


    public void register() throws InterruptedException {
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[@class='btn btn-block btn-default' and text()='Register Now']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstName")).sendKeys("Jana");
        driver.findElement(By.name("lastName")).sendKeys("Sam");
        driver.findElement(By.name("address")).sendKeys("123 Los");
        driver.findElement(By.name("city")).sendKeys("Los Altos");
        // driver.findElement(By.xpath("//label[@class='text-muted col-xs-4 control-label']")).click();
        driver.findElement(By.name("state")).sendKeys("CA");
        driver.findElement(By.name("zip")).sendKeys("90005");
        driver.findElement(By.name("email")).sendKeys("fixexy@nada.ltd");
        driver.findElement(By.name("phone")).sendKeys("34577687878");
        driver.findElement(By.name("password")).sendKeys("qwerty");
        driver.findElement(By.name("confirmPassword")).sendKeys("qwerty");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@class='col-sm-12 text-center line-top p-v']//span[@class = 'fa fa-check']")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-block btn-primary mt-lg']")).click();


    }
}
