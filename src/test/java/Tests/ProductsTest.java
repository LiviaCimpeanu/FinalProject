package Tests;

import Pages.HomePage;
import SharedData.SharedData;
import org.junit.Test;

public class ProductsTest extends SharedData {
    public HomePage homePage;

    @Test
    public void testAutomat(){

        homePage = new HomePage(driver);

        homePage.closeAndAccept();
        homePage.moveToProducts();
    }
}
