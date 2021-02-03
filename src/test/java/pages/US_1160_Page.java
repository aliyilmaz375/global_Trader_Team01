package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_1160_Page {

    public US_1160_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//select[@id='header_search_category']")
    public WebElement allCategoriesDropDown;

    @FindBy(xpath = "//button[@class='btn btn-warning']")
    public WebElement searhButton;

    @FindBy(xpath = "(//div[@class='img-box'])[1]")
    public WebElement ilkUrun;

    @FindBy(xpath = "//button[@name='buynow_submit']")
    public WebElement buyNow;

    @FindBy(linkText = " Apple iPad Pro (256GB, Wi-Fi + Cellular, Space Gra")
    public WebElement sepetdogrulama;
}
