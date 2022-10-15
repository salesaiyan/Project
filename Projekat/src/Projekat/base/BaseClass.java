package Projekat.base;

import java.io.IOException;
import java.time.Duration;
import Projekat.pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
    public WebDriver driver;
    public TextBoxPage textBoxPage;
    public CheckBoxPage checkBoxPage;
    public LogInPage logInPage;
    public RegistrationPage registrationPage;
    public PracticeFormPage practiceFormPage;
    public RadioButtonsPage radioButtonsPage;
    public ButtonPage buttonPage;
    public WebTablesPage webTablesPage;



    @BeforeClass
    public void setUp() throws IOException {
//        System.setProperty("webdriver.chrome.driver",
//                "C:\\Users\\SaleSaiyan\\Downloads\\chromedriver_win32\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver",
                PropertiesReader.getInstance().getValue("WEBDRIVER.CHROMEDRIVER"));

        driver = new ChromeDriver();
        webTablesPage = new WebTablesPage(driver);
        textBoxPage = new TextBoxPage(driver);
        checkBoxPage = new CheckBoxPage(driver);
        logInPage = new LogInPage(driver);
        registrationPage = new RegistrationPage(driver);
        practiceFormPage = new PracticeFormPage(driver);
        radioButtonsPage = new RadioButtonsPage(driver);
        buttonPage = new ButtonPage(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @AfterClass
    public void close() {
        driver.close();
        driver.quit();
    }
}


