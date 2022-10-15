package Projekat.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Projekat.base.BaseClass;
import java.time.Duration;

public class PracticeFormsTest extends BaseClass {
    final String FIRST_NAME = "Thierry";
    final String LAST_NAME = "Henry";
    final String EMAIL = "thierryhenry@gmail.com";
    final String MOBILE = "0123456789";
    final String CURRENT_ADDRESS = "Paris, France";
    final String STATE = "NCR";
    final String CITY = "Delhi";

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }
    @AfterMethod
    public void deleteCookies() {
        driver.manage().deleteAllCookies();
    }

    // Verify if it is possible to fill in the form with valid credentials.
    @Test
    public void sucessfulFillInForm() throws InterruptedException {
        // Test steps:
        practiceFormPage.fillInFirstNameField(FIRST_NAME);
        practiceFormPage.fillInLastNameField(LAST_NAME);
        practiceFormPage.fillInEmailField(EMAIL);
        practiceFormPage.selectMaleRadioButton();
        practiceFormPage.fillInMobileField(MOBILE);
        practiceFormPage.setDate();
        practiceFormPage.setMonth();
        practiceFormPage.setYear();
        practiceFormPage.setDay();
        practiceFormPage.addSubject();
        practiceFormPage.clickOnSportsCheckbox();
        practiceFormPage.uploadPicture();
        practiceFormPage.fillInCurrentAddressField(CURRENT_ADDRESS);
        practiceFormPage.selectState(STATE);
        practiceFormPage.selectCity(CITY);
        practiceFormPage.clickSubmit();
        practiceFormPage.text();
        practiceFormPage.clickCloseButton();

        Assert.assertEquals(practiceFormPage.text(), "Thanks for submitting the form");
    }
}

