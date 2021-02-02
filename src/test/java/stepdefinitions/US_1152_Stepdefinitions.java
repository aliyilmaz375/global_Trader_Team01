package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.US_1152_Page;
import utilities.ConfigReader;

public class US_1152_Stepdefinitions {

    US_1152_Page us_1152_page =new US_1152_Page();

    @Given("Seller Sign In butonuna tiklar")
    public void seller_sign_in_butonuna_tiklar() {
     us_1152_page.sellerSignInButton.click();
    }

    @Given("Seller valid email girer")
    public void seller_valid_email_girer() {
    us_1152_page.sellerEmail.sendKeys(ConfigReader.getProperty("seller_validEMail"));
    }

    @Given("Seller valid password girer")
    public void seller_valid_password_girer() {
        us_1152_page.sellerPassword.sendKeys(ConfigReader.getProperty("seller_validpassword"));
    }

    @Then("Seller hesabina basariyla girdigini test eder")
    public void seller_hesabina_basariyla_girdigini_test_eder() {

    }

    @Given("Seller invalid password girer")
    public void seller_invalid_password_girer() {
        us_1152_page.sellerPassword.sendKeys(ConfigReader.getProperty("seller_invalidpassword"));
    }



    @Given("Seller invalid email girer")
    public void seller_invalid_email_girer() {
        us_1152_page.sellerEmail.sendKeys(ConfigReader.getProperty("seller_invalidEMail"));
    }


    @Then("Seller Login butonuna tiklar")
    public void sellerLoginButonunaTiklar() {
        us_1152_page.sellerLogin.click();
    }

    @Then("Seller password hata mesajinin gorundugunu dogrular")
    public void sellerPasswordHataMesajininGorundugunuDogrular() {
    }

    @Then("Seller hesabina login olamadıgını test eder")
    public void sellerHesabinaLoginOlamadıgınıTestEder() {
    }
}
