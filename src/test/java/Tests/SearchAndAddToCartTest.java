package Tests;

import Pages.HomePage;
import Pages.SearchResultsPage;
import SharedData.SharedData;
import org.junit.Test;

import java.sql.Driver;

public class SearchAndAddToCartTest extends SharedData {
    public HomePage homePage;
    public SearchResultsPage searchResultsPage;

    @Test
    public void testAutomat(){

        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);

        homePage.closeAndAccept();
        homePage.searchElement();
        searchResultsPage.addToCart();
        searchResultsPage.goToCart();
        searchResultsPage.removeFromCart();
        searchResultsPage.goToCart();
    }
}
