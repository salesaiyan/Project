package Projekat.test;

import Projekat.base.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class TestButtons extends BaseClass {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/buttons");
    }

    @AfterMethod
    public void deleteCookies() {
        driver.manage().deleteAllCookies();
    }

    @Test
    public void testDoubleClick() {
        buttonPage.doubleClick();
        Assert.assertEquals(buttonPage.doubleClickText(),"You have done a double click");
    }

    @Test
    public void testRightClick() {
        buttonPage.rightClick();
        Assert.assertEquals(buttonPage.rightClicktext(),"You have done a right click");
    }

    @Test
    public void testClick() {
        buttonPage.click();
        Assert.assertEquals(buttonPage.clickText(),"You have done a dynamic click");
    }
}
