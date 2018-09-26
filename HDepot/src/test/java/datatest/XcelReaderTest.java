package datatest;


import base.CommonAPI;
import base.Home;
import dataReader.XcelReader;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class XcelReaderTest extends CommonAPI {

    Home home;

    @BeforeMethod
    public void createTestObj() {
        this.home = new Home();
    }

    @DataProvider
    public Object[][] getExcelTestData() {
        Object data[][] = XcelReader.getData(0);
        return data;
    }

    @Test(dataProvider = "getExcelTestData")
    public void logintest(String email, String password) throws InterruptedException {
        home.myAccount(email, password);
    }


}
