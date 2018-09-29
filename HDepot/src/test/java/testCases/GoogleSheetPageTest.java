package testCases;


import dataRead.GoogleSheetPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import sun.security.util.Password;

import java.io.IOException;
import java.util.List;

public class GoogleSheetPageTest extends GoogleSheetPage {
        GoogleSheetPage googleSheetPage;
        @BeforeMethod
        public void initialize()
        {googleSheetPage= new GoogleSheetPage(driver);
        }

        @Test
        public void dd(){
            clickOnsignUp();
        }
        public void methodForSheet(){
            Username.isEnabled();
            Password.isEnabled();
        }
        //driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtLogin")).sendKeys("username", Keys.ENTER);
        //  driver.findElement(By.name("ctl00$ContentPlaceHolder1$txtPass")).sendKeys("password",Keys.ENTER);
        // }

        @Test
        public void testLogInByInvalidIdPassUsingGoogleSheet() throws InterruptedException, IOException {
            clickOnsignUp();
            sleepFor(3);
            //methodForSheet();
            //sleepFor(3);

            int i = 0;
            String spreadsheetId = "14EfsBG7kNeDYSfywfm4KU45BJdd-n0v3XCM19iYAzME";
            String range = "Sheet1!A2";
            // List<String> actualErrorMessage = signInByInvalidIdPass(spreadsheetId, range);
            List<List<Object>> expectedErrorMessage = getSpreadSheetRecords (spreadsheetId, range);
            for (List row : expectedErrorMessage) {
                //Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(1).toString()));
                System.out.println("expected"+row.get(2).toString());
                System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
                i++;
            }
            System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
        }
    }

