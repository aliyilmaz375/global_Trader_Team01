package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Firdevs_glb_page {


    public Firdevs_glb_page() {

        PageFactory.initElements(Driver.getDriver(), this);


    }


    @FindBy(xpath = "//a[text()='Sign In']")
    public WebElement signupp;

    @FindBy(id = "email")
    public WebElement emaill;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement login;

    @FindBy(xpath = "//*[text()=' Personal Profile']")
    public WebElement personelprofil;
    @FindBy(linkText = "Edit")
    public WebElement ilkedit;
    @FindBy(xpath = "//*[text()=' Change Password']")
    public WebElement changepassword;

    @FindBy(name = "old_pass")
    public WebElement currentpassword;

    @FindBy(xpath = "(//input[@type='password'])[2]")
    public WebElement newpassword;

    @FindBy(name = "con_pass")
    public WebElement confirmpassword;

    @FindBy(name = "submit")
    public WebElement update1;


    @FindBy(xpath = "//input[@name='name']")
    public WebElement name;

    @FindBy(xpath = "(//*[text()='Please Select'])[2]")
    public WebElement state;

    @FindBy(name = "landline")
    public WebElement landline;

    @FindBy(xpath = "//textarea[@name='address']")
    public WebElement adress;

    @FindBy(xpath = "(//*[text()='Please Select'])[1]")
    public WebElement country;

    @FindBy(xpath = "(//*[text()='Please Select'])[3]")
    public WebElement city;

    @FindBy(xpath = "(//select[@class='form-control'])[2]")
    public WebElement mobile;



    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement personelupdate;

}





