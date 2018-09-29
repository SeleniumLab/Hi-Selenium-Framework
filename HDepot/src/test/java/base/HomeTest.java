package base;

import org.testng.annotations.Test;
import reporting.TestLogger;

import java.text.MessageFormat;

public class HomeTest extends Home {


    @Test
    public void storeFinder() {
        TestLogger.log("Store found");
        super.storeFinder();
    }

    @Test
    public void myAccount(String email) {
        TestLogger.log("Get email");
        super.myAccount(email);
    }
}
