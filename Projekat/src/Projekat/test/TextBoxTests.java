package Projekat.test;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Projekat.base.BaseClass;
import java.time.Duration;

public class TextBoxTests extends BaseClass {
    Faker faker = new Faker();

    @BeforeMethod
    public void pageSetUp() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().window().maximize();
        driver.navigate().to("https://demoqa.com/text-box");
    }
    @AfterMethod
    public void deleteCookies() {
        driver.manage().deleteAllCookies();
    }

    @DataProvider(name = "textBox")
    public Object[][] textBox() {

        return new Object[][] {
                {faker.name().firstName()+ " " +faker.name().lastName(), faker.internet().emailAddress(), faker.address().fullAddress(), faker.address().fullAddress()},
                {faker.name().firstName()+ " " +faker.name().lastName(), faker.internet().emailAddress(),faker.address().fullAddress(), faker.address().fullAddress()},
                {faker.name().firstName()+ " " +faker.name().lastName(), faker.internet().emailAddress(),faker.address().fullAddress(), faker.address().fullAddress()},
                {faker.name().firstName()+ " " +faker.name().lastName(), faker.internet().emailAddress(),faker.address().fullAddress(), faker.address().fullAddress()}
        };
    }
    @Test(dataProvider = "textBox")
    public void testTextBox(String name, String email, String currAddress, String permAddress) {

        textBoxPage.inputFullName(name);
        textBoxPage.inputEmail(email);
        textBoxPage.inputCurrentAddress(currAddress);
        textBoxPage.inputPermAddress(permAddress);
        textBoxPage.clickSubmit();

        Assert.assertTrue(textBoxPage.result().isDisplayed());
    }
}
