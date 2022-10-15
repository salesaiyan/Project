package Projekat.test;

import Projekat.base.BaseClass;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckBoxTest extends BaseClass {

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/checkbox");
    }
    @AfterMethod
    public void deleteCookies() {
        driver.manage().deleteAllCookies();
    }

    @Test
    public void testCheckBox() {
        checkBoxPage.clickArrows();
        checkBoxPage.clickCheckBox();

        Assert.assertTrue(driver.findElement(By.id("result")).getText().contains("home\n" +
                        "desktop\n" +
                        "notes\n" +
                        "commands\n" +
                        "documents\n" +
                        "workspace\n" +
                        "react\n" +
                        "angular\n" +
                        "veu\n" +
                        "office\n" +
                        "public\n" +
                        "private\n" +
                        "classified\n" +
                        "general\n" +
                        "downloads\n" +
                        "wordFile\n" +
                        "excelFile"),
                "The results should contain all the text");
    }
}

