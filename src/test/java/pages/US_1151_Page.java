package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_1151_Page {

    public US_1151_Page(){
        PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(linkText = "Sign In")
    public WebElement signInButton;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(id = "password")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@value='Login']")
    public WebElement logInButton;

    @FindBy (linkText = "Welcome deneme375")
    public WebElement deneme375Dogrulama;

    @FindBy(id = "alert_email_address")
    public WebElement invalidEmailMessage;

    @FindBy(id = "login_details_correctNot")
    public WebElement invalidPasswordMessage;

    @FindBy(linkText = "Logout")
    public WebElement logOut;



}
