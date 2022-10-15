package Projekat.test;

import Projekat.base.BaseClass;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest extends BaseClass {

   final String FIRST_NAME = "Sasa";
   final String LAST_NAME = "Prokopijevic";
   final String USER_NAME = "salesaiyan";
   final String PASSWORD = "Sasa12345@";

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/register");
    }
    @AfterMethod
    public void deleteCookies() {
        driver.manage().deleteAllCookies();
    }

    @Test
    public void successfulRegistration() throws InterruptedException {
        registrationPage.fillFirstNameField(FIRST_NAME);
        registrationPage.fillLastNameField(LAST_NAME);
        registrationPage.fillUserNameField(USER_NAME);
        registrationPage.fillPasswordField(PASSWORD);
        // Solve reChaptcha puzzle manually
        registrationPage.checkReChaptchaButton();
        Thread.sleep(10000);
        registrationPage.clickRegisterButton();

        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        alert.accept();
        String expectedMessage = "User Register Successfully.";

        Assert.assertEquals(alertMessage, expectedMessage);

    }
}

