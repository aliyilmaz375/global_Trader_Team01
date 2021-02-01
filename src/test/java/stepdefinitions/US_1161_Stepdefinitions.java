package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US_1161_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class US_1161_Stepdefinitions {

    US_1161_Page us_1161_page=new US_1161_Page();

    @Given("kullanici glabaltrader anasayfaya gider")
    public void kullanici_glabaltrader_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("gt_url"));
    }

    @Given("kullanici searchbox kutusuna {string} yazdirir")
    public void kullanici_searchbox_kutusuna_yazdirir(String string)  {
        us_1161_page.searchbox.sendKeys(string + Keys.ENTER);
    }

    @Given("kullanici arama butonuna basar")
    public void kullanici_arama_butonuna_basar() {

        us_1161_page.aramaButonu.click();
    }


    @Then("kullanici searchbox kutusunun butonunun calisip calismadigini kontrol eder")
    public void kullaniciSearchboxKutusununButonununCalisipCalismadiginiKontrolEder() {
        Assert.assertTrue(us_1161_page.searchboxDogrulama.getText().contains(ConfigReader.getProperty("search_kontrol")));
    }


    @And("kullanici AllCategories kutusuna {string} yazdirir")
    public void kullaniciAllCategoriesKutusunaYazdirir(String string) {
        Select select = new Select(us_1161_page.allCategories);
        select.selectByVisibleText(string);
    }

    @Then("kullanici AllCatagories butonunun calisip calismadigini kontrol eder")
    public void kullaniciAllCatagoriesButonununCalisipCalismadiginiKontrolEder() {
        Assert.assertTrue(us_1161_page.allCategoriesDogrulama.getText().contains(ConfigReader.getProperty("all_Categories")));

    }

    @Then("allcategorisinde cikan sonuculardan ilk urununun olup WomenChiffon olmadigini kontrol eder kontrol eder")
    public void allcategorisindeCikanSonuculardanIlkUrunununOlupWomenChiffonOlmadiginiKontrolEderKontrolEder() {
        Assert.assertTrue(us_1161_page.allCategoriesDogrulama.getText().contains(ConfigReader.getProperty("allCategoriesSonucYazisi")));
    }


    @And("kullanici ilk urune tiklar")
    public void kullaniciIlkUruneTiklar() {
        us_1161_page.searchboxDogrulama2.click();
    }


    @Then("kullanici cikan sonucun WomenChiffon  olup olmadigini kontrol eder")
    public void kullaniciCikanSonucunWomenChiffonOlupOlmadiginiKontrolEder() {
        Assert.assertTrue(us_1161_page.searchboxDogrulama3.getText().contains(ConfigReader.getProperty("searcBoxSonucYazisi")));
    }

    @Then("allcategorisinde  ve searchboxda cikan sonuclari karsilastirma")
    public void allcategorisindeVeSearchboxdaCikanSonuclariKarsilastirma() {
        Assert.assertEquals(us_1161_page.allCategoriesDogrulama.getText(),us_1161_page.searchboxDogrulama.getText());
    }

    @Given("kullanici sayfanin en altina gider")
    public void kullanici_sayfanin_en_altina_gider() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.END).perform();


    }

    @Given("kullanici facebook butonuna basar")
    public void kullanici_facebook_butonuna_basar() {
        us_1161_page.facebookButonu.click();

    }

    @Then("kullanici facebook sayfasinda globaltrader sayfasi olup olmadigini test eder")
    public void kullanici_facebook_sayfasinda_globaltrader_sayfasi_olup_olmadigini_test_eder() {
        Assert.assertTrue(us_1161_page.facebookDogrulama.getText().contains(ConfigReader.getProperty("face_dogrulama")));
    }


    @And("kullanici twitter butonuna basar")
    public void kullaniciTwitterButonunaBasar() {

        us_1161_page.twitterButonu.click();
    }

    @Then("kullanici twitter sayfasinda globaltrader sayfasinda olup olmadigini test eder")
    public void kullaniciTwitterSayfasindaGlobaltraderSayfasindaOlupOlmadiginiTestEder() {
        Assert.assertTrue(us_1161_page.twitterDogrulama.getText().contains(ConfigReader.getProperty("twit_dogrulama")));

    }

    @And("kullanici sayfayi kapatir")
    public void kullaniciSayfayiKapatir() {
        Driver.closeDriver();
    }

}
