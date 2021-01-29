package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_1151_Page;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class US_1151_Stepdefinitions {

    US_1151_Page us1151Page = new US_1151_Page();

    @Given("Sign In butonuna tiklar")
    public void sign_in_butonuna_tiklar() {
        us1151Page.signInButton.click();
    }

    @Then("Login butonuna tiklar")
    public void login_butonuna_tiklar() {
        us1151Page.logInButton.click();
    }

    @Then("hesabina basariyla girdigini test eder")
    public void hesabina_basariyla_girdigini_test_eder() {
        Assert.assertTrue(us1151Page.deneme375Dogrulama.isDisplayed());
    }

    @And("invalid email girer")
    public void invalidEmailGirer() {
        us1151Page.emailTextBox.sendKeys(ConfigReader.getProperty("gt_invalidEmail"));
    }

    @And("invalid password girer")
    public void invalidPasswordGirer() {
        us1151Page.passwordTextBox.sendKeys(ConfigReader.getProperty("gt_invalidPasword"));
    }

    @Then("Sorry hata mesajinin gorundugunu dogrular")
    public void sorryHataMesajininGorundugunuDogrular() {

        Assert.assertTrue(us1151Page.invalidPasswordMessage.isDisplayed());
    }


    @When("kullanici glbTrader hesabina gider")
    public void kullanici_glb_trader_hesabina_gider() {

        ReusableMethods.globalTraderSingIn();
    }

    @Given("LogOut butonuna tiklar")
    public void log_out_butonuna_tiklar() {
       us1151Page.logOut.click();
    }

    @Given("hesaptan ciktigini dogrular")
    public void hesaptan_ciktigini_dogrular() {
       Assert.assertTrue(us1151Page.signInButton.isDisplayed());
    }



}
