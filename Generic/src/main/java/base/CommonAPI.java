package base;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class CommonAPI {
    public WebDriver driver = null;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\emdad\\IdeaProjects\\hiframework\\Generic\\driver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.homedepot.com/");
        driver.manage().window().maximize();
        Thread.sleep(4000);}



   /* @AfterMethod
    public void end() throws InterruptedException {
        Thread.sleep(7000);
        driver.close();
    }*/
}