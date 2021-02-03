package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;
import pages.US_1160_Page;

public class US_1160_Stepdefinitions {
    US_1160_Page us1160Page=new US_1160_Page();

    @Given("Computer Office kategorisini secer")
    public void computer_office_kategorisini_secer() throws InterruptedException {
        Thread.sleep(2000);
        Select select=new Select(us1160Page.allCategoriesDropDown);
        select.selectByValue("41");

    }

    @Given("kullanici Buy Now butonuna tiklar")
    public void kullanici_buy_now_butonuna_tiklar() throws InterruptedException {
        Thread.sleep(2000);
        us1160Page.buyNow.click();

    }

    @Then("kullanici sepette urun oldugunu dogrular")
    public void kullanici_sepette_urun_oldugunu_dogrular() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(us1160Page.sepetdogrulama.isDisplayed());



    }

}
