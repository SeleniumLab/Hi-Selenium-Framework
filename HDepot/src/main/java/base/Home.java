package base;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.concurrent.TimeUnit;


public class Home extends CommonAPI {


    public void search(String from) {
        driver.findElement(By.cssSelector("#headerSearch")).sendKeys("Washing Machine", Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }

    @FindBy(css = "#headerMyAccount .SimpleFlyout__link--bold")
    WebElement tabmyaccount;

    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    WebElement tabonsignin;


    public void cart() {
        driver.findElement(By.cssSelector(".MyCart__label")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void ShopByRoom() {
        driver.findElement(By.cssSelector(".ShoppingLinks [data-id='room']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void homeServices() {
        driver.findElement(By.xpath("/html//div[@id='container']//div[@class='Header3']//ul[@class='ShoppingLinks']//a[@href='//www.homedepot.com/services/']")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
    }


    public void specialsAndOffers() {
        driver.findElement(By.xpath("/html//div[@id='container']//div[@class='Header3']//ul[@class='ShoppingLinks']//a[@href='//www.homedepot.com/c/Savings_Center']")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void storeFinder() {
        driver.findElement(By.cssSelector(".TaskLinks .TaskLinks__item:nth-of-type(1) .TaskLinks__link")).click();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        driver.findElement(By.xpath("/html//input[@id='storeSearchBox']")).sendKeys("Astoria", Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[@id='SFControl']/section/section[@class='addressDYM']//a[@href='/l/search/lat:40.7720489501953;lng:-73.9260635375977/full/']")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public static void registerlogin() {

    }

  public void myAccount(String email, String password) throws InterruptedException {
        driver.findElement(By.cssSelector("#headerMyAccount .SimpleFlyout__link--bold")).click();
       //tabmyaccount.click();
       Thread.sleep(4000);
      driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
       //tabonsignin.click();
       Thread.sleep(7000);
    }



    public void myAccount() {

        driver.findElement(By.cssSelector("#headerMyAccount .SimpleFlyout__link--bold")).click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
        //tabmyaccount.click();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
    }


    public void datadrive() {
        String URL = "https://www.homedepot.com/";
        String File_Path = "C:\\Users\\emdad\\IdeaProjects\\hiframework\\HDepot\\src\\test\\java\\dataDriventest\\Book1.Excel.xls";
        String File_Name = "Book1.Excel.xls";
    }



    /*public void searchRoundTripFlightOneAdult(String from, String destination,String departing, String returning) throws InterruptedException {
        FlightOnlyTab.click();
        Thread.sleep(900);
        RoundTripButton.click();
        Thread.sleep(900);
        FlyFromField.sendKeys(from);
        Thread.sleep(900);
        FlyingToField.sendKeys(destination);
        Thread.sleep(900);
        DepartingField.sendKeys(departing);
        Thread.sleep(900);
        ReturningField.sendKeys(returning);
        FlightOnlySearchButton.click();
        Thread.sleep(900);
        Assert.assertEquals(getDestinationLabelText(),"Select your departure to "+destination);



















    /* Select select = new Select(driver.findElement(By.xpath("//span[contains(text(),'Register')]")));
        select.selectByVisibleText("Register");*/


    @FindBy(how = How.CSS, using = "#headerMyAccount .SimpleFlyout__link--bold")
    public static WebElement myAccount;

    @FindBy(how = How.CSS, using = "#.MyCart__label")
    public static WebElement cart;

    @FindBy(how = How.CSS, using = "#[href='\\/b\\/Holiday-Decorations-Halloween-Decorations\\/N-5yc1vZc2ve'] img")
    public static WebElement imgRegardingHallowin;

    @FindBy(how = How.CSS, using = "[href='https\\:\\/\\/www\\.redcross\\.org\\/donate\\/cm\\/homedepot-pub\\.html\\/'] img")
    public static WebElement donateNowTab;

    //#container [class='  col__6-12 col__6-12--xs col__6-12--sm col__6-12--md col__6-12--lg col__6-12--xl']:nth-of-type(3) img
    @FindBy(how = How.CSS, using = "#container [class='  col__6-12 col__6-12--xs col__6-12--sm col__6-12--md col__6-12--lg col__6-12--xl']:nth-of-type(3) img")
    public static WebElement supportingLocal;

}











