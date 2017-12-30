package Test;

import Page.DashboardPage;
import Page.LoginPage;
import Page.NewPage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

public class PageTalentTest extends BaseTest {
    private LoginPage loginPage;
    private DashboardPage homePage;
    private NewPage newPage;
    private String loginTitle="ProMytheUs - Sign In";





    @BeforeClass
    public void setUp() {

        loginPage = new LoginPage(driver);
        homePage = new DashboardPage(driver);
        newPage = new NewPage(driver);




    }

    @Test

    public void CreateNewTalent() throws AWTException, InterruptedException {
        System.out.println("Category Page");

        loginPage.load();
        wait.until(ExpectedConditions.titleIs(loginTitle));
        loginPage.Login();
        homePage.getPageTitle();
        newPage.getPageNew();
        newPage.clickCategoryMenu();
        newPage.selectCategoryName("Music");
        newPage.ClickButtonNext();
        newPage.Formfield();
        newPage.PageQuik();
        newPage.ClickButtonNext();

        driver.quit();




        //newPage.getPageNew();




    }



}