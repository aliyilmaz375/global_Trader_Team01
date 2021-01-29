package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US_1150_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US_1150_Stepdefinitions {

    US_1150_Page us1150Page = new US_1150_Page();

    @Given("kullanici anasayfaya gider")
    public void kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("gt_url"));
    }

    @Given("Join Now butonuna tiklar")
    public void join_now_butonuna_tiklar() {
        us1150Page.joinNowButton.click();
    }

    @Given("email girer")
    public void email_girer() {
        us1150Page.emailTextBox.sendKeys(ConfigReader.getProperty("gt_email"));
    }

    @Given("name girer")
    public void name_girer() {
        us1150Page.nameTextBox.sendKeys(ConfigReader.getProperty("gt_name"));
    }

    @Given("mobile girer")
    public void mobile_girer() {
        us1150Page.mobileTextBox.sendKeys(ConfigReader.getProperty("gt_mobile"));
    }

    @Given("password girer")
    public void password_girer() {
     us1150Page.passwordTextBox.sendKeys(ConfigReader.getProperty("gt_password"));
    }

    @Given("password u dogrular")
    public void password_u_dogrular() {
        us1150Page.rePasswordTextBox.sendKeys(ConfigReader.getProperty("gt_rePassword"));
     
    }

    @Given("Sign Up butonuna tiklar")
    public void sign_up_butonuna_tiklar() {
        us1150Page.SignUpButton.click();
       
    }

    @Then("Success mesajinin gorundugunu dogrular")
    public void success_mesajinin_gorundugunu_dogrular() {
        Assert.assertTrue(us1150Page.successMessage.isDisplayed());
    }

    @And("gecersiz bir email girer")
    public void gecersizBirEmailGirer() {
        us1150Page.emailTextBox.sendKeys(ConfigReader.getProperty("gt_invalidEmail"));
    }

    @Then("email hata mesajinin gorundugunu dogrular")
    public void emailHataMesajininGorundugunuDogrular() {
        Assert.assertTrue(us1150Page.invalidEmailMessage.isDisplayed());

    }

    @And("confirm password textbox ina baska bir password girin")
    public void confirmPasswordTextboxInaBaskaBirPasswordGirin() {
        us1150Page.rePasswordTextBox.sendKeys(ConfigReader.getProperty("gt_invalidRePassword"));
    }

    @Then("password hata mesajinin gorundugunu dogrular")
    public void passwordHataMesajininGorundugunuDogrular() {
        Assert.assertTrue(us1150Page.passwordDoesntMatch.isDisplayed());
    }
}
