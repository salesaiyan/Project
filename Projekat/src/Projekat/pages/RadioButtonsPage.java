package Projekat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RadioButtonsPage {
    public WebDriver driver;
    public RadioButtonsPage(WebDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath = "//label[contains(text(),'Yes')]")
    WebElement buttonYes;
    @FindBy(xpath = "//label[contains(text(),'Impressive')]")
    WebElement buttonImpressive;
    @FindBy(xpath = "//label[contains(text(),'No')]")
    WebElement buttonNo;
    @FindBy(className = "text-success")
    WebElement buttonYesMessage;
    @FindBy(className = "text-success")
    WebElement buttonImpressiveMessage;
    @FindBy(xpath = "//input[@id='noRadio']")
    WebElement buttonNoMessage;

    public void clickButtonYes() {
        buttonYes.click();
    }
    public void clickButtonImpressive() {
        buttonImpressive.click();
    }
    public void clickButtonNo() {
        buttonNo.click();
    }
    public String getYesMessage() {
        return buttonYesMessage.getText();
    }
    public String getImpressiveMessage() {
        return buttonImpressiveMessage.getText();
    }
    public boolean getNoMessage() {
        this.buttonNoMessage.isEnabled();
        return false;
    }
}

