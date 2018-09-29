package base;

import org.testng.annotations.Test;

public class HomeTest extends Home {


    @Test
    public void storeFinder(){
        super.storeFinder();
    }

    @Test
    public void myAccount(String email) {
        super.myAccount(email);
    }
}
