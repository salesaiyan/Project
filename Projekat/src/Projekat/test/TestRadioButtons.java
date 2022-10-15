package Projekat.test;

import Projekat.base.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRadioButtons extends BaseClass {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/radio-button");
    }
    @AfterMethod
    public void deleteCookies() {
        driver.manage().deleteAllCookies();
    }


    @Test
    public void testRadioButtonYes() {
        radioButtonsPage.clickButtonYes();
        Assert.assertTrue(radioButtonsPage.getYesMessage().contains("Yes"), "The element should contain text Yes");
    }

    @Test
    public void testRadioButtonImpressive() {
        radioButtonsPage.clickButtonImpressive();
        Assert.assertTrue(radioButtonsPage.getImpressiveMessage().contains("Impressive"), "The element should contain text Impressive");
    }
    @Test
    public void testRadioButtonNo() {
        radioButtonsPage.clickButtonNo();
        Assert.assertFalse(radioButtonsPage.getNoMessage(), "The element should not be clickable");
    }
}

