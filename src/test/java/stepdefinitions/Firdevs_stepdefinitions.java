package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.Firdevs_glb_page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class Firdevs_stepdefinitions {


    Firdevs_glb_page firdevs_glb_page= new Firdevs_glb_page();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("gt_url"));


    }

    @Given("kulanici glb_traider  sayfasinda sign in butonuna basar")
    public void kulanici_glb_traider_sayfasinda_sign_in_butonuna_basar() {
        firdevs_glb_page.signupp.click();
    }

    @Given("kullanici email ve password girisi yapar")
    public void kullanici_email_ve_password_girisi_yapar() {
        firdevs_glb_page.emaill.sendKeys(ConfigReader.getProperty("email"));
        firdevs_glb_page.password.sendKeys(ConfigReader.getProperty("valid_password"));


    }

    @Given("kullanici login butonuna basar")
    public void kullanici_login_butonuna_basar() {

        firdevs_glb_page.login.click();
    }




    @Given("kullanici change password butonuna tiklar")
    public void kullaniciChangePasswordButonunaTiklar() {
        firdevs_glb_page.changepassword.click();


    }




    @Given("kullanici current password girisi yapar")
    public void kullanici_current_password_girisi_yapar() {
        firdevs_glb_page.currentpassword.sendKeys(ConfigReader.getProperty("valid_password"));
    }

    @Given("kullanici new password girer")
    public void kullanici_new_password_girer() {
        firdevs_glb_page.newpassword.sendKeys(ConfigReader.getProperty("new_passw"));
    }

    @Given("kullanici confirm password girer")
    public void kullanici_confirm_password_girer() {
        firdevs_glb_page.confirmpassword.sendKeys(ConfigReader.getProperty("new_passw"));
    }

    @Then("kullanici update butonuna basar")
    public void kullanici_update_butonuna_basar() {

        firdevs_glb_page.personelupdate.click();


    }

    /*............................................*/

    @Given("kullanici personel profile butonuna tiklar")
    public void kullanici_personel_profile_butonuna_tiklar() {

        firdevs_glb_page.personelprofil.click();

    }


    @And("kullanici edit butonuna tiklar")
    public void kullaniciEditButonunaTiklar() {
        Actions actions= new Actions(Driver.getDriver());
        actions.sendKeys(Keys.DOWN);


        firdevs_glb_page.ilkedit.click();


    }

    @And("kullanici name girer")
    public void kullaniciNameGirer() {
        firdevs_glb_page.name.clear();
        firdevs_glb_page.name.sendKeys(ConfigReader.getProperty("name"));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }



    }

//    @And("kullanici country secer")
    //   public void kullaniciCountrySecer() {


    //  Select select= new Select(firdevs_glb_page.country);
    //  select.selectByIndex(3);
    //   select.getFirstSelectedOption();
//

    //  }

    // @And("kullanici state girer")
    /// public void kullaniciStateGirer() {
    ///     Select select= new Select(firdevs_glb_page.state);
    //     select.deselectByIndex(0);

    // }

    //  @And("kullanici city secer")
    // public void kullaniciCitySecer() {
    //     Select select= new Select(firdevs_glb_page.city);
    //     select.selectByIndex(0);
    //  }

    @And("kullanici landline secer")
    public void kullaniciLandlineSecer() {
        firdevs_glb_page.landline.sendKeys(ConfigReader.getProperty("landline"));
    }

    @And("kullanici mobil number girer")
    public void kullaniciMobilNumberGirer() {
        firdevs_glb_page.mobile.sendKeys(ConfigReader.getProperty("mobile"));
    }

    @When("kullanici adress girer")
    public void kullaniciAdressGirer() {
        firdevs_glb_page.adress.sendKeys(ConfigReader.getProperty("adress"));

    }

    @Then("kullanici update{int} butonuna tiklayip bilgileri update eder")
    public void kullaniciUpdateButonunaTiklayipBilgileriUpdateEder(int arg0) {
        firdevs_glb_page.update1.click();

    }
}