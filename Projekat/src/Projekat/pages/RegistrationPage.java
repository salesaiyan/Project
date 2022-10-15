package Projekat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class RegistrationPage {
    public WebDriver driver;
    public RegistrationPage(WebDriver driver) {
        super();
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath = "//*[@id=\"firstname\"]")
    WebElement getFirstNameField;
    @FindBy(id = "lastname")
    WebElement getLastNameField;
    @FindBy(id = "userName")
    WebElement getUsernameField;
    @FindBy(id = "password")
    WebElement getPasswordField;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[6]/div/div/div/iframe")
    WebElement iFrame;
    @FindBy(xpath = "//*[@id=\"recaptcha-anchor\"]/div[1]")
    WebElement reCaptchaCheckBox;
//    @FindBy(xpath = "//button[contains(text(), 'Register')]")
//    WebElement getRegisterButton;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[7]/div[1]/button")
    WebElement getRegisterButton;

    public void fillFirstNameField (String firstName) {
        this.getFirstNameField.sendKeys(firstName);
    }
    public void fillLastNameField (String lastName) {
        this.getLastNameField.sendKeys(lastName);
    }
    public void fillUserNameField (String userName) {
        this.getUsernameField.sendKeys(userName);
    }
    public void fillPasswordField (String password) {
        this.getPasswordField.sendKeys(password);
    }
    public void checkReChaptchaButton() {
        driver.switchTo().frame(iFrame);
        reCaptchaCheckBox.click();
    }
    public void clickRegisterButton() {
        getRegisterButton.click();
    }
}


