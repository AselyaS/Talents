package Test;

import Page.RegistrationPage;
import Page.invalidLoginPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseTest{

        private RegistrationPage loginPage;


        @BeforeClass
        public void setUp() {

            loginPage = new RegistrationPage(driver);

        }
        @Test
        public void theVeryFirstTest() throws InterruptedException {

            loginPage.load();
            loginPage.register();
            Thread.sleep(5000);
            driver.quit();

            //homePage.logOut();

        }
    }

