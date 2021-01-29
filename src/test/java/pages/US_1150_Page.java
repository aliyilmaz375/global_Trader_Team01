package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_1150_Page {
    public US_1150_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (linkText = "Join Now")
    public WebElement joinNowButton;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy (xpath = "//input[@name='name']")
    public WebElement nameTextBox;

    @FindBy (xpath = "//input[@name='mobile']")
    public WebElement mobileTextBox;

    @FindBy(id = "password")
    public WebElement passwordTextBox;

    @FindBy(id = "re_password")
    public WebElement rePasswordTextBox;

    @FindBy(xpath = "//button[@class='btn btn-lg btn-warning btn-block']")
    public WebElement SignUpButton;

    @FindBy(xpath = "//div[@class='alert alert-success']")
    public WebElement successMessage;

    @FindBy(id = "alert_email_address")
    public WebElement invalidEmailMessage;

    @FindBy(id = "alert_confirm_password")
    public WebElement passwordDoesntMatch;


}
