package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_1152_Page {

    public US_1152_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(linkText = "Seller Sign in")
    public WebElement sellerSignInButton;

    @FindBy(xpath = "//input[@name='loginname']")
    public WebElement sellerEmail;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement sellerPassword;

    @FindBy(id = "submit")
    public WebElement sellerLogin;

    @FindBy(id = "submit")
    public WebElement loginBasarisiz;

}
