package base;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.util.concurrent.TimeUnit;


public class Home extends CommonAPI {


    public void search() {
        driver.findElement(By.cssSelector("#headerSearch")).sendKeys("Washing Machine", Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
    }

    public void myAccount() {
        driver.findElement(By.xpath("/html//div[@id='headerMyAccountTitle']/div[@class='MyAccount__label SimpleFlyout__link--bold']")).click();
        driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
    }

    public void cart() {
        driver.findElement(By.cssSelector(".MyCart__label")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void ShopByRoom() {
        driver.findElement(By.cssSelector(".ShoppingLinks [data-id='room']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void homeServices(){
        driver.findElement(By.xpath("/html//div[@id='container']//div[@class='Header3']//ul[@class='ShoppingLinks']//a[@href='//www.homedepot.com/services/']")).click();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }

    public void specialsAndOffers(){
        driver.findElement(By.xpath("/html//div[@id='container']//div[@class='Header3']//ul[@class='ShoppingLinks']//a[@href='//www.homedepot.com/c/Savings_Center']")).click();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }

    public void storeFinder(){
        driver.findElement(By.cssSelector(".TaskLinks .TaskLinks__item:nth-of-type(1) .TaskLinks__link")).click();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

        driver.findElement(By.xpath("/html//input[@id='storeSearchBox']")).sendKeys("Astoria",Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[@id='SFControl']/section/section[@class='addressDYM']//a[@href='/l/search/lat:40.7720489501953;lng:-73.9260635375977/full/']")).click();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
    }






















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











