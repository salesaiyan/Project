package Projekat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTablesPage {
    public WebDriver driver;
    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div/div/div[7]/div/span[2]")
    WebElement deleteFirst;
    @FindBy(xpath = "/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div/div/div")
    WebElement firstNameText;
    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[2]/div[1]")
    WebElement tableRow;
    @FindBy(xpath = "//div[contains(text(),'No rows found')]")
    WebElement noRows;
    @FindBy(xpath = "//button[@id='addNewRecordButton']")
    WebElement addToTable;
    @FindBy(xpath = "//input[@id='firstName']")
    WebElement firstName;
    @FindBy(xpath = "//input[@id='lastName']")
    WebElement lastName;
    @FindBy(xpath = "//input[@id='userEmail']")
    WebElement email;
    @FindBy(xpath = "//input[@id='age']")
    WebElement age;
    @FindBy(xpath = "//input[@id='salary']")
    WebElement salary;
    @FindBy(xpath = "//input[@id='department']")
    WebElement department;
    @FindBy(xpath = "//button[@id='submit']")
    WebElement submitButton;

    public void deleteAllFromTable() {
        deleteFirst.click();
        deleteFirst.click();
        deleteFirst.click();
    }
    public WebElement noRows() {
        return this.noRows;
    }
    public String getFirstNameText() {
       return this.firstNameText.getText();
    }
    public void clickAddToTable() {
        addToTable.click();
    }
    public void inputInformation(String firstName, String lastName, String email, String age, String salary, String department) {
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.email.sendKeys(email);
        this.age.sendKeys(age);
        this.salary.sendKeys(salary);
        this.department.sendKeys(department);
    }
    public void clickSubmit() {
        submitButton.click();
    }
}
