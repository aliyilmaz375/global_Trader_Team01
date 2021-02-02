package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.US_1153_Page;
import utilities.ConfigReader;

import java.util.ArrayList;
import java.util.List;

public class US_1153_Stepdefinitions {
    US_1153_Page us1153Page =new US_1153_Page();
    Faker faker = new Faker();

    @Then("Seller Join Now butonuna tiklar")
    public void seller_join_now_butonuna_tiklar() {
     us1153Page.joinNow.click();
    }

    @Then("Vendor Type secer")
    public void vendor_type_secer() {
        us1153Page.vendorTypeCompany.isSelected();
    }

    @Then("Sadece harflerden olusan bir company ismi girer")
    public void sadece_harflerden_olusan_bir_company_ismi_girer() {
     us1153Page.companyName.sendKeys(ConfigReader.getProperty("seller_companyName"));
    }

    @Then("10 haneli numaralardan olusan company mobile girer")
    public void haneli_numaralardan_olusan_company_mobile_girer() {
        String companyMobile =faker.number().digits(10);
        us1153Page.companyMobilePhone.sendKeys(companyMobile);
    }

    @Then("Company address girer")
    public void company_address_girer() {
        String address = faker.address().fullAddress();
    us1153Page.companyAddress.sendKeys(address);
    }

    @Then("Sadece harflerden olusan full name girer")
    public void sadece_harflerden_olusan_full_name_girer() {
        String fullName=faker.name().fullName();
    us1153Page.fullName.sendKeys(fullName);
    }

    @Then("Daha onceden kayıt olunmamıs gecerli bir email address girer")
    public void daha_onceden_kayıt_olunmamıs_gecerli_bir_email_address_girer() {
        String eMail=faker.internet().emailAddress();
    us1153Page.eMail.sendKeys(eMail);
    }

    @Then("Page Url oalcak bir subdomain adress girer")
    public void page_url_oalcak_bir_subdomain_adress_girer() {
    us1153Page.subDomain.sendKeys(ConfigReader.getProperty("seller_sudomain"));
    }

    @Then("Dropdowndan bir country secer")
    public void dropdowndan_bir_country_secer() {
        Select select =new Select(us1153Page.countryDropdown);
        select.selectByVisibleText(ConfigReader.getProperty("seller_companyDropdown"));
    }

    @Then("State name girer")
    public void state_name_girer() {
    us1153Page.state.sendKeys(ConfigReader.getProperty("seller_state"));
    }

    @Then("City name girer")
    public void city_name_girer() {
    us1153Page.city.sendKeys(ConfigReader.getProperty("seller_city"));
    }

    @Then("Bir adres girer")
    public void bir_adres_girer() {
    us1153Page.address.sendKeys(ConfigReader.getProperty("seller_address"));
    }

    @Then("Postal Code girer")
    public void postal_code_girer() {
    String postalCode =faker.address().zipCode();
        us1153Page.postalCode.sendKeys(postalCode);
    }

    @Then("Categories Dropdowndan bir category secer")
    public void categories_dropdowndan_bir_category_secer() {
        Select select = new Select(us1153Page.categoryDropdown);
        select.selectByVisibleText(ConfigReader.getProperty("seller_categoryDropdown"));
    }

    @Then("Seller Registrationa password girer")
    public void seller_registrationa_password_girer() {
        String password = faker.internet().password();
     us1153Page.password.sendKeys(password);
    }

    @Then("* ile isaretli zorunlu alanlarin dolu oldugunu dogrular")
    public void ile_isaretli_zorunlu_alanlarin_dolu_oldugunu_dogrular() {
      List<WebElement> list =new ArrayList<>();
      list.add(us1153Page.state);
        list.add(us1153Page.companyName);
        list.add(us1153Page.fullName);
        list.add(us1153Page.companyMobilePhone);
        list.add(us1153Page.eMail);
        list.add(us1153Page.address);
        list.add(us1153Page.city);
        list.add(us1153Page.companyAddress);
        list.add(us1153Page.mobileNumber);
        list.add(us1153Page.password);
        list.add(us1153Page.subDomain);

        for (WebElement w: list){
            Assert.assertFalse(w.toString().isEmpty());
        }


    }

    @Then("Registration Buttonunu tiklar")
    public void registration_buttonunu_tiklar() {
        us1153Page.registrationButton.click();
    }

    @Then("Ekranda Thank you to join our team. You are Registered Successfully. yazisi gorundugunu dogrular")
    public void ekranda_thank_you_to_join_our_team_you_are_registered_successfully_yazisi_gorundugunu_dogrular() {
    Assert.assertTrue(us1153Page.registrationBasariliYazi.isDisplayed());
    }

    @And("10 haneli numaralardan olusan mobile number girer")
    public void haneliNumaralardanOlusanMobileNumberGirer() {
        String mobile =faker.number().digits(10);
        us1153Page.mobileNumber.sendKeys(mobile);
    }

    @And("Company name bos birakin")
    public void companyNameBosBirakin() {
        us1153Page.companyName.sendKeys("");
    }

    @And("Kayıt isleminin yapilamadigini dogrular")
    public void kayıtIslemininYapilamadiginiDogrular() {
        Assert.assertTrue(us1153Page.registrationBasarisiz.isDisplayed());
    }

    @And("Invalid bir email address girer")
    public void invalidBirEmailAddressGirer() {
        us1153Page.eMail.sendKeys(ConfigReader.getProperty("seller_invalidEMail"));
    }

    @And("harflerden ve sayilardan  olusan full name girer")
    public void harflerdenVeSayilardanOlusanFullNameGirer() {
        us1153Page.fullName.sendKeys(ConfigReader.getProperty("seller_invalidFullName"));
    }
}
