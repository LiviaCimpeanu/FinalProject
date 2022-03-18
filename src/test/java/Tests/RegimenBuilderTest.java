package Tests;

import Help.ElementMethods;
import Pages.HomePage;
import Pages.RegimenBuilderPage;
import SharedData.SharedData;
import org.junit.Test;

public class RegimenBuilderTest extends SharedData {

    public HomePage homePage;
    public RegimenBuilderPage regimenBuilderPage;

    @Test
    public void testAutomat() throws InterruptedException {

        homePage = new HomePage(driver);
        regimenBuilderPage = new RegimenBuilderPage(driver);

        homePage.closeAndAccept();
        homePage.goToRegimen();
        regimenBuilderPage.fillName("Livia");
        regimenBuilderPage.clickOk();
        regimenBuilderPage.selectAnswer2();
        regimenBuilderPage.clickOk();
        regimenBuilderPage.selectAnswer3();
        regimenBuilderPage.clickOk();
        regimenBuilderPage.selectAnswer4();
        regimenBuilderPage.clickOk();
        regimenBuilderPage.selectAnswer5();
        regimenBuilderPage.clickOk();
        regimenBuilderPage.selectAnswer6();
        regimenBuilderPage.clickOk();
        regimenBuilderPage.finishProcess();
    }

}
