package Projekat.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage {
    public WebDriver driver;
    public WebDriverWait wdwait;
    public LogInPage(WebDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(id = "userName")
    WebElement getUsernameField;
    @FindBy(id = "password")
    WebElement getPasswordField;
    @FindBy(id = "login")
    WebElement getLoginButton;
    @FindBy(id = "newUser")
    WebElement getNewUserButton;
    @FindBy(xpath = "//*[@id=\"name\"]")
    WebElement getErrorMessage;
    @FindBy(xpath = "//button[contains(text(), 'Log out')]")
    WebElement logOutButton;

    public void fillUsernameField(String username) {
        this.getUsernameField.click();
        this.getUsernameField.sendKeys(username);
    }

    public void fillPasswordField(String password) {
        this.getPasswordField.click();
        this.getPasswordField.sendKeys(password);
    }
    public void clickOnLogInButton() {
        this.getLoginButton.click();
    }

    public String textInErrorMessage() {
        return this.getErrorMessage.getText();
    }
    public void clickLogOutButton() {
        this.logOutButton.click();
    }

    public String getPageUrl() {
       return driver.getCurrentUrl().toString();
    }
}
