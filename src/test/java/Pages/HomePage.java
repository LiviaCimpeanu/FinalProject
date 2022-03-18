package Pages;

import Help.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends SharedData {
    public WebDriver driver;
    public ElementMethods elementMethods;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "theordinary-regimenbuilder")
    public WebElement regimenElement;
    @FindBy(css = "button[class='page_footer_newsletter_sticky_close js-page_footer_newsletter_sticky_close icon-close']")
    public WebElement closePopUp;
    @FindBy(css = "button[class='btn btn-primary js-cookie_consent-btn']")
    public WebElement acceptCookie;
    @FindBy(css = "a[title='Products']")
    public WebElement products;
    @FindBy(css = "ul[class='dropdown-list js-dropdown-list']")
    public List<WebElement> productsList;
    @FindBy(css = "button[class='site-search-button  js-search-button icon-search']")
    public WebElement searchBarIcon;
    @FindBy(css = "input[placeholder='search']")
    public WebElement searchBar;

    public void closeAndAccept(){
        elementMethods.clickElement(closePopUp);
        elementMethods.clickElement(acceptCookie);
    }

    public void goToRegimen() {
        elementMethods.clickElement(regimenElement);
    }

    public void moveToProducts(){
        elementMethods.moveToElement(products);
        for (int index=0; index<productsList.size();index++){
            elementMethods.clickElement(productsList.get(index));
        }
    }

    public void searchElement(){
        elementMethods.clickElement(searchBarIcon);
        elementMethods.fillElement(searchBar, "acid ascorbic");
        elementMethods.pressEnter(searchBar);

    }
}
