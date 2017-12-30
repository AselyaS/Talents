package Test;

import Page.DashboardPage;
import Page.LoginPage;
import Page.invalidLoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class InvalidLoginTest extends BaseTest{

        private invalidLoginPage loginPage;


        @BeforeClass
        public void setUp() {

            loginPage = new invalidLoginPage(driver);

        }
        @Test
        public void theVeryFirstTest() throws InterruptedException {

            loginPage.load();
            System.out.println("Invalid password");
            loginPage.Login();
            Thread.sleep(1000);
            driver.quit();

            //homePage.logOut();

        }
    }

