package searchpage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class AllDepartment extends CommonAPI {


        @FindBy(xpath = "//a[@class='ShoppingLinks__link js__flyout--open']")
        public static WebElement alldepartments;

        @FindBy(xpath = "//a[contains(text(),'Shop by Room')]")
        public static WebElement shopRoom;

        @FindBy(xpath = "//a[@class='TaskLinks__link'][contains(text(),'Truck & Tool Rental')]")
        public static WebElement truckAndToolRental;


        public void mouseHover() {
            Actions actions = new Actions(driver);
            actions.moveToElement(alldepartments).perform();
            actions.moveToElement(shopRoom).perform();
        }

        public void TruckToolRental() {
            truckAndToolRental.click();
        }

        public void truckRental() {
            driver.findElement(By.xpath("//a[@class='TaskLinks__link'][contains(text(),'Truck & Tool Rental')]")).click();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//a[contains(text(),'Aerators')]")).click();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//a[contains(text(),'Air Compressors & Nail Guns')]")).click();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//a[contains(text(),'Air Conditioners & Heaters')]")).click();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//div//div[contains(@class,'isBound transparentBorder')]//ul[contains(@class,'')]//li[1]")).click();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//div//div[contains(@class,'isBound transparentBorder')]//ul[contains(@class,'')]//li[1]")).click();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

            driver.findElement(By.xpath("//a[contains(text(),'Carpet & Floor Installation')]")).click();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        }




    }












//@FindBy(how = How.CSS, using = "#headerMyAccount .SimpleFlyout__link--bold")
// public static WebElement myAccount;

