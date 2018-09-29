package base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class XcelElement extends CommonAPI {

    @FindBy(xpath = "//input[@id='headerSearch']")
    public static WebElement getXcelElement;


}
