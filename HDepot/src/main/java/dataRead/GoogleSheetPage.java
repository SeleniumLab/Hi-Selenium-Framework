package dataRead;


import base.CommonAPI;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.ValueRange;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utilities.GoogleSheetReader.getSheetsService;

public class GoogleSheetPage extends CommonAPI {
    @FindBy(className = "ctl00$ContentPlaceHolder1$txtLogin")
    public WebElement Username;
   // @FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_txtPass\"]")
    public WebElement Password;
    // WebElement Username= driver.findElement(By.cssSelector("#ctl00_ContentPlaceHolder1_txtLogin"));
    // WebElement Password=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtPass\"]"));
    // WebElement Login=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnSubmitLogin\"]"));
    //@FindBy(xpath = "//*[@id=\"ctl00_ContentPlaceHolder1_lblLoginMsg\"]")
  //  public WebElement signInErrorMesage;
    //WebElement signInErrorMesage=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_lblLoginMsg\"]"));
    //}
    //ALI_GS_TC1
    public  GoogleSheetPage(){}
    public GoogleSheetPage(WebDriver driver){this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void clickOnsignUp(){
        driver.findElement(By.xpath("//*[@id=\"block-block-1426\"]/div/div/ul[2]/li/a")).click();
    }
    public void signUpDataForXls() throws InterruptedException {
        //driver.findElement(By.xpath("//*[@id=\"block-block-1426\"]/div/div/ul[2]/li/a")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtLogin\"]")).sendKeys("Username", Keys.ENTER);
        sleepFor(2);
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_txtPass\"]")).sendKeys("Password",Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_btnSubmitLogin\"]")).click();
        // driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceHolder1_lblLoginMsg\"]")).getText();
    }
    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, String range) throws IOException {
        // Build a new authorized API client service.
        Sheets service = getSheetsService();
        ValueRange response = service.spreadsheets().values()
                .get(spreadsheetId, range)
                .execute();
        List<List<Object>> values = response.getValues();
        if (values == null || values.size() == 0) {
            return null;
        } else {
            return values;
        }
    }

    // //ALI_GS_TC1 LogIn by using Google Sheet sheet data
    public List<String> signInByInvalidIdPass(String spreadsheetId, String range) throws IOException, InterruptedException {

        List<List<Object>> col2Value = getSpreadSheetRecords(spreadsheetId, range);
        List<String> actual = new ArrayList<>();
        for (List row : col2Value) {
            sleepFor(1);
            inputValueInTextBoxByWebElement(Username, row.get(1).toString());
            //inputValueInTextBoxByWebElement(Password, row.get(2).toString());
            sleepFor(1);
            //actual.add(getCurrentPageTitle());
           // actual.add(getTextByWebElement(signInErrorMesage));
            //System.out.println(getTextByWebElement(signInErrorMesage));
            clearInputBox(Username);
            //clearInputBox(Password);
            sleepFor(1);
        }
        return actual;
    }
}

