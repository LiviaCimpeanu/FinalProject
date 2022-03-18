package Help;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ElementMethods {

    public WebDriver driver;

    public ElementMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement (WebElement element) {
        waitElement(element);
        element.click();
    }

    public void waitElement (WebElement element) {
        WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        Wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void moveToElement (WebElement element){
        Actions Action = new Actions(driver);
        Action.moveToElement(element).perform();
    }

    public void fillElement (WebElement element, String value){
        waitElement(element);
        element.sendKeys(value);
    }

    public void scroll (WebElement element){
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollBy(0,300)");
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
    }

    public void pressEnter (WebElement element){
        element.sendKeys(Keys.ENTER);
    }
}
