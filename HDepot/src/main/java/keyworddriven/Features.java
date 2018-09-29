package keyworddriven;

import base.CommonAPI;
import base.Home;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.support.PageFactory;
import searchpage.AllDepartment;
import utilities.XlsReader;

import java.io.IOException;

public class Features extends CommonAPI {

    XlsReader objExcelFileReader;
    Home objHomePage;
    AllDepartment allDepartment;


    public void applianceItems() {
        objHomePage = PageFactory.initElements(driver, Home.class);
        objHomePage.search("Air conditioner");
        System.out.println("Appliance test pass");
    }

    public void bathroomItems() {
        objHomePage = PageFactory.initElements(driver, Home.class);
        objHomePage.cart();
        System.out.println("Bathroom test pass");
    }

    public void select(String featureName) throws IOException, InterruptedException {
        switch (featureName) {
            case "applianceItems":
                applianceItems();
                break;
            case "bathroomItems":
                bathroomItems();
                break;
            /*case "generalSearch":
                generalSearch("C:\\Users\\emdad\\IdeaProjects\\hiframework\\HDepot\\src\\test\\java\\dataDriventest\\Book1.Excel.xls");
                break;*/
            default:
                throw new InvalidArgumentException("Invalid feature choice");
        }
    }

}





















    /* public String[] generalSearch(String fileName) throws IOException, InterruptedException {
        objExcelFileReader = PageFactory.initElements(driver, XlsReader.class);
        String[] title = objExcelFileReader.isSheetExist("C:\\Users\\emdad\\IdeaProjects\\hiframework\\HDepot\\src\\test\\java\\dataDriventest\\Book1.Excel.xls")
        System.out.println("ExcelfileReader test pass");
        return title;
        }*/
























/* public void selectFeature() throws IOException, InterruptedException {
        objExcelFileReader = PageFactory.initElements(driver, XlsReader.class);
        String[] title = ((String) objExcelFileReader.getColumnCount("sheet1"))
        for(int i=0;i<title.length;i++){
            select(title[i]);
        }*/




/* public void invalidEmail(){
        objLoginPage = PageFactory.initElements(driver, LoginPage.class);
        objHomePage = PageFactory.initElements(driver, HomePage.class);
        objHomePage.goToLoginPage();
        objLoginPage.enterInvalidEmail();
        System.out.println("InvalidEmail test pass");
        }*/
