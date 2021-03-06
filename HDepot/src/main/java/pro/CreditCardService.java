package pro;

import base.CommonAPI;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class CreditCardService extends CommonAPI {


    public void creditService() {
        driver.findElement(By.xpath("//a[@class='TaskLinks__link'][contains(text(),'Credit Services')]")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[contains(text(),'Exclusive Consumer Credit Offers')]")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void ExclusiveCredit() {
        driver.findElement(By.xpath("//a[@class='TaskLinks__link'][contains(text(),'Credit Services')]")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[contains(text(),'Project Loan Benefits')]")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void ProjectLoan() {
        driver.findElement(By.xpath("//a[@class='TaskLinks__link'][contains(text(),'Credit Services')]")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[contains(text(),'Commercial Revolving Benefits')]")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    public void CommercialAccBenifit() {
        driver.findElement(By.xpath("//a[@class='TaskLinks__link'][contains(text(),'Credit Services')]")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[contains(text(),'Commercial Account Benefits')]")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
         /*driver.findElement(By.xpath("")).click();
         driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);*/


}





