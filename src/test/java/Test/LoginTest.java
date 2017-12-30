package Test;

import Page.DashboardPage;
import Page.LoginPage;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest{

        private LoginPage loginPage;
        private DashboardPage homePage;

        @BeforeClass
        public void setUp() {

            loginPage = new LoginPage(driver);
            homePage = new DashboardPage(driver);
        }
        @Test
        public void theVeryFirstTest(){

            System.out.println("Home page test...");

            loginPage.load();

            loginPage.Login();
            String actualText = homePage.getPageTitle();
            wait.until(ExpectedConditions.titleIs(actualText));
            assertEquals(actualText, "ProMytheUs - Talents");
            //homePage.logOut();

        }
    }

