package Projekat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ButtonPage {

    public WebDriver driver;
    public ButtonPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(id = ("doubleClickBtn"))
    WebElement doubleClickButton;
    @FindBy(id = "rightClickBtn")
    WebElement rightClickMeButton;
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/button[1]")
    WebElement clickMeButton;
    @FindBy(id = "doubleClickMessage")
    WebElement doubleClickTextID;
    @FindBy(id = "rightClickMessage")
    WebElement rightClickTextID;
    @FindBy(id = "dynamicClickMessage")
    WebElement clickTextID;

    public void doubleClick() {
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickButton).perform();
    }
    public void rightClick() {
        Actions action = new Actions(driver);
        action.contextClick(rightClickMeButton).perform();
    }
    public void click() {
        Actions action = new Actions(driver);
        action.click(clickMeButton).perform();
    }
    public String doubleClickText() {
        return this.doubleClickTextID.getText();
    }
    public String rightClicktext() {
        return this.rightClickTextID.getText();
    }
    public String clickText() {
        return this.clickTextID.getText();
    }
}

