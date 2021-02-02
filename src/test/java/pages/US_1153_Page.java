package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_1153_Page {

    public US_1153_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(linkText = "Seller Join Now")
    public WebElement joinNow;

    @FindBy(id = "vender_type1")
    public WebElement vendorTypeCompany;

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public WebElement companyName;

    @FindBy(xpath = "(//input[@class='form-control'])[2]")
    public WebElement companyMobilePhone;

    @FindBy(xpath = "(//input[@class='form-control'])[3]")
    public WebElement fullName;

    @FindBy(xpath = "(//input[@class='form-control'])[4]")
    public WebElement eMail;

    @FindBy(xpath = "(//input[@class='form-control'])[5]")
    public WebElement subDomain;

    @FindBy(xpath = "(//input[@class='form-control'])[6]")
    public WebElement mobileNumber;

    @FindBy(xpath = "(//input[@class='form-control'])[7]")
    public WebElement state;

    @FindBy(xpath = "(//input[@class='form-control'])[8]")
    public WebElement city;

    @FindBy(xpath = "(//input[@class='form-control'])[9]")
    public WebElement postalCode;

    @FindBy(xpath = "//h2[@class='bordered']")
    public WebElement registrationBasarisiz;

    @FindBy(xpath = "(//input[@class='form-control'])[10]")
    public WebElement password;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement registrationButton;

    @FindBy(id = "company_address")
    public WebElement companyAddress;

    @FindBy(xpath = "//select[@name='country']")
    public WebElement countryDropdown;

    @FindBy(id = "vender_address")
    public WebElement address;

    @FindBy(xpath = "//select[@name='category']")
    public WebElement categoryDropdown;

    @FindBy(xpath = "(//p[@class='text-center'])[2]")
    public WebElement registrationBasariliYazi;

}
