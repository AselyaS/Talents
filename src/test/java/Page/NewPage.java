package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

public class NewPage{


    private String firstName = "Jane";
    private String lastName = "Sam";
    private String address = "Andrew 123";
    private String city = "Los Angeles";
    private String addressState = "CA";
    private String zip = "90005";


    private By clicknew = By.xpath("//a[@class='btn btn-default btn-outline mr']");
   //private By category = By.xpath("//div[contains(@id, 'ui-select-choices-row')]/span");
    private By arrowCategoryButton = By.xpath("//div[@name='category']//i[@class='caret pull-right']");
   // private By categoryPlaceholderButton = By.xpath("//*[@class='ui-select-choices ui-select-choices-content ui-select-dropdown dropdown-menu ng-scope']/li//span[@class='ui-select-choices-row-inner' and text()='Music']");
   private By divCategory = By.xpath("//div[@name='category']");
    //private String titlePage = "ProMytheUs - Talent Form";
   private By clicknext = By.xpath("//button[@class='btn btn-primary ng-binding']");
   private By firstname = By.name("firstName");
   private By lastname = By.name("lastName");
   private By Address = By.name("address");
   private By City = By.name("city");
   private By State = By.name("addressState");
   private By Zipcode = By.name("zip");
   private By ClickQuik = By.xpath("//span[@class='ng-binding' and text()='Quick Tests']");

    Actions action;
    WebDriver driver;
    WebDriverWait wait;

    public NewPage(WebDriver driver) {
        this.driver=driver;
        action = new Actions(driver);
        wait = new WebDriverWait(driver,5);

    }




    public void getPageNew() {
        driver.findElement(clicknew).click();
     //   driver.findElement(category).click();




        //return wait.until(ExpectedConditions.titleIs(titlePage));

    }
    //Selecting category by its name
    public void selectCategoryName(String catName) throws AWTException {

        String catXpath = "//li[contains(@id,'ui-select-choices')]//span[contains(text(),'"+catName+"')]";
        WebElement selectName = driver.findElement(By.xpath(catXpath));

        if (selectName.isSelected()) System.out.println("Element is displayed");
        while (!isCategoryActive(catXpath)){
            driver.findElement(By.xpath("//ui-view//div[@name='category']//input[@type='search']")).sendKeys(Keys.DOWN);

        }

        selectName.click();
    }

    //Verification method for selectCategoryName
    public boolean isCategoryActive (String xpath){
        WebElement element = driver.findElement(By.xpath(xpath+"/.."));
        return element.getAttribute("class").contains("active");
    }

    public void clickCategoryMenu () throws InterruptedException {

        WebElement element = driver.findElement(arrowCategoryButton);

        action.moveToElement(element).build().perform();
        Thread.sleep(1000);
        element.click();
    }
    public boolean verifyCategoryOpen(){
        WebElement divCat = driver.findElement(divCategory);
        String expectedClass = "open";
        return divCat.getAttribute("class").contains(expectedClass);
    }

    public void ClickButtonNext(){
        driver.findElement(clicknext).click();
    }
    public void Formfield()  {
        driver.findElement(firstname).sendKeys(firstName);
        driver.findElement(lastname).sendKeys(lastName);
        driver.findElement(Address).sendKeys(address);
        driver.findElement(City).sendKeys(city);
        driver.findElement(State).sendKeys(addressState);
        driver.findElement(Zipcode).sendKeys(zip);


    }

    public void PageQuik() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("pagequick");
        driver.findElement(ClickQuik).click();
    }



}