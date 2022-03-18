package Pages;

import Help.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends SharedData {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='pdp-link']//a[text()='100% L-Ascorbic Acid Powder']")
    public WebElement product;
    @FindBy(css = "button[class='add-to-cart btn btn-outline-primary adding_to_cart-btn_states js-product-add-to-cart-btn js-back-in-stock']")
    public WebElement addToBasketButton;
    @FindBy(xpath = "/html/body/div[1]/header/nav/div[1]/div[1]/div[2]/div[3]/div[1]/a")
    public WebElement cartIcon;
    @FindBy(css = "button[class='remove-btn js-cart-delete-confirmation-btn btn-link']")
    public WebElement removeButton;

    public void addToCart(){
        elementMethods.scroll(product);
        elementMethods.clickElement(product);
        elementMethods.clickElement(addToBasketButton);
    }

    public void goToCart(){
        elementMethods.clickElement(cartIcon);
    }

    public void removeFromCart(){
       elementMethods.clickElement(removeButton);
    }

}
