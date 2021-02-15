package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US_1161_Page {
    public US_1161_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//i[@class='fa fa-facebook-square fa-2x']")
    public WebElement facebookButonu;

    @FindBy (id = "seo_h1_tag")
    public WebElement facebookDogrulama;

    @FindBy (xpath = "//a[@class='social-link google']")
    public WebElement twitterButonu;

    @FindBy (xpath = "//div[@class='css-1dbjc4n r-15d164r r-1g94qm0']")
    public WebElement twitterDogrulama;

    @FindBy(id = "typeahead")
    public WebElement searchbox;

    @FindBy(xpath = "//i[@class='fa fa-search']")
    public WebElement aramaButonu;

    @FindBy(xpath = "//h4[@class='icon-hotproduct']")
    public WebElement searchboxDogrulama;

    @FindBy(xpath = "(//h4[@class='icon-hotproduct'])[1]")
    public WebElement searchboxDogrulama2;

    @FindBy (xpath = "//h4[@class='pro_new_head']")
    public WebElement searchboxDogrulama3;

    @FindBy(id = "header_search_category")
    public WebElement allCategories;

    @FindBy (xpath = "(//h4[@class='icon-hotproduct'])[1]")
    public WebElement allCategoriesDogrulama;

}
