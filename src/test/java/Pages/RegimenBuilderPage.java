package Pages;

import Help.ElementMethods;
import SharedData.SharedData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegimenBuilderPage extends SharedData {

    public WebDriver driver;
    public ElementMethods elementMethods;

    public RegimenBuilderPage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[placeholder='Enter your name']")
    public WebElement nameBar;
    @FindBy(css = "button[class='btn btn-outline-primary regimen-builder__ok']")
    public WebElement okButton;
    @FindBy(xpath = "//*[@id=\"maincontent\"]/div[2]/div[1]/div[3]/div[2]/div[1]/label/div")
    public WebElement answerQ2;
    @FindBy(xpath = "//div[@data-step='3']//div[contains(@class,'checkbox')]//b[text()='B.']/../../div")
    public WebElement answerQ3;
    @FindBy(xpath = "//div[@class='regimen-builder__ticks']//p[text()='1']/../../../../../../../../../..")
    public WebElement answerQ4;
    @FindBy(css = "p[rel='advanced']")
    public WebElement answerQ5;
    @FindBy(xpath = "//input[@value='B']/..")
    public WebElement answerQ6;
    @FindBy(css = "li[data-key='TEXTURE_GEL']")
    public WebElement gel;
    @FindBy(css = "li[data-key='TEXTURE_OIL']")
    public WebElement oil;
    @FindBy(css = "button[data-finish='Finish']")
    public WebElement finishButton;


    public void clickOk(){
        elementMethods.scroll(okButton);
        elementMethods.clickElement(okButton);
    }

    public void fillName(String value){
        elementMethods.fillElement(nameBar, value);
    }

    public void selectAnswer2(){
        elementMethods.clickElement(answerQ2);
    }

    public void selectAnswer3(){
        elementMethods.clickElement(answerQ3);
    }

    public void selectAnswer4(){
        elementMethods.clickElement(answerQ4);
    }

    public void selectAnswer5(){
        elementMethods.clickElement(answerQ5);
    }

    public void selectAnswer6(){
        elementMethods.clickElement(answerQ6);
    }

    public void finishProcess(){
        elementMethods.scroll(finishButton);
        elementMethods.clickElement(finishButton);
    }

}
