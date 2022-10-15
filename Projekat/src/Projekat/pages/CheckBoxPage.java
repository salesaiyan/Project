package Projekat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CheckBoxPage {
    public WebDriver driver;
    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/span/button")
    WebElement arrowHome;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li/span/button")
    WebElement arrowDesktop;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[2]/span/button")
    WebElement arrowDocuments;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[2]/ol/li[1]/span/button")
    WebElement arrowWorkSpace;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[2]/ol/li[2]/span/button")
    WebElement arrowOffice;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/ol/li[3]/span/button")
    WebElement arrowDownloads;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div/ol/li/span/label/span")
    WebElement checkBoxHome;

    public void clickArrows() {
        arrowHome.click();
        arrowDesktop.click();
        arrowDocuments.click();
        arrowWorkSpace.click();
        arrowOffice.click();
        arrowDownloads.click();
    }
    public void clickCheckBox() {
        checkBoxHome.click();
    }
}

