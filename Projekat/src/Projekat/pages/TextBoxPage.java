package Projekat.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage {
    public WebDriver driver;
    public WebDriverWait wdwait;

    @FindBy(id = "userName")
    WebElement name;
//    @FindBy(xpath = "//input[@id='userName']")
//    WebElement name;
    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement email;
    @FindBy(xpath = "//textarea[@id='currentAddress']")
    WebElement currentAddress;
    @FindBy(xpath = "//textarea[@id='permanentAddress']")
    WebElement permAddress;
    @FindBy(xpath = "//button[@id='submit']")
    WebElement submit;

    public TextBoxPage(WebDriver wd) {
        this.driver = wd;
        PageFactory.initElements(this.driver, this);
    }

    public void inputFullName(String name) {
        this.name.sendKeys(name);
    }
    public void inputEmail(String email) {
        this.email.sendKeys(email);
    }
    public void inputCurrentAddress(String currentAddress) {
        this.currentAddress.sendKeys(currentAddress);
    }
    public void inputPermAddress(String permAddress) {
        this.permAddress.sendKeys(permAddress);
    }
    public void clickSubmit() {
        submit.click();
    }
    public WebElement result() {
        return this.driver.findElement(By.xpath("//div[@id='output']"));
    }
}

