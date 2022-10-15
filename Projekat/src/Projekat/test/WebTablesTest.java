package Projekat.test;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.*;
import Projekat.base.BaseClass;
import java.time.Duration;

public class WebTablesTest extends BaseClass{
    Faker faker = new Faker();
    final String FAKE_FIRST_NAME = faker.name().firstName();
    final String FAKE_LAST_NAME = faker.name().lastName();
    final String FAKE_EMAIL = faker.internet().emailAddress();
    final int FAKE_AGE = faker.number().numberBetween(18,65);
    final int FAKE_SALARY = faker.number().numberBetween(15000, 30000);
    final String DEPARTMANT = "IT";

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/webtables");
    }
    @AfterMethod
    public void deleteCookies() {
        driver.manage().deleteAllCookies();
    }

    @Test
    public void testWebTables() {

        webTablesPage.deleteAllFromTable();
        Assert.assertTrue(webTablesPage.noRows().isDisplayed());

        webTablesPage.clickAddToTable();
        webTablesPage.inputInformation(FAKE_FIRST_NAME, FAKE_LAST_NAME, FAKE_EMAIL, String.valueOf(FAKE_AGE), String.valueOf(FAKE_SALARY), DEPARTMANT);
        webTablesPage.clickSubmit();
        Assert.assertTrue(webTablesPage.getFirstNameText().contains(FAKE_FIRST_NAME));

    }
}
