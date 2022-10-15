package Projekat.test;

import Projekat.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass {
    final String INVALID_USERNAME = "@";
    final String INVALID_PASSWORD = "salesayan123";
    final String VALID_USERNAME = "salesaiyan";
    final String VALID_PASSWORD = "Salesaiyan123@";

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/login");
    }
    @AfterMethod
    public void deleteCookies() {
        driver.manage().deleteAllCookies();
    }

    @Test
    public void LogInWithInvlidUserName() throws InterruptedException {
        logInPage.fillUsernameField(INVALID_USERNAME);
        logInPage.fillPasswordField(VALID_PASSWORD);
        logInPage.clickOnLogInButton();
        Assert.assertEquals(logInPage.textInErrorMessage(), "Invalid username or password!");
    }
    @Test
    public void LogInWithInvlidPassword() throws InterruptedException {
        logInPage.fillUsernameField(VALID_USERNAME);
        logInPage.fillPasswordField(INVALID_PASSWORD);
        logInPage.clickOnLogInButton();
        Assert.assertEquals(logInPage.textInErrorMessage(), "Invalid username or password!");
    }
    @Test
    public void LogInWithValidInput() {
        logInPage.fillUsernameField(VALID_USERNAME);
        logInPage.fillPasswordField(VALID_PASSWORD);
        logInPage.clickOnLogInButton();
        logInPage.getPageUrl();
        logInPage.clickLogOutButton();
        Assert.assertEquals(logInPage.getPageUrl(), "https://demoqa.com/login");
    }
}
