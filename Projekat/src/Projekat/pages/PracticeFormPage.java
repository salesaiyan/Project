package Projekat.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.Actions;

public class PracticeFormPage {
    public WebDriver driver;
    public WebDriverWait wdwait;

    public PracticeFormPage(WebDriver driver) {
        super();
        this.driver = driver;
        this.wdwait = new WebDriverWait(driver, 25);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "firstName")
    WebElement getFirstName;
    @FindBy(id = "lastName")
    WebElement getLastName;
    @FindBy(id = "userEmail")
    WebElement getEmail;
    @FindBy(xpath = "//label[contains(text(),'Male')]")
    WebElement getMale;
    @FindBy(id = "userNumber")
    WebElement getMobile;
    @FindBy(id = "dateOfBirthInput")
    WebElement getDateMenu;
    @FindBy(xpath = "//div[@class='react-datepicker__month-container']//select[@class='react-datepicker__month-select']")
    WebElement getMonth;
    @FindBy(xpath = "//div[@class='react-datepicker__month-container']//select[@class='react-datepicker__year-select']")
    WebElement getYear;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/form/div[5]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[4]")
    WebElement getDay;
    @FindBy(id = "subjectsInput")
    WebElement getSubjects;
    @FindBy(xpath = "//*[@id=\"hobbiesWrapper\"]/div[2]/div[1]/label")
    WebElement getSports;
    @FindBy(id = "uploadPicture")
    WebElement getChoosePicture;
    @FindBy(id = "currentAddress")
    WebElement getCurrentAddress;
    @FindBy(id = "react-select-3-input")
    WebElement getSelectState;
    @FindBy(id = "react-select-4-input")
    WebElement getSelectCity;
    @FindBy(xpath = "//button[contains(text(), 'Submit')]")
    WebElement getSubmit;
    @FindBy(id = "example-modal-sizes-title-lg")
    WebElement getText;
    @FindBy(xpath = "//button[contains(text(), 'Close')]")
    WebElement getCloseButton;

    public void fillInFirstNameField(String firstName) {
        this.getFirstName.sendKeys(firstName);
    }
    public void fillInLastNameField(String lastName) {
        this.getLastName.sendKeys(lastName);
    }
    public void fillInEmailField(String email) {
        this.getEmail.sendKeys(email);
    }
    public void selectMaleRadioButton() {
        this.getMale.click();
    }
    public void fillInMobileField(String number) {
        this.getMobile.sendKeys(number);
    }
    public void setDate() throws InterruptedException {
        Actions actions = new Actions(driver);
        getDateMenu.click();
        actions.click(driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select"))).perform();
        Thread.sleep(500);
    }
    public void setMonth() {
        Select monthSelect = new Select(getMonth);
        monthSelect.selectByVisibleText("August");
    }
    public void setYear() {
        Select yearSelect = new Select(getYear);
        yearSelect.selectByValue("1977");
    }
    public void setDay() {
        this.getDay.click();
    }
    public void addSubject() {
        getSubjects.sendKeys("Comp");
        getSubjects.sendKeys(Keys.ARROW_DOWN);
        getSubjects.sendKeys(Keys.ENTER);
    }
    public void clickOnSportsCheckbox() {
        this.getSports.click();
    }
    public void uploadPicture() {
        getChoosePicture.sendKeys("C:\\Users\\SaleSaiyan\\Downloads\\Henry.jpg");
    }
    public void fillInCurrentAddressField(String currAddress) {
        this.getCurrentAddress.sendKeys(currAddress);
    }
    public void selectState(String state) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", this.getSelectState);
        this.wdwait.until(ExpectedConditions.elementToBeClickable(this.getSelectState));
        getSelectState.sendKeys(state);
        getSelectState.sendKeys(Keys.TAB);
    }
    public void selectCity(String city) throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", this.getSelectCity);
        this.wdwait.until(ExpectedConditions.elementToBeClickable(this.getSelectCity));
        getSelectCity.sendKeys(city);
        getSelectCity.sendKeys(Keys.TAB);
    }
    public void clickSubmit() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", this.getSubmit);
        this.wdwait.until(ExpectedConditions.elementToBeClickable(this.getSubmit));
        getSubmit.sendKeys(Keys.ENTER);
    }
    public String text() {
        return this.getText.getText();
    }
    public void clickCloseButton() {
        this.getCloseButton.click();
    }
}

